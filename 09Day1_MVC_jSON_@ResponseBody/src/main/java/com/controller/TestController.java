package com.controller;

import java.util.ArrayList;
import java.util.HashMap;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.dto.Login;

@Controller //����
public class TestController {
	
	@RequestMapping("/aaa")
	public @ResponseBody Login aaa() {    //@ResponseBody : ���� jsp ���� ���ϵ����͸� �񵿱�� response ����
		System.out.println("aaa() �Լ� ȣ��============");
		Login login = new Login();
		login.setUserid("ȫ�浿");
		login.setPasswd("1234");
		return login;
	}
	
	@RequestMapping("/bbb")
	@ResponseBody
	public ArrayList<Login> bbb() {
		System.out.println("bbb() �Լ� ȣ��============");
		ArrayList<Login> list = new ArrayList<Login>();
		list.add(new Login("ȫ�浿1", "10"));
		list.add(new Login("ȫ�浿2", "20"));
		list.add(new Login("ȫ�浿3", "30"));
		list.add(new Login("ȫ�浿4", "40"));
		return list;
	}
	
	@RequestMapping("/ccc")
	@ResponseBody
	public HashMap<String, ArrayList<Login>> ccc() {
		HashMap<String, ArrayList<Login>> map = new HashMap<String, ArrayList<Login>>();
		ArrayList<Login> list = new ArrayList<Login>();
		list.add(new Login("ȫ�浿1", "10"));
		list.add(new Login("ȫ�浿2", "20"));
		list.add(new Login("ȫ�浿3", "30"));
		ArrayList<Login> list2 = new ArrayList<Login>();
		list2.add(new Login("������1", "10"));
		list2.add(new Login("������2", "20"));
		list2.add(new Login("������3", "30"));
		map.put("one", list);
		map.put("two", list2);
		return map;
	}
	
	@RequestMapping("/ddd")
	@ResponseBody
	public String ddd() {
		return "ok"; // @ResponseBody �� �پ�������  ok.jsp �� �ǹ��ϴ°� �ƴ϶� ok ���ڿ��� �����ϴ� ���̹Ƿ� ��������
	}
	

}
