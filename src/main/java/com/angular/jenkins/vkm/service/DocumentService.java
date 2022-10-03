package com.angular.jenkins.vkm.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.angular.jenkins.vkm.model.Document;
import com.angular.jenkins.vkm.repository.DocumentRepo;

@Service
@Transactional
public class DocumentService
{
	@Autowired
	DocumentRepo docRepo;

	public void delete(Integer id)
	{
		this.docRepo.deleteById(id);
	}
	public void save(Document doc)
	{
		this.docRepo.save(doc);
	}

	public List<Document> findAll()
	{
		return this.docRepo.findAll();
	}

	public List<Document> findByPath(String path)
	{
		return this.docRepo.findByPath(path);
	}

	public List<Document> findByName(String name)
	{
		return this.docRepo.findByName(name, Sort.by("name"));
	}

	public void updateByDocPath(String name, String path)
	{
		docRepo.updateByDocPath(path, name);
	}
}
