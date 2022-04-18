package com.controller;

import java.util.ArrayList;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;



@Controller
public class TestController {
	
	@ModelAttribute("xxx")  //1. ���ϵǴ� ��ü�� xxx Ű �� �ο���, �� ��ü�� �ٸ� �Լ����� ����� �� ����
	public ArrayList<String> getList(){
		System.out.println("getList()=====================");
		ArrayList<String> list = new ArrayList<String>();
		list.add("ȫ�浿1");
		list.add("ȫ�浿2");
		list.add("ȫ�浿3");
		list.add("ȫ�浿4");
		return list;
	}
	                               //aaa�� ȣ���ϸ� �ڵ����� aaa�� getList�� ȣ�� ( �ڵ����� list�� ���� ���� )
	@RequestMapping(value="/aaa")
	public String aaa(@ModelAttribute("xxx") ArrayList<String> list) {  // "xxx" ����Ʈ�� �Ű������� �޾Ƽ� ���
		System.out.println("aaa �߰� ��û �۾�");
		list.add("aaaa");
		return "main2";
	}
    								//bbb�� ȣ���ϸ� �ڵ����� bbb�� getList�� ȣ�� ( �ڵ����� list�� ���� ���� )
	@RequestMapping(value="/bbb")
	public String bbb(@ModelAttribute("xxx") ArrayList<String> list) {  // "xxx" ����Ʈ�� �Ű������� �޾Ƽ� ���
		System.out.println("bbb �߰� ��û �۾�");
		list.add("bbbb");
		return "main2";
	}

	
}
