package com.spring;



import org.springframework.context.support.GenericXmlApplicationContext;

public class PersonTest {

	public static void main(String[] args) {
		GenericXmlApplicationContext ctx=
				new GenericXmlApplicationContext("classpath:person.xml");
		Person p= ctx.getBean("onePerson", Person.class);
		System.out.println(p.getCat()+"\t"+p.getDog());
//		System.out.println(p.getUsername());
//		System.out.println(p.getCat().getCatName()+"\t"+ p.getCat().getCatAge());
//		System.out.println(p.getDog().getDogName()+"\t"+ p.getDog().getDogAge());

	}

}
