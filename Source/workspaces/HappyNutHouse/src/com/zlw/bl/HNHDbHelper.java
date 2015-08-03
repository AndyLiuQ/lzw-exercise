package com.zlw.bl;

import com.zlw.utils.HnhLog;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;

/**
 * 
 * @author Liuq
 * 
 * @date 20150802
 *
 */
public class HNHDbHelper
{
	/**
	 * The tag for log.
	 */
	private final String TAG = "HNHDbHelper";
	
	private HNHSQLiteOpenHelper m_dbHelper = null;
	
	private SQLiteDatabase m_db = null;
	
	public HNHDbHelper(Context context)
	{
		HnhLog.d(TAG, "HNHDbHelper");
		m_dbHelper = new HNHSQLiteOpenHelper(context);
		m_db = m_dbHelper.getWritableDatabase();
		
	}
}
