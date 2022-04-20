package com.controller;


import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.dto.LoginDTO;


@Controller
public class TestMain {
	
	@RequestMapping(value="/login", method = RequestMethod.GET)
	public String login() {
		System.out.println("login - get방식 ================");
		return "loginForm";
	}
	
	@RequestMapping(value="/login", method = RequestMethod.POST)
	public String login(LoginDTO dto) {
		System.out.println("login- Post방식 ================" + dto);
		return "login";
	}
	
	@RequestMapping(value="/login2", method = RequestMethod.POST)
	public String login2(@RequestParam("userid") String id, @RequestParam("passwd") String pw) {
		System.out.println("login2 (@RequestParam String id)"+id+"@RequestParam String pw"+pw);
		return "login";
	}
	
	@RequestMapping(value="/login3")
	public String login3(@RequestParam("userid") String userid, @RequestParam("passwd") String passwd) {
		System.out.println("login3 (@RequestParam String id)"+userid+"@RequestParam String pw"+passwd);
		return "login";
	}
	
	@RequestMapping(value="/login4")
	public String login4( String userid, String passwd) {
		System.out.println("login4 : "+"\t"+userid+"\t"+passwd);
		return "login";
	}
	
	@RequestMapping(value="/login5")
	public String login5( @RequestParam Map<String, String> m) {
		System.out.println("login5 Map방식 : "+"\t"+ m);
		return "login";
	}
	
	@RequestMapping(value="/login6")
	public String login6(@RequestParam(required=false, defaultValue="홍길동") String userid, String passwd) {
		System.out.println("login6 : "+ userid + "\t" + passwd);
		return "login";
	}




}
