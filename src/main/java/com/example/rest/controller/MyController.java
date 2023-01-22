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
	@GetMapping("/hello1")
	public String getHello1() {
		System.out.println("github111");
		return "say hello world!!!";
	}
	@GetMapping("/hello33")
	public String getHello3() {
		System.out.println("github111333");
		return "say hello world!!!";
	}

	@GetMapping("/hello1")
	public String getHello2() {
		System.out.println("github111222");
		return "say hello world!!!";
		}
	
	@GetMapping("/hello44")
	public String getHello32() {
		System.out.println("github11144");

		return "say hello world!!!";
	}
	@GetMapping("/hello6")
	public String getHello6() {
		System.out.println("github111222666");
		return "say hello world!!!6666";
		}
}
