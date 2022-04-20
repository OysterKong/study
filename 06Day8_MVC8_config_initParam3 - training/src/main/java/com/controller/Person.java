package com.controller;

import org.springframework.beans.factory.annotation.Autowired;

public class Person {
	
	
	String name;
	int age;
	String address;
	
	
	
	@Override
	public String toString() {
		return "개인정보 [이름=" + name + ", 나이=" + age + ", 주소=" + address + "]";
	}
	
	
	public Person() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Person(String name, int age, String address) {
		super();
		this.name = name;
		this.age = age;
		this.address = address;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public int getAge() {
		return age;
	}
	
	public void setAge(int age) {
		this.age = age;
	}
	
	public String getAddress() {
		return address;
	}
	
	public void setAddress(String address) {
		this.address = address;
	}

	

}
