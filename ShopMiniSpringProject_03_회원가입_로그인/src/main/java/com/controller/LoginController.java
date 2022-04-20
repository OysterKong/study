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
		//ȸ���ΰ�� = dto�� �ִ� ��� : ���ǿ� "login" Ű�� dto ���� -> main���� �̵�
		//ȸ���� �ƴ� ��� = model�� mesg �� " ���̵�, ��й�ȣ ���� " -> loginForm.jsp �� �̵�
		if(dto!=null) {
			session.setAttribute("login", dto);
			return "main";
		} else {
			model.addAttribute("mesg", "���̵� �Ǵ� ��й�ȣ�� �߸��Ǿ����ϴ�.");
			return "loginForm";
		}
		
	}

}
