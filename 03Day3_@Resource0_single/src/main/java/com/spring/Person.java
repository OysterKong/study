package com.spring;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Required;

public class Person {
	String username;
	int age;
	//***************************************************************//
	
	@Resource  // 멤버변수와 id가 동일한 빈을 자동주입
	Cat cat;  

	
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

public String getInfo() {
	return username+"\t" + age + "\t" + cat;
}

}
