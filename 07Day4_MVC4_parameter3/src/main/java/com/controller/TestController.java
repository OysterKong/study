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
		list.add("ȫ�浿1");
		list.add("ȫ�浿2");
		list.add("ȫ�浿3");
		list.add("ȫ�浿4");
		ModelAndView mav = new ModelAndView();
		mav.addObject("list", list);  //key list ������
		mav.setViewName("main"); //main.jsp => list�� Ű�� ��
		return mav;
	}
	//Model, HttpServletRequest �� key �� ���� ����
	
	
	@RequestMapping(value=("/bbb"), method=RequestMethod.GET)
	public String xxx2(@ModelAttribute("xxx") ArrayList<String> list) { //request key xxx ��� ����
		list.add("ȫ�浿1");
		list.add("ȫ�浿2");
		list.add("ȫ�浿3");
		list.add("ȫ�浿4");
		// request.setAttribute("xxx", list) �� ����
		return "main2";  //main.jsp
	}
	
}
