package com.spring;

import org.springframework.context.support.GenericXmlApplicationContext;

public class PersonTest {

	public static void main(String[] args) {
		
		GenericXmlApplicationContext ctx = new GenericXmlApplicationContext("classpath:com/spring/person.xml");
		
		Person p = ctx.getBean("onePerson", Person.class);
		Cat c = p.getCat();
		System.out.println(c.getCatName()+"\t"+c.getCatAge());

	}

}
