package com.spring;

import org.springframework.beans.factory.annotation.Value;

public class Person {
	
	@Value("#{yyy.username}")  //내부 bean의 변수를 가져올 때는 #{} , xml에서 xxx에 yyy가 가진 username 과 age를 넣는것
	String username;
	@Value("#{yyy.age}")
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
