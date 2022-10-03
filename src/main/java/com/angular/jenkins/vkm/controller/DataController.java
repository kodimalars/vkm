package com.angular.jenkins.vkm.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.angular.jenkins.vkm.model.Document;
import com.angular.jenkins.vkm.service.DocumentService;

@RestController
@RequestMapping("/data")
public class DataController
{
	@Autowired
	DocumentService docService;

	@PostMapping("/document")
	public Document upload(Document doc)
	{
		String str = "I am kodi";
		str.replace(" ", "");
		return new Document();
	}

	@GetMapping("/document")
	public Document getDocument()
	{
		return new Document();
	}

	@PostMapping("/upload")
	public Document uploadDoc(@RequestBody Document doc)
	{
		List<Document> docList = docService.findByPath(doc.getPath());
		docList.stream().forEach(e -> {
			docService.updateByDocPath(doc.getName(), "new path");
			System.out.println("Koids " + e.toString());
		});

		docService.save(doc);
		return doc;
	}

	@DeleteMapping("/delete/{id}")
	public void deleteDoc(@PathVariable("id") Integer id)
	{
		docService.delete(id);
	}

	@GetMapping("/documents")
	public List<Document> getDocuments()
	{
		return docService.findAll();
	}

	@GetMapping("/name")
	public String getName()
	{
		return "Vivek";
	}
}
