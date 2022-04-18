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
	
	@RequestMapping(value="/login2")   // loginForm.jsp에서 action 부분을 login2로 변경하고 테스트
	public String login2(@RequestParam("userid") String id,
			        @RequestParam("passwd")	String pw)	{
		System.out.println("(@RequestParam(\"userid\")"+ id + "@RequestParam(\"passwd\")" + pw);
		return "login";
	}
	
	@RequestMapping(value="/login3") // loginForm.jsp에서 action 부분을 login3로 변경하고 테스트
	public String login3(@RequestParam("userid") String userid,
			@RequestParam("passwd")	String passwd)	{
		System.out.println("(@RequestParam(\"userid\")"+ userid + "@RequestParam(\"passwd\")" + passwd);
		return "login";
	}
	
	@RequestMapping(value="/login4") // loginForm.jsp에서 action 부분을 login4로 변경하고 테스트
	public String login4( String userid, String passwd )	{
		System.out.println("/login4 String userid, String passwd"+ userid + "\t" + passwd);
		return "login";
	}
	
	@RequestMapping(value="/login5") // loginForm.jsp에서 action 부분을 login5로 변경하고 테스트
	public String login5(@RequestParam(required = false, defaultValue="홍길동") //loginForm.jsp 에서 userid 를 막아놓고 테스트 시 기본값 홍길동으로 찍힘
		String userid, String passwd){ //userid = 다른변수사용
		System.out.println("/login5 @RequestParam(required = false, defaultValue=\"홍길동\")"
				+ userid + "\t" + passwd);
		return "login";
	}
	
	@RequestMapping(value="/login6") // loginForm.jsp에서 action 부분을 login6로 변경하고 테스트
	public String login6( @RequestParam Map<String, String> m )	{
		//userid = aaa, passwd = 1234
		System.out.println("/login6 @RequestParam Map<String, String> m"+ m );
		return "login";
	}

}
