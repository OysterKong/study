package com.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class SecondController {
	
	@RequestMapping("/kkk2")  //FirstController �� kkk�� ��ġ�� �ȵ� ( �浹�� )
	public String xxx() {
		System.out.println("SecondController.xxx �޼��� ȣ��");
		return "WEB-INF/views/hello.jsp"; 
	
	}
	

}
