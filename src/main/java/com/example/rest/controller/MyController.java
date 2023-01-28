package com.example.rest.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/welcome")
public class MyController {

	@GetMapping("/hello")
	public String getHello() {
		System.out.println("github331113333");
		System.out.println("github111");
		System.out.println("hhhhhhh111");
		System.out.println("hhhhhhh111444");
		return "say hello world!!!";
	}
	
	@GetMapping("/hello2")
	public String getHello() {
		System.out.println("github331113333");
		
		return "say";
	}
	
}
