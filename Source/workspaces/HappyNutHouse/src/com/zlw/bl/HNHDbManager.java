package com.zlw.bl;

import android.app.Application;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;

/**
 * 
 * @author Liuq
 * 
 * @Date 20150802
 *
 */
public class HNHDbManager
{
	private HNHDbHelper m_dbHaper = null;
	
	private SQLiteDatabase m_db = null;
	
	public HNHDbManager(Context context)
	{
		m_dbHaper = new HNHDbHelper(context);
		m_db = m_dbHaper.getWritableDatabase();
	}
	
	public void createTables()
	{
		
	}
}
