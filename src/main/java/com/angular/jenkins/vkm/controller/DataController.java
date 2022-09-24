package com.angular.jenkins.vkm.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.angular.jenkins.vkm.model.Document;

@RestController
@RequestMapping("/data")
public class DataController
{

	@GetMapping("/document")
	public Document getDocument()
	{
		return new Document(1, 1, "one", "one");
	}

	@GetMapping("/documents")
	public List<Document> getDocuments()
	{
		return Arrays.asList(new Document(1, 1, "one", "one"), new Document(2, 2, "two", "two"),
				new Document(3, 3, "three", "three"));
	}

	@GetMapping("/name")
	public String getName()
	{
		return "Vivek";
	}
}
