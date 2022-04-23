package com.controller;


import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.dto.LoginDTO;


@Controller
public class TestController {
	
	@RequestMapping(value="/main", method = RequestMethod.GET)
	public String main() {
		System.out.println("main.jsp �� �̵�============");
		return "main";
	}
	
	@RequestMapping(value=("/login"), method = RequestMethod.GET)
	public String login() {
		System.out.println("login()=====================");
		return "loginForm";
	}
	
//	@RequestMapping(value="/login", method = RequestMethod.POST)
//	public String login(LoginDTO dto, HttpSession session) {
//		LoginDTO mdto = (LoginDTO)session.getAttribute("member");
//		String nextPage="";
//		if (mdto!= null) {
//			if(mdto.getUserid().equals(dto.getUserid())&&
//					mdto.getPasswd().equals(dto.getPasswd())) {
//				session.setAttribute("session", dto);
//				nextPage="logined";
//			} else {
//				System.out.println("id ���� ��ġ���� ����");
//				nextPage="redirect:login";
//			}
//			} else {
//				System.out.println("ȸ������������ �����ϴ�");
//				nextPage="redirect:login";
//			}
//		return nextPage;
//}
	
	
	@RequestMapping(value=("/login"), method = RequestMethod.POST)
	public String login(LoginDTO dto, HttpSession session) {
		LoginDTO mdto = (LoginDTO)session.getAttribute("member");
		System.out.println("/member Post============" + dto);
		String nextPage="";
		if(mdto != null) {
			System.out.println("memberDTO.id : "+ mdto.getUserid());
			if(mdto.getUserid().equals(dto.getUserid())&&
			mdto.getPasswd().equals(dto.getPasswd())
			) { //��������
				session.setAttribute("session", dto);
				nextPage="logined"; //logined.jsp
			} else {
				System.out.println("id�� ����");
				nextPage="redirect:login";  //login get
			  }
			} else {
				System.out.println("ȸ������������ �����ϴ�.");
				nextPage="redirect:login";
			}
		return nextPage;
	}

	
	@RequestMapping(value="/logout")
	public String logout(HttpSession session)	{
		session.invalidate();
		System.out.println("logout ����� ===============");
		return "redirect:main";
	}
	
	@RequestMapping(value="/member", method= RequestMethod.POST)
	public String member1(LoginDTO dto, HttpSession session) {
		System.out.println("member-post���===========");
		session.setAttribute("member", dto);
		return "redirect:login";
	}
	
	@RequestMapping(value="/member", method= RequestMethod.GET)
	public String member2() {
		System.out.println("member-get��� =========");
		return "memberForm";
	}
	

}
