package com.example.Dockerize;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {
	
	@GetMapping(path = "/hello")
	
	public String sayHello() {
		
		return "Hi All-modify1";
		
	}

}
