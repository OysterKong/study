package com.controller;

import java.util.ArrayList;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.dto.TestDTO;

@Controller
public class TestController {

	@RequestMapping(value="/aaa", method=RequestMethod.GET)
	public String aaa() {
		if(true) throw new NullPointerException("널포인트");
		return "main";
	}
	
	@RequestMapping(value="/bbb", method=RequestMethod.GET)
	public String bbb() {
		if(true) throw new ArithmeticException("아리스메틱");
		return "main";
	}
	
	@ExceptionHandler({Exception.class})
	public String errorPage() {
		return "error";
	}
	

	
	
	
	
	
}
