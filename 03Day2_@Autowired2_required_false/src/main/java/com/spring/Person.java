package com.spring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Required;

public class Person {
	String username;
	int age;
	//***************************************************************//
	@Autowired(required = false)   //필수, 자동주입 (byType)
	Cat cat;
	@Autowired   //필수, 자동주입 (byType)
	Dog dog;
	//***************************************************************//
	
	//@Autowried 사용시 @Requred사용 안함
	/* @Required */
	//@Autowired
public void setCat(Cat cat) {
	System.out.println("Person.setCat함수호출()========");
	this.cat = cat;
}
//	
//	public Person() {}
//	public Person(String username, int age, Cat cat) {
//		this.username=username;
//		this.age= age;
//		this.cat= cat;
//	}
//	public Person(Cat cat) { this.cat= cat;}
	

	public Dog getDog() {
	return dog;
}


public void setDog(Dog dog) {
	this.dog = dog;
}


	public Person() {
		
		System.out.println("기본생성자 호출=================");
	}
	
	public void setUsername(String username) {
		this.username = username;
	}

	public void setAge(int age) {
		this.age = age;
	}
	public Cat getCat() {
		return cat;
	}
	
	public String getInfo() {
		return username+"\t" + age+"\t"+cat +"\t"+ dog;
	}
	
	
}
