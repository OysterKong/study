package com.spring;

import org.springframework.beans.factory.annotation.Value;

public class Person {
	
	@Value("${value.name}")  //외부파일에서 값을 가져올때 ${ } 사용
	String username;
	@Value("${value.age}")//문자열 주의
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
