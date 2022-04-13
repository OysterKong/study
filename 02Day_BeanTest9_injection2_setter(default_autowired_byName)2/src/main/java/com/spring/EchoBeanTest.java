package com.spring;

import java.util.Map;
import java.util.Set;

import org.springframework.context.support.GenericXmlApplicationContext;

public class EchoBeanTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		GenericXmlApplicationContext ctx = new GenericXmlApplicationContext("classpath:echo.xml");

		
		EchoBean echo = ctx.getBean("echoBean", EchoBean.class);
		System.out.println(echo);
		echo.getInfo();
		echo.getAnotherBean().getInfo();
		System.out.println(echo.getValueList());

		}
		
	}

