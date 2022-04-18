package com.controller;

import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;



@Controller
public class TestController {
	
	//Model �Լ��� �Ű������� �ޱ�
	//Model.addAttribute(key/value) = request.setAttribute �� ����
	@RequestMapping(value="/aaa", method=RequestMethod.GET)
	public String xxx(Model m) {
		m.addAttribute("username", "ȫ�浿");  // key value
		return "main";
	}
	
	
	
	@RequestMapping(value="/bbb", method=RequestMethod.GET)
	public String bbb(Map<String, String> map) {
		map.put("address", "����");
		map.put("username", "ȫ�浿");
		return "main2";
	}

	
}
