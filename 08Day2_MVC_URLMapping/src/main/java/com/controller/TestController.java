package com.controller;

import java.util.ArrayList;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.dto.LoginDTO;


@Controller
public class TestController {
	
	//0. "/"
	@RequestMapping(value="/", method=RequestMethod.GET)
	public String main() {
		System.out.println( "main ȣ�� ===================");
		return "main";
	}
	
	//1. ���ΰ� �ϳ�
	@RequestMapping(value="/aaa", method=RequestMethod.GET)
	public String aaa() {
		System.out.println( "aaa ȣ�� ===================");
		return "main";
	}
	
	//2. ���ΰ� ������
	@RequestMapping(value= {"/aaa2", "/aaa3" }, method=RequestMethod.GET)
	public String aaa2() {
		System.out.println( "aaa2 ȣ�� ===================");
		return "main";
	}
	
	//3. bbb�� �����ϴ� ��û ( �տ� bbb�� �����ϱ⸸ �ϸ� �ڿ� �������ڰ� ������ ������� ���� )
	@RequestMapping(value="/bbb*", method=RequestMethod.GET)
	public String aaa3() {
		System.out.println( "aaa3 ȣ�� ===================");
		return "main";
	}
	
	//4. *�� �ϳ��� ���ڿ��� �ǹ�  ccc/zzz , ccc/bbb ���� ,   ccc/bbb/zzz - �Ұ���
	@RequestMapping(value="/ccc/*", method=RequestMethod.GET)
	public String aaa4() {
		System.out.println( "aaa4 ȣ�� ===================");
		return "main";
	}
	
	//5.  **�� ������ΰ� �����ϴٴ� ���� �ǹ�,  ddd/zzz,  ddd/zzz/aaa ����
	@RequestMapping(value="/ddd/**", method=RequestMethod.GET)
	public String aaa5() {
		System.out.println( "aaa5 ȣ�� ===================");
		return "main";
	}
	
	
	//6.  **�� ������ΰ� �����ϴٴ� ���� �ǹ�,  eee/kkk/bbb/aaa  �߰����� �������� ��������� ó���� �������� ���ƾ���.
	@RequestMapping(value="/eee/**/aaa", method=RequestMethod.GET)
	public String aaa6() {
		System.out.println( "aaa6 ȣ�� ===================");
		return "main";
	}
	
	//7.  /hhh/abcd/xxx/1234   http://localhost:8077/app/hhh/tester/xxx/1234
	// �ּ�â�� ���� �Է��ϴ� �����͸� hhh ���ڸ��� userid�� xxx ���ڸ��� passwd �� �ν�
	@RequestMapping(value="/hhh/{userid}/xxx/{passwd}", method=RequestMethod.GET)
	public String aaa7(@PathVariable("userid") String userid, @PathVariable("passwd") String passwd) {
		System.out.println( "aaa7 ȣ�� ===================");
		System.out.println(userid+"\t"+passwd);
		return "main";
	}

	
}
