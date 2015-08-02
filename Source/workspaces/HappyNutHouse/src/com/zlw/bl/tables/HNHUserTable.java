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
public class HNHUserTable extends HNHBaseTable
{
	/**
	 * 
	 * @param db
	 */
	public HNHUserTable(SQLiteDatabase db){
		super(db);
	}
	
	/*
	 * (non-Javadoc)
	 * @see com.zlw.bl.tables.HNHBaseTable#onCreateTable()
	 */
	@Override
	public void onCreateTable()
	{
		try {
			String sql = DBContants.CREATE_TABLE + DBContants.USER_TABEL_NAME 
					+ " ("
					+ DBContants.USER_ID + " INTEGER " + DBContants.PRIMARY_KEY + DBContants.AUTOINCREMENT
					+ ","
					+ DBContants.USER_NAME + " VERCHAR(20) "
					+ ","
					+ DBContants.USER_SEX + " BOOL "
					+ ","
					+ DBContants.USER_EMAIL + " TEXT "
					+ ","
					+ DBContants.USER_MOBILE + " INTEGER(11) "
					+ ");";
			
			m_db.execSQL(sql);
		} catch (Exception e) {
		}
	}
}
