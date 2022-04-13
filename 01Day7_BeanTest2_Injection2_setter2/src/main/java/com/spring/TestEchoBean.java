package com.spring;

import org.springframework.context.support.GenericXmlApplicationContext;

public class TestEchoBean {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		GenericXmlApplicationContext ctx = new GenericXmlApplicationContext("classpath:echo.xml");
		
		EchoBean echo = ctx.getBean("echoBean", EchoBean.class);
		AnotherBean another = echo.getXxx();
		System.out.println(another.getName()+"\t"+another.getAge());
		
	}

}
