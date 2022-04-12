package com.dto;

import org.springframework.context.support.GenericXmlApplicationContext;

public class StudentTest {

	public static void main(String[] args) {
		
		GenericXmlApplicationContext ctx = new GenericXmlApplicationContext("classpath:stu.xml");
		
		Student stu1 = ctx.getBean("xxx", Student.class);
		stu1.setName("홍길동");
		stu1.setAge(10);
		System.out.println(stu1.getName()+"\t"+stu1.getAge());
		
		Student stu2 = (Student)ctx.getBean("xxx");
		stu2.setName("이순신");
		stu2.setAge(20);
		System.out.println(stu2.getName()+"\t"+stu2.getAge());
	}

}
