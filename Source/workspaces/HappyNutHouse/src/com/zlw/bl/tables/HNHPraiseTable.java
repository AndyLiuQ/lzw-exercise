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
public class HNHPraiseTable extends HNHBaseTable
{
	public HNHPraiseTable(SQLiteDatabase db)
	{
		super(db);
	}

	/*
	 * (non-Javadoc)
	 * @see com.zlw.bl.tables.HNHBaseTable#onCreateTable()
	 */
	@Override
	public void onCreateTable()
	{
		try
		{
			String sql = DBContants.CREATE_TABLE + DBContants.PRAISE_TABEL_NAME 
					+ " ("
					+ DBContants.PRAISE_USER_ID + " INTEGER"
					+ ","
					+ DBContants.PRAISE_BLOG_ID + " INTEGER"
					+ ","
					+ DBContants.PRAISE_ISPRAISED + " BOOL"
					+ ","
					+ DBContants.PRIMARY_KEY + "(" + DBContants.PRAISE_BLOG_ID + ", " + DBContants.PRAISE_USER_ID + ")"
					+ " );";
			m_db.execSQL(sql);
		}
		catch (Exception e)
		{
		}
	}
}
