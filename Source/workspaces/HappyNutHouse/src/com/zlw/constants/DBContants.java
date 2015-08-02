package com.zlw.constants;

/**
 * 
 * @author Liuq
 * 
 * @date 20150802
 *
 */
public class DBContants
{
	public static final String USER_TABEL_NAME = "user";
	public static final String PRAISE_TABEL_NAME = "praise";
	public static final String BLOG_TABEL_NAME = "blog";
	public static final String DISCUSS_TABEL_NAME = "discuss";
	
	public static final String CREATE_TABLE = "CREATE TABLE IF NOT EXISTS ";
	public static final String PRIMARY_KEY = " PRIMARY KEY ";
	public static final String AUTOINCREMENT = "AUTOINCREMENT";
	
	//User Table Columns
	public static final String USER_ID = "_id";
	public static final String USER_NAME = "name";
	public static final String USER_SEX = "sex";
	public static final String USER_EMAIL = "email";
	public static final String USER_MOBILE = "mobile";
	
	//Praise Table Columns
	public static final String PRAISE_BLOG_ID = "id";
	public static final String PRAISE_USER_ID = "user_id";
	public static final String PRAISE_ISPRAISED = "is_praised";
	
	//Discuss Table Columns
	public static final String DISCUSS_ID = "id";
	public static final String DISCUSS_USER_ID = "user_id";
	public static final String DISCUSS_BLOG_ID = "blog_id";
	public static final String DISCUSS_COMMENT = "comment";
	public static final String DISCUSS_CREATE_TIME = "create_time";
	public static final String DISCUSS_UPDATE_TIME = "update_time";
	
	//Blog Table Columns
	public static final String BLOG_ID = "id";
	public static final String BLOG_USER_ID = "user_id";
	public static final String BLOG_TYPE = "type";
	public static final String BLOG_CONTENT = "content";
	public static final String BLOG_TITLE = "title";
	public static final String BLOG_CREATE_TIME = "create_time";
	public static final String BLOG_UPDATE_TIME = "update_time";
}
