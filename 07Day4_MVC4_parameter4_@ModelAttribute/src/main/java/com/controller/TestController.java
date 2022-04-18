package com.controller;

import java.util.ArrayList;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;



@Controller
public class TestController {
	
	@ModelAttribute("xxx")  //1. 리턴되는 객체에 xxx 키 값 부여함, 이 객체를 다른 함수에서 사용할 수 있음
	public ArrayList<String> getList(){
		System.out.println("getList()=====================");
		ArrayList<String> list = new ArrayList<String>();
		list.add("홍길동1");
		list.add("홍길동2");
		list.add("홍길동3");
		list.add("홍길동4");
		return list;
	}
	                               //aaa를 호출하면 자동으로 aaa가 getList를 호출 ( 자동으로 list에 값을 담음 )
	@RequestMapping(value="/aaa")
	public String aaa(@ModelAttribute("xxx") ArrayList<String> list) {  // "xxx" 리스트를 매개변수로 받아서 사용
		System.out.println("aaa 추가 요청 작업");
		list.add("aaaa");
		return "main2";
	}
    								//bbb를 호출하면 자동으로 bbb가 getList를 호출 ( 자동으로 list에 값을 담음 )
	@RequestMapping(value="/bbb")
	public String bbb(@ModelAttribute("xxx") ArrayList<String> list) {  // "xxx" 리스트를 매개변수로 받아서 사용
		System.out.println("bbb 추가 요청 작업");
		list.add("bbbb");
		return "main2";
	}

	
}
