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
public class HNHBlogTable extends HNHBaseTable
{

	public HNHBlogTable(SQLiteDatabase db)
	{
		super(db);
	}

	@Override
	public void onCreateTable()
	{
		try
		{
			String sql = DBContants.CREATE_TABLE + DBContants.BLOG_TABEL_NAME
					+ " ("
					+ DBContants.BLOG_ID + " INTEGER " + DBContants.PRIMARY_KEY + DBContants.AUTOINCREMENT
					+ ","
					+ DBContants.BLOG_USER_ID + " INTEGER "
					+ ","
					+ DBContants.BLOG_TITLE + " TEXT "
					+ ","
					+ DBContants.BLOG_CONTENT + " TEXT "
					+ ","
					+ DBContants.BLOG_TYPE + " INTEGER(2) "
					+ ","
					+ DBContants.BLOG_CREATE_TIME + " INTEGER "
					+ ","
					+ DBContants.BLOG_UPDATE_TIME + " INTEGER "
					+ ");";
			m_db.execSQL(sql);
		}
		catch (Exception e)
		{
		}
	}
	
}
