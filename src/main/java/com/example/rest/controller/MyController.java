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
	@GetMapping("/hello66")
	public String getHello66() {

		System.out.println("github33111333333");
		System.out.println("github11133");
		System.out.println("hhhhhhh11133");
		System.out.println("hhhhhhh11144433");
		return "say hello world!!!33";

	}

	@GetMapping("/hello4")
	public String getHello4() {
		System.out.println("github331113333");
		System.out.println("github111");
		System.out.println("hhhhhhh111");
		System.out.println("hhhhhhh111444");
		return "say hello world!!!";
	}
	@GetMapping("/hello5")
	public String getHello5() {
		System.out.println("github331113333");
		System.out.println("github111");
		System.out.println("hhhhhhh111");
		System.out.println("hhhhhhh111444");
		return "say hello world!!!";

	}

	@GetMapping("/hello1")
	public String getHello1() {
		System.out.println("github331113333");
		System.out.println("github111");
		System.out.println("hhhhhhh111");
		System.out.println("hhhhhhh111444");
		return "say hello world!!!";
	}
	@GetMapping("/hello2")
	public String getHello2() {
		System.out.println("github331113333");
		System.out.println("github111");
		System.out.println("hhhhhhh111");
		System.out.println("hhhhhhh111444");
		return "say hello world!!!";
	}
	@GetMapping("/hello3")
	public String getHello3() {

		System.out.println("github33111333333");
		System.out.println("github11133");
		System.out.println("hhhhhhh11133");
		System.out.println("hhhhhhh11144433");
		return "say hello world!!!33";

	}
	@GetMapping("/hello77")
	public String getHello77() {

		System.out.println("github33111333333");
		System.out.println("github11133");
		System.out.println("hhhhhhh11133");
		System.out.println("hhhhhhh11144433");
		return "say hello world!!!33";

	}
}
