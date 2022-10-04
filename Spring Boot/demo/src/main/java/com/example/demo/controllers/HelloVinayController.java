package com.example.demo.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloVinayController {
	
	@RequestMapping("/")
	public String hello() {
		return "hello vinay";
	}

	
}
