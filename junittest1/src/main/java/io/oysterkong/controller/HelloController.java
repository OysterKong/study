package io.oysterkong.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
	
	@GetMapping("/hello")
	public String hello() {  //http://localhost:8080/hello
		return "Hello Spring Boot~~~!";
	}
	
}
