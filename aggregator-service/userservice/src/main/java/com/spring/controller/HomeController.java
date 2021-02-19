package com.spring.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {
	
	@GetMapping("/")
	public String homePage() {
		return "Welcome to Spring Boot Rest Project";
	}
	
	@GetMapping("/getall")
	public String getAll() {
		return "getAll Data";
	}
}
