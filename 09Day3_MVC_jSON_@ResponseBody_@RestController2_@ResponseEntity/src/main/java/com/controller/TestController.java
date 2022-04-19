package com.controller;

import java.util.ArrayList;
import java.util.HashMap;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.dto.Login;


//DTO �� @JsonIgnore �� �ɹ������� �޾��ָ� front ������ ������ ����� �ȵ�

//@RestController   // ��� �ּ�ó�� ������  @RestController �� �ڵ� ó����  , ������ @ResponseBody �� �ʿ䰡 ���� ( �񵿱�ó�� �� �κи� ��Ƽ� �޾��ִ°� ȿ���� )
@Controller //����
public class TestController {
	
	@RequestMapping("/aaa")
	@ResponseBody
	public Login aaa() {    //@ResponseBody : ���� jsp ���� ���ϵ����͸� �񵿱�� response ����
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
	
	//  ddd�� @ResponseBody �� �Ⱦ��� ResponseEntity<> �� ����ؾ���  ,but @ResponseBody �� ����
	@RequestMapping("/ddd")  //���ڿ��� �����͸� �ް� �� home.jsp�� �ƴ�
	public ResponseEntity<Login> ddd(){
		System.out.println("ddd ȣ���===");
		Login login = new Login("������", "20");
		ResponseEntity<Login> entity = ResponseEntity.status(200).body(login); //200 ����ó��
		return entity;  // entity ��ü�� ���°� body �߰� 200���� body�� �߰�
	}
	
	
	@RequestMapping("/eee")
	@ResponseBody
	public String eee() {
		return "hello"; // @ResponseBody �� �پ�������  hello.jsp �� �ǹ��ϴ°� �ƴ϶� hello ���ڿ��� �����ϴ� ���̹Ƿ� ��������
	}
	

}
