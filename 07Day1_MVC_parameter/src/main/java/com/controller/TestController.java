package com.controller;

import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.dto.LoginDTO;

@Controller
public class TestController {
	
	
	@RequestMapping(value="/login", method = RequestMethod.GET)
	public String login() {
		System.out.println("/login get");
		return "loginForm";
	}
	
	@RequestMapping(value="/login", method = RequestMethod.POST )
	public String login(LoginDTO dto) {
		System.out.println("/login post," + dto);
		return "login";
	}
	
	@RequestMapping(value="/login2")   // loginForm.jsp���� action �κ��� login2�� �����ϰ� �׽�Ʈ
	public String login2(@RequestParam("userid") String id,
			        @RequestParam("passwd")	String pw)	{
		System.out.println("(@RequestParam(\"userid\")"+ id + "@RequestParam(\"passwd\")" + pw);
		return "login";
	}
	
	@RequestMapping(value="/login3") // loginForm.jsp���� action �κ��� login3�� �����ϰ� �׽�Ʈ
	public String login3(@RequestParam("userid") String userid,
			@RequestParam("passwd")	String passwd)	{
		System.out.println("(@RequestParam(\"userid\")"+ userid + "@RequestParam(\"passwd\")" + passwd);
		return "login";
	}
	
	@RequestMapping(value="/login4") // loginForm.jsp���� action �κ��� login4�� �����ϰ� �׽�Ʈ
	public String login4( String userid, String passwd )	{
		System.out.println("/login4 String userid, String passwd"+ userid + "\t" + passwd);
		return "login";
	}
	
	@RequestMapping(value="/login5") // loginForm.jsp���� action �κ��� login5�� �����ϰ� �׽�Ʈ
	public String login5(@RequestParam(required = false, defaultValue="ȫ�浿") //loginForm.jsp ���� userid �� ���Ƴ��� �׽�Ʈ �� �⺻�� ȫ�浿���� ����
		String userid, String passwd){ //userid = �ٸ��������
		System.out.println("/login5 @RequestParam(required = false, defaultValue=\"ȫ�浿\")"
				+ userid + "\t" + passwd);
		return "login";
	}
	
	@RequestMapping(value="/login6") // loginForm.jsp���� action �κ��� login6�� �����ϰ� �׽�Ʈ
	public String login6( @RequestParam Map<String, String> m )	{
		//userid = aaa, passwd = 1234
		System.out.println("/login6 @RequestParam Map<String, String> m"+ m );
		return "login";
	}

}
