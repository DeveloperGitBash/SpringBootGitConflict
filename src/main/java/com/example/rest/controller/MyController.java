package com.example.rest.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/welcome")
public class MyController {

	@GetMapping("/hello")
	public String getHello() {
		System.out.println("github3311133331");
		System.out.println("github111");
		System.out.println("hhhhhhh11166");
		System.out.println("hhhhhhh1114445");
		return "say hello world1112";
	}
	@GetMapping("/hello1")
	public String getHello2() {
		System.out.println("github3311133313");
		System.out.println("github111");
		System.out.println("hhhhhhh11166");
		System.out.println("hhhhhhh111444");
		return "say hello world1112";
	}
	@GetMapping("/hello3")
	public String getHello3() {
		System.out.println("github3311131333");
		System.out.println("github111");
		System.out.println("hhhhhhh1116677");
		System.out.println("hhhhhhh111444");
		return "say hello world1112";
	}
	@GetMapping("/hello4")
	public String getHello4() {
		System.out.println("github331113333");
		System.out.println("github111");
		System.out.println("hhhhhhh11166");
		System.out.println("hhhhhhh111445");
		return "say hello world1112";
	}
}
