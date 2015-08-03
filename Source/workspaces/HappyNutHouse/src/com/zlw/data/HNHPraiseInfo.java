package com.zlw.data;

/**
 * 
 * @author liuqiao
 *
 */
public class HNHPraiseInfo
{
	private int m_userId = 0;
	
	private int m_blogId = 0;
	
	private boolean m_isPraise = false;

	public int getUserId()
	{
		return m_userId;
	}

	public void setUserId(int userId)
	{
		this.m_userId = userId;
	}

	public int getBlogId()
	{
		return m_blogId;
	}

	public void setBlogId(int blogId)
	{
		this.m_blogId = blogId;
	}

	public boolean isPraise()
	{
		return m_isPraise;
	}

	public void setPraise(boolean isPraise)
	{
		this.m_isPraise = isPraise;
	}
}
