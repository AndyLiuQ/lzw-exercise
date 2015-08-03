package com.zlw.data;

/**
 * 
 * @author liuqiao
 *
 */
public class HNHUserInfo
{
	private int m_userId = 0;
	private String m_name = null;
	private String m_email = null;
	private boolean is_boy = true;
	private int m_mobile = 0;

	public int getUserId()
	{
		return m_userId;
	}

	public void setUserId(int id)
	{
		this.m_userId = id;
	}
	
	public String getName()
	{
		return m_name;
	}

	public void setName(String name)
	{
		this.m_name = name;
	}

	public String getEmail()
	{
		return m_email;
	}

	public void setEmail(String email)
	{
		this.m_email = email;
	}

	public boolean isBoy()
	{
		return is_boy;
	}

	public void setIsBoy(boolean isBoy)
	{
		this.is_boy = isBoy;
	}

	public int getMobile()
	{
		return m_mobile;
	}

	public void setMobile(int mobile)
	{
		this.m_mobile = mobile;
	}

}
