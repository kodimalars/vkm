package com.angular.jenkins.vkm.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;

import lombok.Builder;
import lombok.Data;

@Data
@Entity
@Builder
public class Document
{
	@Id
	@SequenceGenerator(sequenceName = "doc_sequence", initialValue = 1, name = "doc_sequence")
	@GeneratedValue(generator = "doc_sequence", strategy = GenerationType.SEQUENCE)
	int id;

	int size;

	String name;

	String path;

	public int getId()
	{
		return id;
	}

	public int getSize()
	{
		return size;
	}

	public String getName()
	{
		return name;
	}

	public String getPath()
	{
		return path;
	}

}
