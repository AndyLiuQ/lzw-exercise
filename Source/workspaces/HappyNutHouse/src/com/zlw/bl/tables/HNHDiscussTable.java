package com.zlw.bl.tables;

import com.zlw.constants.DBContants;

import android.database.sqlite.SQLiteDatabase;

/**
 * 
 * @author Liuq
 * 
 * @date 20150802
 *
 */
public class HNHDiscussTable extends HNHBaseTable
{

	public HNHDiscussTable(SQLiteDatabase db)
	{
		super(db);
	}

	@Override
	public void onCreateTable()
	{
		try
		{
			String sql = DBContants.CREATE_TABLE + DBContants.DISCUSS_TABEL_NAME
					+ " ("
					+ DBContants.DISCUSS_ID + " INTEGER " + DBContants.PRIMARY_KEY + DBContants.AUTOINCREMENT
					+ ","
					+ DBContants.DISCUSS_USER_ID + " INTEGER "
					+ ","
					+ DBContants.DISCUSS_BLOG_ID + " INTEGER "
					+ ","
					+ DBContants.DISCUSS_COMMENT + " TEXT "
					+ ","
					+ DBContants.DISCUSS_CREATE_TIME + " INTEGER "
					+ ","
					+ DBContants.DISCUSS_UPDATE_TIME + " INTEGER "
					+ " );";
			m_db.execSQL(sql);
		}
		catch (Exception e)
		{
		}
		
	}
}
