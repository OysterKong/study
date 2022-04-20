package com.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class TestMain {
	
	@Autowired
	TestService service;
	@Autowired
	Person person;
	
	@RequestMapping(value="/test")
	public String jj() {
		
		System.out.println(service.aa()+"\t"+person.toString());
		return "login";
	}

	public TestMain() {
		super();
		// TODO Auto-generated constructor stub
	}

	public TestMain(TestService service, Person person) {
		super();
		this.service = service;
		this.person = person;
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
