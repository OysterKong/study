package com.controller;

import java.util.Map;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.dto.MemberDTO;
import com.service.MemberService;

@Controller
public class LoginController {
	
	@Autowired
	MemberService service;
	
	@RequestMapping(value="/login")
	public String login(@RequestParam Map<String, String> map, Model model, HttpSession session ) {
		//System.out.println(map);
		MemberDTO dto = service.login(map);
		//System.out.println(dto);
		//회원인경우 = dto가 있는 경우 : 세션에 "login" 키로 dto 저장 -> main으로 이동
		//회원이 아닌 경우 = model에 mesg 로 " 아이디, 비밀번호 없음 " -> loginForm.jsp 로 이동
		if(dto!=null) {
			session.setAttribute("login", dto);
			return "main";
		} else {
			model.addAttribute("mesg", "아이디 또는 비밀번호가 잘못되었습니다.");
			return "loginForm";
		}
		
	}

}
