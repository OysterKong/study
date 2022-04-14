package com.spring;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Required;

public class Person {
	String username;
	int age;
	//***************************************************************//
	
	
	Cat cat;  

	
	@Resource  //@Resource위치가 set함수에 사용됨
	//함수이름을 setPet으로 변경하고 id="pet"을 사용하게 됨
  public void setPet(Cat x) {
  System.out.println("Person.setCat함수호출()========"); 
  this.cat = x; 
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
