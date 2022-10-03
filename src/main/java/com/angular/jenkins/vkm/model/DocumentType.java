package com.angular.jenkins.vkm.model;

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Embeddable
@Data
@Table(name = "document_type")
@AttributeOverrides({
	@AttributeOverride(name="type", column=@Column(name="doc_type")),
	@AttributeOverride(name="path", column=@Column(name="doc_path"))
})
public class DocumentType
{
	@Id
	int id;

	String type;

	String path;
}
