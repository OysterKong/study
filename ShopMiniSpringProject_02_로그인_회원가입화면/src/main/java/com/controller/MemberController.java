package com.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.dto.MemberDTO;

@Controller
public class MemberController {
	
	@RequestMapping(value="/memberAdd")
	public String memberAdd(MemberDTO m) {
		System.out.println(m);
		//우선 출력이 되는지만 확인하는 단계, 이후 회원가입 구현 예정
		return "main"; //main.jsp
	}

}
