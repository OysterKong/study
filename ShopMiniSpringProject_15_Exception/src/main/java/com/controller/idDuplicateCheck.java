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
		//21번쨰 produces="text/plain;charset=UTF-8" 를 지우고  23번쨰에  HttpServletResponse response 를 넣은뒤 25번째 코드를 넣어서 한글처리가 되나 테스트했으나 한글처리 불가능
		System.out.println("idDuplicateCheck DB단 아이디 있는지===" + dto); // null 값이 나오면 db에 없는것, 정보가 찍히면 중복
		System.out.println("idDuplicateCheck 내가 입력한 text 출력===" + userid); // 내가 회원가입 란의 아이디부분에 넣은 데이터가 keyup 이벤트로 찍힘
		String mesg="아이디 사용가능";
		if(dto != null) {
			mesg="아이디 중복";
		}
		return mesg;
	}

	
	
	
	
	
	
}
