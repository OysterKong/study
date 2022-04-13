package com.spring;

import java.util.Iterator;
import java.util.List;

import org.springframework.context.support.GenericXmlApplicationContext;

public class EchoBeanTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		GenericXmlApplicationContext ctx = new GenericXmlApplicationContext("classpath:echo.xml");
		
		EchoBean echo = ctx.getBean("echoBean", EchoBean.class);
		// echoBean의 getAnotherBean 호출, 출력  -> list 받아서 for문 이용 데이터 출력
		System.out.println(echo.getAnotherBean().getName());
		List<AnotherBean> list = echo.getValueList();
		for (AnotherBean a : list) {
			System.out.println(a.getName());
		}

	}

}
