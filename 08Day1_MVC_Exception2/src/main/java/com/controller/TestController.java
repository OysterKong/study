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

import com.dto.LoginDTO;


@Controller
public class TestController {
	
	@RequestMapping(value="/aaa")
	public String xxx() {
		if(true) throw new ArithmeticException("ArithmeticException발생=================");
		//Exception 발생 후 main.jsp로 이동안됨
		return "main";
	}
	
	@RequestMapping(value="/bbb")
	public String bbb() {
		if(true) throw new NullPointerException("NullPointerException발생=================");
		//Exception 발생 후 main.jsp로 이동안됨
		return "main";
	}
	
	
	//ExceptionHandler 설정을 xml 에서 할 것 ( servlet-context.xml 에 설정 )
	
//	@ExceptionHandler({ArithmeticException.class, NullPointerException.class})
//	//@ExceptionHandler({Exception.class})
//	public String errorPage() {
//		return "error";  //Exception이 잡혔을 때 error.jsp 로 이동 => Exception 객체가 전달됨
//	}

	
}
