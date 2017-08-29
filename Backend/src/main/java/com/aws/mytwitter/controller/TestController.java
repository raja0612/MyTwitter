package com.aws.mytwitter.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.aws.mytwitter.entity.Test;
import com.aws.mytwitter.repository.TestRepository;

@Controller
public class TestController {
	
	@Autowired
	private TestRepository testRepository;
	
	@GetMapping("/test")
	public @ResponseBody String test(){
		
		return "Hello World";
		
	}
	
	@GetMapping("/insert")
	public void insertTestRecords(){
		  Test test1 = new Test();
		  test1.setName("Test 1");
		  testRepository.save(test1);
		  
		  
		  Test test2 = new Test();
		  test2.setName("Test 2");
		  testRepository.save(test2);
		 
	}
	
	@GetMapping("/testRecords")
	public @ResponseBody List<Test> getTestRecords(){
		
		return testRepository.findAll();
				
		
	}
	
	
	

}
