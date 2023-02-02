package com.example.rest.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/welcome")
public class MyController {

	@GetMapping("/hello")
	public String getHello1() {
		System.out.println("github331221133331");
		System.out.println("github1111111");
		System.out.println("22hhhhhhh11166");
		return "say hello";
	}
	@GetMapping("/hello2")
	public String getHello2() {
		System.out.println("github331221133331");
		System.out.println("github2222222");
		System.out.println("22hhhhhhh11166");
		return "say hello2";
	}
}
