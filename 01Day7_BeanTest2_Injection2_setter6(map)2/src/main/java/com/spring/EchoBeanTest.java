package com.spring;

import java.util.Map;
import java.util.Set;

import org.springframework.context.support.GenericXmlApplicationContext;

public class EchoBeanTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		GenericXmlApplicationContext ctx = new GenericXmlApplicationContext("classpath:echo.xml");
		//GenericXmlApplicationContext ctx = new GenericXmlApplicationContext("classpath:echo2.xml");
		
		EchoBean echo = ctx.getBean("echoBean", EchoBean.class);
		
		Map<String,AnotherBean> map = echo.getMap();
		System.out.println(map);
		Set<String> keys = map.keySet(); // key들 뽑아오기
		System.out.println(keys); // key 값인 one, two가 찍힘
		for (String key : keys) {
			System.out.println(map.get(key).getName()+"\t"+map.get(key).getAge());
			System.out.println(map.get(key));

		}
		
	}

}
