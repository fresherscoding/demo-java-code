package com.example;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class simpleRestApi {
	
	@RequestMapping("/")
	public String Show () {
		return "Hello Kalyani";
	}
}
