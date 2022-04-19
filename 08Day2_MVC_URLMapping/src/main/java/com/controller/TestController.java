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
		System.out.println( "main 호출 ===================");
		return "main";
	}
	
	//1. 매핑값 하나
	@RequestMapping(value="/aaa", method=RequestMethod.GET)
	public String aaa() {
		System.out.println( "aaa 호출 ===================");
		return "main";
	}
	
	//2. 매핑값 여러개
	@RequestMapping(value= {"/aaa2", "/aaa3" }, method=RequestMethod.GET)
	public String aaa2() {
		System.out.println( "aaa2 호출 ===================");
		return "main";
	}
	
	//3. bbb로 시작하는 요청 ( 앞에 bbb로 시작하기만 하면 뒤에 무슨글자가 나오든 상관없이 실행 )
	@RequestMapping(value="/bbb*", method=RequestMethod.GET)
	public String aaa3() {
		System.out.println( "aaa3 호출 ===================");
		return "main";
	}
	
	//4. *는 하나의 문자열을 의미  ccc/zzz , ccc/bbb 가능 ,   ccc/bbb/zzz - 불가능
	@RequestMapping(value="/ccc/*", method=RequestMethod.GET)
	public String aaa4() {
		System.out.println( "aaa4 호출 ===================");
		return "main";
	}
	
	//5.  **는 여러경로가 가능하다는 것을 의미,  ddd/zzz,  ddd/zzz/aaa 가능
	@RequestMapping(value="/ddd/**", method=RequestMethod.GET)
	public String aaa5() {
		System.out.println( "aaa5 호출 ===================");
		return "main";
	}
	
	
	//6.  **는 여러경로가 가능하다는 것을 의미,  eee/kkk/bbb/aaa  중간에는 뭐가오던 상관없으나 처음과 마지막은 같아야함.
	@RequestMapping(value="/eee/**/aaa", method=RequestMethod.GET)
	public String aaa6() {
		System.out.println( "aaa6 호출 ===================");
		return "main";
	}
	
	//7.  /hhh/abcd/xxx/1234   http://localhost:8077/app/hhh/tester/xxx/1234
	// 주소창에 직접 입력하는 데이터를 hhh 뒷자리를 userid로 xxx 뒷자리를 passwd 로 인식
	@RequestMapping(value="/hhh/{userid}/xxx/{passwd}", method=RequestMethod.GET)
	public String aaa7(@PathVariable("userid") String userid, @PathVariable("passwd") String passwd) {
		System.out.println( "aaa7 호출 ===================");
		System.out.println(userid+"\t"+passwd);
		return "main";
	}

	
}
