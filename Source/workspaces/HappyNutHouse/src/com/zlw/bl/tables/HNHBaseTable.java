package com.zlw.bl.tables;

import android.database.sqlite.SQLiteDatabase;


/**
 * 
 * @author Liuq
 *
 * @date 20150802
 * 
 */
public class HNHBaseTable
{
	public SQLiteDatabase m_db = null;
	
	/**
	 * 
	 * @param db
	 */
	public HNHBaseTable(SQLiteDatabase db)
	{
		m_db = db;
		onCreateTable();
	}

	public void onCreateTable()
	{
		//TODO¡¡Create Table.
	}
}
