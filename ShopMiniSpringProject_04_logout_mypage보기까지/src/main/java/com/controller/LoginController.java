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
			session.setAttribute("login", dto);  // 아이디 정보가 있을 때 login 키로 dto (회원정보)를 넣어 interceptor 에서 활용
			return "main";
		} else {
			model.addAttribute("mesg", "아이디 또는 비밀번호가 잘못되었습니다.");
			return "loginForm";
		}
		
	}
	
	@RequestMapping(value="loginCheck/logout")
	public String logout(HttpSession session) {
		session.invalidate();
		return "redirect:../";  // .xml에 설정 main.jsp../ 이용하여 /loginCheck 의 상위주소로 이동 ( 회원전용페이지는 ../ 이 꼭들어가야함 )
		//회원전용 페이지는 servlet-context.xml 에 주소 등록 후 이동해 주소를 사용함
		//return "../";   // 이렇게하면 로그아웃시 loginCheck/logout 부분이 주소에 전부 남아서 오류가 남음 ( 불가능 )
		//return "main"; //main.jsp  , 이렇게하면 로그아웃시 loginCheck/ 부분이 주소에 남아서 오류가 남음 ( 불가능 )
		//return "../main"; ( 불가능 )
	}

}
