package com.angular.jenkins.vkm.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.transaction.Transactional;

import lombok.Builder;
import lombok.Data;

@Entity
@Transactional

@Builder
public class DocumentType
{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	Long documentTypeId;

	String type;

	Date createdDate;

	public Long getDocumentTypeId()
	{
		return documentTypeId;
	}

	public void setDocumentTypeId(Long documentTypeId)
	{
		this.documentTypeId = documentTypeId;
	}

	public String getType()
	{
		return type;
	}

	public void setType(String type)
	{
		this.type = type;
	}

	public Date getCreatedDate()
	{
		return createdDate;
	}

	public void setCreatedDate(Date createdDate)
	{
		this.createdDate = createdDate;
	}

}
