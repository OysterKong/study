package com.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class TestController {
	
	//servlet-context.xml 에서 /main 요청을 처리하게끔 설정
	
	//servlet-context.xml 에서  /main 처리함
	@RequestMapping("/")
	public String xxx() {
		return "home";  //servlet-context.xml  view : main.jsp
		//controller와 xml 에서 중복으로 같은 주소를 등록 시 controller 것으로 작동 ( 에러표시가 없으니 중복을 잘 피해주자 )
	}
	
	@RequestMapping("/aaa")
	public String main() {
		return "main";
	}

}
