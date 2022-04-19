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
		if(true) throw new ArithmeticException("ArithmeticException�߻�=================");
		//Exception �߻� �� main.jsp�� �̵��ȵ�
		return "main";
	}
	
	@RequestMapping(value="/bbb")
	public String bbb() {
		if(true) throw new NullPointerException("NullPointerException�߻�=================");
		//Exception �߻� �� main.jsp�� �̵��ȵ�
		return "main";
	}
	
	
	//ExceptionHandler ������ xml ���� �� �� ( servlet-context.xml �� ���� )
	
//	@ExceptionHandler({ArithmeticException.class, NullPointerException.class})
//	//@ExceptionHandler({Exception.class})
//	public String errorPage() {
//		return "error";  //Exception�� ������ �� error.jsp �� �̵� => Exception ��ü�� ���޵�
//	}

	
}
