package com.zlw.bl;

import com.zlw.bl.tables.HNHBlogTable;
import com.zlw.bl.tables.HNHDiscussTable;
import com.zlw.bl.tables.HNHPraiseTable;
import com.zlw.bl.tables.HNHUserTable;
import com.zlw.utils.HnhLog;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.database.sqlite.SQLiteOpenHelper;
import android.provider.OpenableColumns;

/**
 * 
 * @author Liuq
 * 
 * @date 20150802
 *
 */
public class HNHDbHelper extends SQLiteOpenHelper
{
	/**
	 * The tag for log.
	 */
	private final String TAG = "HNHDbHelper";
	
	/**
	 * The database name.
	 */
	private static final String DB_NAME = "hnhdata.db";
	
	/**
	 * The database version.
	 */
	private static final int m_newVersion = 1;
	
	/**
	 * 
	 */
	private SQLiteDatabase m_sqlDb = null;
	
	/**
	 * 
	 */
	private boolean m_isInitializing = false;
	
	private Context m_context = null;
	
	private String m_dbName = null;
	
	/**
	 * 构造方法
	 * 
	 * @param context
	 */
	public HNHDbHelper(Context context) 
	{
		super(context, DB_NAME, null, m_newVersion);
		m_context = context;
		m_dbName = DB_NAME;
	}

	/**
	 * 
	 */
	@SuppressWarnings("unused")
	@Override
	public void onCreate(SQLiteDatabase db)
	{
		//TODO Create tables.
		HnhLog.d(TAG, "OnCreate");
		HNHUserTable userTable = new HNHUserTable(db);
		HNHBlogTable blogTable = new HNHBlogTable(db);
		HNHDiscussTable discussTable = new HNHDiscussTable(db);
		HNHPraiseTable praiseTable = new HNHPraiseTable(db);
	}

	@Override
	public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion)
	{
		//TODO DB版本升级或者降级
		HnhLog.d(TAG, "onUpgrade");
	}

	@Override
	public synchronized SQLiteDatabase getWritableDatabase()
	{
		if (null != m_sqlDb && m_sqlDb.isOpen() && !m_sqlDb.isReadOnly()) {
			return m_sqlDb;
		}
		
		if (m_isInitializing) {
			throw new IllegalStateException("getWritableDatabase called recursively");
		}
		
		boolean success = false;
		SQLiteDatabase db = null;
		
		try {
			if (null == m_dbName) {
				db = SQLiteDatabase.create(null);
			}
			else
			{
				db = m_context.openOrCreateDatabase(m_dbName, 0, null);
			}
			int oldVersion = db.getVersion();
			if (oldVersion != m_newVersion) {
				db.beginTransaction();
				try {
					if (oldVersion == 0) {
						onCreate(db);
					}
					else
					{
						onUpgrade(db, oldVersion, m_newVersion);
					}
					db.setVersion(m_newVersion);
					db.setTransactionSuccessful();
						
				} finally {
					db.endTransaction();
				}
			}

			onOpen(db);
			success = true;
			return db;
		} finally {
			if (success) {
				if (null != m_sqlDb) {
					try {
						m_sqlDb.close();
					} catch (Exception e) {
						
					}
				}
				m_sqlDb = db;
			}
			else
			{
				if (null != db) {
					db.close();
				}
			}
		}
	}

	@Override
	public synchronized SQLiteDatabase getReadableDatabase() 
	{
		if (null != m_sqlDb && m_sqlDb.isOpen()) {
			return m_sqlDb;
		}
		
		if (m_isInitializing) {
			throw new IllegalStateException("getReadableDatabase called recursively");
		}
		
		try 
		{
			return getWritableDatabase();
		} catch (SQLiteException e)
		{
		}
		
		SQLiteDatabase db = null;
		
		try {
			m_isInitializing = true;
			String path = m_context.getDatabasePath(m_dbName).getPath();
			db = SQLiteDatabase.openDatabase(path, null, SQLiteDatabase.OPEN_READONLY);
			
			if (db.getVersion() != m_newVersion) {
				throw new SQLiteException("Can't upgrade read-only database from version " + db.getVersion() + " to "  
	                    + m_newVersion + ": " + path);  
			}
			
			onOpen(db);
			
			HnhLog.w(TAG, "Opened " + m_dbName + " in read-only mode");
			m_sqlDb = db;
			return m_sqlDb;
			
			
		} finally {
			m_isInitializing = false;
			if (null != db && db != m_sqlDb) {
				db.close();
			}
		}
	}
	
}
