package com.spring;

import org.springframework.context.support.GenericXmlApplicationContext;

public class TestStudent {

	public static void main(String[] args) {
		
		GenericXmlApplicationContext ctx = new GenericXmlApplicationContext("classpath:echo.xml");
		EchoBean echo = ctx.getBean("echoBean", EchoBean.class);
		System.out.println(echo.sayEcho());
		System.out.println(echo.getAaa());
		
		EchoBean echo2 = ctx.getBean("echoBean2", EchoBean.class);
		System.out.println();
		System.out.println(echo2.getAaa());

	}

}
