package com.angular.jenkins.vkm.model;

public class Document
{
	int id;
	int size;
	String name;
	String path;

	public Document()
	{
	}

	public Document(int id, int size, String name, String path)
	{
		this.id = id;
		this.name = name;
		this.path = path;
		this.size = size;
	}

	public int getId()
	{
		return id;
	}

	public void setId(int id)
	{
		this.id = id;
	}

	public int getSize()
	{
		return size;
	}

	public void setSize(int size)
	{
		this.size = size;
	}

	public String getName()
	{
		return name;
	}

	public void setName(String name)
	{
		this.name = name;
	}

	public String getPath()
	{
		return path;
	}

	public void setPath(String path)
	{
		this.path = path;
	}

}
