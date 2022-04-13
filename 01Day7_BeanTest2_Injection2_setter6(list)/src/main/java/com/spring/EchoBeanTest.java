package com.spring;

import org.springframework.context.support.GenericXmlApplicationContext;

public class EchoBeanTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		GenericXmlApplicationContext ctx = new GenericXmlApplicationContext("classpath:echo.xml");
		
		EchoBean echo = ctx.getBean("echoBean", EchoBean.class);
		System.out.println(echo.getValueList());  //  [ 10, 20, 30 ]
		
	}

}
