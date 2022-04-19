package com.controller;

import java.util.ArrayList;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.dto.LoginDTO;


@Controller
public class TestController {
	
	//1. 리턴타입 String => 뷰만 알려줌
	@RequestMapping(value=("/aaa"), method = RequestMethod.GET)
	public String aaa() {
		System.out.println("aaa()함수 실행됨============");
		return "main";  //main.jsp
	}
	
	//1-2. redirect : 매핑주소로 새로운 요청 , 매핑주소의 return 페이지가 응답 페이지가 됨
	@RequestMapping(value="/hhh", method = RequestMethod.GET)
	public String hhh(HttpServletRequest request) {
		System.out.println("hhh()함수 실행됨============");
		request.setAttribute("test", "홍길동");  //전달 안됨
		return "redirect:aaa";  //redirect 시 request.setAttribute 전달이 안됨 ( 반드시 주의할 것 )
	}
	
	//2. ModelAndView => Model 과 뷰를 모두 알려줌
	@RequestMapping(value="/bbb", method = RequestMethod.GET)
	public ModelAndView bbb() {
		System.out.println("bbb()함수 실행됨============");
		ModelAndView mav = new ModelAndView();
		mav.addObject("username", "홍길동");
		mav.setViewName("main2"); //main.jsp
		return mav;  //ModelAndView 리턴
	}
	
	
	//3. 리턴타입 DTO => 모델만 알려줌 , view 는 없으므로 컨테이너가 유추 (ccc.jsp) : url 이 뷰페이지의 이름이 됨
	@RequestMapping(value="/ccc", method = RequestMethod.GET)
	public LoginDTO ccc() {
		System.out.println("/ccc 실행됨============");
		LoginDTO dto = new LoginDTO();
		dto.setUserid("홍길동");
		dto.setPasswd("1234");
		return dto;  // 뷰페이지가 아님, 키값은 소문자 class이름 loginDTO, 뷰페이지 설정 없을 시
	}
	
	//3. 리턴타입 DTO => 모델만 알려줌 , view 는 없으므로 컨테이너가 유추 (ddd.jsp) : url 이 뷰페이지의 이름이 됨
	@RequestMapping(value="/ddd", method = RequestMethod.GET)
	@ModelAttribute("xxx") //키 값은 xxx가 됨
	public LoginDTO xxx2() {
		System.out.println("/ddd 실행됨============");
		LoginDTO dto = new LoginDTO();
		dto.setUserid("홍길동");
		dto.setPasswd("1234");
		return dto;  // 뷰페이지가 아님, 키값은  @ModelAttribute("xxx") // 키값은 xxx가 됨
	}
	
	//4. 리턴타입 ArrayList => 모델만 알려줌 , view 는 없으므로 컨테이너가 유추 (eee.jsp) : url 이 뷰페이지의 이름이 됨
	@RequestMapping(value="/eee", method = RequestMethod.GET)
	@ModelAttribute("yyy") //키 값은 xxx가 됨
	public ArrayList<String> eee() {
		System.out.println("/eee 실행됨============");
		ArrayList<String> list = new ArrayList<String>();
		list.add("홍길동01");
		list.add("홍길동02");
		list.add("홍길동03");
		return list;  // 뷰페이지가 아님, 키값은  @ModelAttribute("yyy") // 키값은 yyy가 됨
	}
	
	//5. void ==> 모델과 뷰를 모두 안알려줌 view fff.jsp
	@RequestMapping(value="/fff", method=RequestMethod.GET)
	public void fff(HttpServletRequest request) {
		request.setAttribute("username", "홍길동");  //키가 username
		System.out.println("/fff====================");
	}
	
	//6. void ==> 모델과 뷰를 모두 안알려줌 view ggg.jsp
	@RequestMapping(value="/ggg", method=RequestMethod.GET)
	public void ggg(Model m) {
		m.addAttribute("username", "홍길동");  //키가 username
		System.out.println("/ggg====================");
	}


	
}
