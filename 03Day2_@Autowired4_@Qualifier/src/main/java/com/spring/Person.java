package com.spring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Required;

public class Person {
	String username;
	int age;
	//***************************************************************//
	@Autowired  //필수, 자동주입 (byType)  CoC : 생성된 bean (여기서는 Cat이 2개이므로) 이 여러개인 경우 변수명인 같은 ref를 주입
	@Qualifier("pet01")  //특정 bean id 지정 ( 이 id를 가진 bean을 주입받겠다 )
	//@Qualifier(value="pet01")  //특정 bean id 지정 ( 이 id를 가진 bean을 주입받겠다 )
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
