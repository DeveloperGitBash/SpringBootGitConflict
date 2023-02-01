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
		System.out.println("11github111");
		System.out.println("22hhhhhhh11166");
		System.out.println("1hhhhhhh1114445");
		return "say hello world1112";
	}
	@GetMapping("/hello1")
	public String getHello222() {
		System.out.println("github3311133313");
		System.out.println("11github111");
		System.out.println("22hhhhhhh11166");
		System.out.println("33hhhhhhh111444");
		return "say hello world1112";
	}
	@GetMapping("/hello32")
	public String getHello323() {
		System.out.println("2github3311131333");
		System.out.println("2github111");
		System.out.println("22hhhhhhh1116677");
		System.out.println("2hhhhhhh111444");
		return "say hello world1112";
	}
	@GetMapping("/hello45")
	public String getHello45() {
		System.out.println("github331113333");
		System.out.println("3github111");
		System.out.println("4hhhhhhh11166");
		System.out.println("5hhhhhhh111445");
		return "say hello world15112";
	}
}
