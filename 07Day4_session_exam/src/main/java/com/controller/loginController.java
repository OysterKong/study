package com.controller;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.dto.loginDTO;

@Controller
public class loginController {
	
	@RequestMapping(value=("/login"), method = RequestMethod.GET)
	public String login() {
		System.out.println("login()=====================");
		return "loginForm";
	}
	
	@RequestMapping(value=("/login"), method = RequestMethod.POST)
	public String login(loginDTO dto, HttpSession session) {
		loginDTO mdto = (loginDTO)session.getAttribute("member");
		System.out.println("/member Post============" + dto);
		String nextPage="";
		if(mdto != null) {
			System.out.println("memberDTO.id : "+ mdto.getUserid());
			if(mdto.getUserid().equals(dto.getUserid())&&
			mdto.getPasswd().equals(dto.getPasswd())
			) { //인증성공
				session.setAttribute("session", dto);
				nextPage="logined"; //logined.jsp
			} else {
				System.out.println("id가 없음");
				nextPage="redirect:login";  //login get
			  }
			} else {
				System.out.println("회원가입정보가 없습니다.");
				nextPage="redirect:login";
			}
		return nextPage;
	}
	
	@RequestMapping(value=("/logout"), method = RequestMethod.GET)
	public String logout(HttpSession session) {
		session.invalidate();
		System.out.println("session.invalidate()실행=====================");
		return "redirect:login";
	}
	
	@RequestMapping(value=("/main"), method = RequestMethod.GET)
	public String main() {
		System.out.println("main.jsp ================");
		return "main";
	}
	
	@RequestMapping(value=("/member"), method = RequestMethod.GET)
	public String memberJoin() {
		System.out.println("/member get=============");
		return "memberForm";  // /memberForm.jsp
	}
	
	@RequestMapping(value=("/member"), method = RequestMethod.POST)
	public String memberJoin(loginDTO dto, HttpSession session) {
		System.out.println("/member Post============" + dto);
		session.setAttribute("member", dto);
		return "redirect:login";  //   /login 을 찾아감 ( get방식 )
	}
	
}
