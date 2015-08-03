package com.zlw.data;

/**
 * 
 * @author liuqiao
 *
 */
public class HNHDiscussInfo
{
	private int m_discussId = 0;
	
	private int m_userId = 0;
	
	private int m_blogId = 0;
	
	private String m_coment = null;
	
	private long l_createTime = 0;
	
	private long l_updateTime = 0;

	public int getDiscussId()
	{
		return m_discussId;
	}

	public void setDiscussId(int discussId)
	{
		this.m_discussId = discussId;
	}

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

	public String getComent()
	{
		return m_coment;
	}

	public void setComent(String coment)
	{
		this.m_coment = coment;
	}

	public long getCreateTime()
	{
		return l_createTime;
	}

	public void setCreateTime(long createTime)
	{
		this.l_createTime = createTime;
	}

	public long getUpdateTime()
	{
		return l_updateTime;
	}

	public void setUpdateTime(long updateTime)
	{
		this.l_updateTime = updateTime;
	}
	
	
}
