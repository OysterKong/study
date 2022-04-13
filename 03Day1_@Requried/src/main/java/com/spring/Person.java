package com.spring;

import org.springframework.beans.factory.annotation.Required;

public class Person {
	
	String username;
	int age;
	//***************************************************************//
	
	Cat cat;
	
	//  @Required는 반드시 set함수 위에 선언되어야 한다.
	@Required   //injection 필수 요청 - 반드시 주입 받아야 함
	public void setCat(Cat cat) {
		System.out.println("Person.setCat함수호출()==========");
		this.cat = cat;
	}

	public Person() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Person(String username, int age, Cat cat) {
		super();
		this.username = username;
		this.age = age;
		this.cat = cat;
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

	public Cat getCat() {
		return cat;
	}



	@Override
	public String toString() {
		return "Person [username=" + username + ", age=" + age + ", cat=" + cat + "]";
	}

	
}
