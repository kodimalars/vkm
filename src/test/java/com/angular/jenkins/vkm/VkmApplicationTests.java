package com.angular.jenkins.vkm;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.angular.jenkins.vkm.controller.DataController;
import com.angular.jenkins.vkm.model.Document;

@SpringBootTest
class VkmApplicationTests
{
	@Autowired
	DataController dataController;

	@Test
	void contextLoads()
	{
		Document doc = new Document();
		dataController.upload(doc);

	}
	
	

}
