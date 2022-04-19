package com.controller;

import java.util.ArrayList;
import java.util.HashMap;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.dto.Login;

@Controller //주의
public class TestController {
	
	@RequestMapping("/aaa")
	public @ResponseBody Login aaa() {    //@ResponseBody : 응답 jsp 없이 리턴데이터를 비동기로 response 응답
		System.out.println("aaa() 함수 호출============");
		Login login = new Login();
		login.setUserid("홍길동");
		login.setPasswd("1234");
		return login;
	}
	
	@RequestMapping("/bbb")
	@ResponseBody
	public ArrayList<Login> bbb() {
		System.out.println("bbb() 함수 호출============");
		ArrayList<Login> list = new ArrayList<Login>();
		list.add(new Login("홍길동1", "10"));
		list.add(new Login("홍길동2", "20"));
		list.add(new Login("홍길동3", "30"));
		list.add(new Login("홍길동4", "40"));
		return list;
	}
	
	@RequestMapping("/ccc")
	@ResponseBody
	public HashMap<String, ArrayList<Login>> ccc() {
		HashMap<String, ArrayList<Login>> map = new HashMap<String, ArrayList<Login>>();
		ArrayList<Login> list = new ArrayList<Login>();
		list.add(new Login("홍길동1", "10"));
		list.add(new Login("홍길동2", "20"));
		list.add(new Login("홍길동3", "30"));
		ArrayList<Login> list2 = new ArrayList<Login>();
		list2.add(new Login("유관순1", "10"));
		list2.add(new Login("유관순2", "20"));
		list2.add(new Login("유관순3", "30"));
		map.put("one", list);
		map.put("two", list2);
		return map;
	}
	
	@RequestMapping("/ddd")
	@ResponseBody
	public String ddd() {
		return "ok"; // @ResponseBody 가 붙어있으면  ok.jsp 를 의미하는게 아니라 ok 문자열을 리턴하는 것이므로 착오말자
	}
	

}
