package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class controller {
	
	@Value("${test01}")
	private String test01;
	
	@GetMapping("/test01")
	public String example01() {
		System.out.println("test01");
		return "Hello World!!";
	}
	
	@GetMapping("/test02")
	public String example02() {
		System.out.println("test02");
		return "GOGOGO!!!!";
	}
	@GetMapping("/test03")
	public String example03() {
		System.out.println("test03 = "+test01);
		return "GOGOGO!!!!";
	}
	
}
