package com.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class TestController {
	
	//servlet-context.xml ���� /main ��û�� ó���ϰԲ� ����
	
	//servlet-context.xml ����  /main ó����
	@RequestMapping("/")
	public String xxx() {
		return "home";  //servlet-context.xml  view : main.jsp
		//controller�� xml ���� �ߺ����� ���� �ּҸ� ��� �� controller ������ �۵� ( ����ǥ�ð� ������ �ߺ��� �� �������� )
	}
	
	@RequestMapping("/aaa")
	public String main() {
		return "main";
	}

}
