package com.spring;

import org.springframework.context.support.GenericXmlApplicationContext;

public class PersonTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		GenericXmlApplicationContext ctx = new GenericXmlApplicationContext("classpath:person.xml");
		
		Person p1 = ctx.getBean("one", Person.class);
		System.out.println(p1.getCat().getCatName()+"\t"+p1.getCat().getCatAge());
		
		System.out.println(p1.getUsername()+"\t"+p1.getAge()+"\t"+p1.getCat());
		
	}

}
