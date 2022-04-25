package com.controller;

import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.dto.MemberDTO;
import com.service.MemberService;

@Controller
public class idDuplicateCheck {
	
	@Autowired
	MemberService service;
	
	@ExceptionHandler({Exception.class})
	public String errorPage() {
		return "error/error"; // error.error.jsp
	}
	
	@RequestMapping(value="idDuplicateCheck", produces="text/plain;charset=UTF-8")
	@ResponseBody
	public String idDuplicateCheck(@RequestParam("id") String userid) throws Exception {
		MemberDTO dto = service.myPage(userid);
		//response.setContentType("text/html;charset=UTF-8");  
		//21���� produces="text/plain;charset=UTF-8" �� �����  23������  HttpServletResponse response �� ������ 25��° �ڵ带 �־ �ѱ�ó���� �ǳ� �׽�Ʈ������ �ѱ�ó�� �Ұ���
		System.out.println("idDuplicateCheck DB�� ���̵� �ִ���===" + dto); // null ���� ������ db�� ���°�, ������ ������ �ߺ�
		System.out.println("idDuplicateCheck ���� �Է��� text ���===" + userid); // ���� ȸ������ ���� ���̵�κп� ���� �����Ͱ� keyup �̺�Ʈ�� ����
		String mesg="���̵� ��밡��";
		if(dto != null) {
			mesg="���̵� �ߺ�";
		}
		return mesg;
	}

	
	
	
	
	
	
}
