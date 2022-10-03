package com.angular.jenkins.vkm.model;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
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

	String documentType;

	@OneToOne(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
	@JoinColumn(name = "document_type_id")
	DocumentType docType;

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

	public String getDocumentType()
	{
		return documentType;
	}

	public void setDocumentType(String documentType)
	{
		this.documentType = documentType;
	}

	public void setId(int id)
	{
		this.id = id;
	}

	public void setSize(int size)
	{
		this.size = size;
	}

	public void setName(String name)
	{
		this.name = name;
	}

	public void setPath(String path)
	{
		this.path = path;
	}

	public DocumentType getDocType()
	{
		return docType;
	}

	public void setDocType(DocumentType docType)
	{
		this.docType = docType;
	}

}
