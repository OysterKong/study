package com.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class TestController {
	
	TestService service;
	Person person;
	
	
	//http://localhost:8090/app1/xxx
	@RequestMapping(value="/xxx")
	public String sayEcho() {
		System.out.println(service.xx()+"\t"+person.toString());
		return "login";
	}
	
	
	
	public TestService getService() {
		return service;
	}
	
	public void setService(TestService service) {
		this.service = service;
	}
	
	public Person getPerson() {
		return person;
	}
	
	public void setPerson(Person person) {
		this.person = person;
	}
	
	




}
