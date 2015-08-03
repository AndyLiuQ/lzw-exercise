package com.zlw.bl;

import android.content.Context;

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
	
	public HNHDbManager(Context context)
	{
		m_dbHaper = new HNHDbHelper(context);
	}
}
