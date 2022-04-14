package com.spring;

import org.springframework.context.support.GenericXmlApplicationContext;

import com.bean.EchoBean;
import com.service.OneService;
import com.service.TwoService;

public class EchoBeanTest {

	public static void main(String[] args) {
		
		
		GenericXmlApplicationContext ctx = new GenericXmlApplicationContext("classpath:echo.xml");
		
		EchoBean service = ctx.getBean("echoBean", EchoBean.class);
		//소문자 클래스 이름
		
		OneService one = service.getOne();
		TwoService two = service.getTwo();
		one.one();
		two.two();

	}

}
