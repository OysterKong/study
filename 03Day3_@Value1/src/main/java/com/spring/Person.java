package com.spring;

import org.springframework.beans.factory.annotation.Value;

public class Person {
	
	@Value("홍길동")// String username="홍길동" 과 동일
	String username;
	@Value("10")//문자열 주의 ( int 값 적을때 "" - 문자열 방식으로 적어야함, xml 에서도 동일 )
	int age;
	
	public Person() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Person(String username, int age) {
		super();
		this.username = username;
		this.age = age;
	}
	
	public String getUsername() {
		return username;
	}
	
	public void setUsername(String username) {
		this.username = username;
	}
	
	public int getAge() {
		return age;
	}
	
	public void setAge(int age) {
		this.age = age;
	}
	
	@Override
	public String toString() {
		return "Person [username=" + username + ", age=" + age + "]";
	}
	
	

}
