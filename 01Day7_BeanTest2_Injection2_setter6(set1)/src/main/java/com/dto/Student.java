package com.dto;

import java.util.Set;

public class Student {
	String name;
	int age;
	Set<Cat> cats;  //set 함수 특징 : 중복을 허용하지 않음  -> stu.xml 의 중복값이 하나만 결과로 출력
	
	public Set<Cat> getCats() {
		return cats;
	}
	public void setCats(Set<Cat> cats) {
		this.cats = cats;
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

	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Student(String name, int age, Set<Cat> cats) {
		super();
		this.name = name;
		this.age = age;
		this.cats = cats;
	}
	@Override
	public String toString() {
		return "Student [name=" + name + ", age=" + age + ", cats=" + cats + "]";
	}
	

}
