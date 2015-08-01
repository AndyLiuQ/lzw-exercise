package com.zlw.utils;

import android.util.Log;

/**
 * 
 * @author Liuq
 * 
 * @date 20150801
 *
 */
public class HnhLog
{
	private static boolean isDebug = true;
	
	private static boolean isError = false;
	
	private static boolean isInfo = false;
	
	private static boolean isWarning = false;
	
	private static boolean isVerbose = false;

	/**
	 * Output debug log.
	 * 
	 * @param tag The tag for log.
	 * @param msg The message for log.
	 */
	public static void d(String tag, String msg)
	{
		if(isDebug)
		{
			Log.d(tag, msg);
		}
	}

	/**
	 * Output error log.
	 * 
	 * @param tag The tag for log.
	 * @param msg The message for log.
	 */
	public static void e(String tag, String msg)
	{
		if(isError)
		{
			Log.e(tag, msg);
		}
	}

	/**
	 * Output info log.
	 * 
	 * @param tag The tag for log.
	 * @param msg The message for log.
	 */
	public static void i(String tag, String msg)
	{
		if(isInfo)
		{
			Log.i(tag, msg);
		}
	}

	/**
	 * Output warning log.
	 * 
	 * @param tag The tag for log.
	 * @param msg The message for log.
	 */
	public static void w(String tag, String msg)
	{
		if(isWarning)
		{
			Log.w(tag, msg);
		}
	}
	
	/**
	 * Output verbose log.
	 * 
	 * @param tag The tag for log.
	 * @param msg The message for log.
	 */
	public static void v(String tag, String msg)
	{
		if(isVerbose)
		{
			Log.v(tag, msg);
		}
	}
	
}
