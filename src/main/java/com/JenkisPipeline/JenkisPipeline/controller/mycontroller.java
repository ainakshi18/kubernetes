package com.JenkisPipeline.JenkisPipeline.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping
public class mycontroller {
	
	@GetMapping("/api/{id}")
	public String GreetingController(@PathVariable String id){
		String ans = id + "Welcome to the Jenkins Pipeline";
		return ans;
	}

}
