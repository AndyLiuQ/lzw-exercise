package com.zlw.data;

/**
 * 
 * @author liuqiao
 *
 */
public class HNHBlogInfo
{
	private int m_blogId = 0;
	
	private int m_userId = 0;
	
	private int m_blogType = 0;
	
	private String m_content = null;
	
	private String m_title = null;
	
	private long l_createTime = 0;
	
	private long l_updateTime = 0;

	public int getBlogId()
	{
		return m_blogId;
	}

	public void setBlogId(int blogId)
	{
		this.m_blogId = blogId;
	}

	public int getUserId()
	{
		return m_userId;
	}

	public void setUserId(int userId)
	{
		this.m_userId = userId;
	}

	public int getBlogType()
	{
		return m_blogType;
	}

	public void setBlogType(int blogType)
	{
		this.m_blogType = blogType;
	}

	public String getContent()
	{
		return m_content;
	}

	public void setContent(String content)
	{
		this.m_content = content;
	}

	public String getTitle()
	{
		return m_title;
	}

	public void setTitle(String title)
	{
		this.m_title = title;
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
