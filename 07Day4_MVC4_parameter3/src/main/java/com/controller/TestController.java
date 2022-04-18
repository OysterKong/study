package com.controller;

import java.util.ArrayList;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;


@Controller
public class TestController {
	
	@RequestMapping(value=("/aaa"), method=RequestMethod.GET)
	public ModelAndView xxx(ArrayList<String> list) {
		list.add("홍길동1");
		list.add("홍길동2");
		list.add("홍길동3");
		list.add("홍길동4");
		ModelAndView mav = new ModelAndView();
		mav.addObject("list", list);  //key list 사용권장
		mav.setViewName("main"); //main.jsp => list가 키가 됨
		return mav;
	}
	//Model, HttpServletRequest 에 key 값 지정 설정
	
	
	@RequestMapping(value=("/bbb"), method=RequestMethod.GET)
	public String xxx2(@ModelAttribute("xxx") ArrayList<String> list) { //request key xxx 사용 권장
		list.add("홍길동1");
		list.add("홍길동2");
		list.add("홍길동3");
		list.add("홍길동4");
		// request.setAttribute("xxx", list) 와 동일
		return "main2";  //main.jsp
	}
	
}
