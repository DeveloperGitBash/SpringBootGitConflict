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
	@GetMapping("/hello1000")
	public String getHello000() {
		System.out.println("github110001");
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
	@GetMapping("/hello5")
	public String getHello23() {
		System.out.println("github111222555");
		return "say hello world!!!";

		}
	@GetMapping("/hello8888")
	public String getHello2388() {
		System.out.println("github111222555888");
		return "say hello world!!!";

		}
	@GetMapping("/hello777")
	public String getHello27() {
		System.out.println("github1112225557777");
		return "say hello world!!!";
		}
	@GetMapping("/hello5999")
	public String getHello23999() {
		System.out.println("github111222555999");
		return "say hello world!!!";

		}

		
	@GetMapping("/helloddd")
	public String getHello23sss() {
		System.out.println("github111222555sss999");
		return "say hello world!!!";

	}
	@GetMapping("/hello59991010")
	public String getHello210101() {
		System.out.println("github111222101010");

		return "say hello world!!!";

		}
	
	
	
	
	
	
	
	
	@GetMapping("/hello59991010yyyy")
	public String getHello210101yyy() {
		System.out.println("github111222101010yyy");

		return "say hello world!!!";

		}
}
