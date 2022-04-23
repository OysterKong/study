package com.controller;

import java.util.ArrayList;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.dto.LoginDTO;

@Controller
public class TestController {
	
	@ModelAttribute("gg")
	public ArrayList<String> getList() {
		ArrayList<String> list = new ArrayList<String>();
		list.add("ȫ�浿");
		list.add("�̼���");
		list.add("������");
		return list;
		
	}
	
	@RequestMapping(value="/user2")
	public String addList2(@ModelAttribute("gg") ArrayList<String> list) {
		System.out.println("list �߰�");
		list.add("������");
		list.add("�����");
		list.add("����");
		return "main2";
	}
	
	@RequestMapping(value="/user3")
	public String addList3(@ModelAttribute("gg") ArrayList<String> list) {
		System.out.println("list �߰�");
		list.add("������");
		list.add("�ֳ���");
		list.add("�輺��");
		return "main2";
	}

}
