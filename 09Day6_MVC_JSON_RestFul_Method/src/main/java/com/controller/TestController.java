package com.controller;

import java.util.ArrayList;
import java.util.HashMap;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.dto.Login;



@Controller
public class TestController {
	
	@RequestMapping(value="/board", method=RequestMethod.GET)
	public String get() {
		System.out.println("get============================");
		return "main"; //home.jsp
	}
	
	@RequestMapping(value="/board", method=RequestMethod.POST)
	public String post() {
		System.out.println("post============================");
		return "main"; //home.jsp
	}
	
	@RequestMapping(value="/board", method=RequestMethod.PUT)
	public String put() {
		System.out.println("put============================");
		return "main"; //home.jsp
	}
	
	@RequestMapping(value="/board", method=RequestMethod.DELETE)
	public String delete() {
		System.out.println("delete============================");
		return "main"; //home.jsp
	}
	

	

}
