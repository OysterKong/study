package com.dto;

public class Student {
	
	String name;
	int age;
	
	
	public Student() {
		super();
		System.out.println("Student 생성자 호출");
	}


	public Student(String name, int age) {
		super();
		this.name = name;
		this.age = age;
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


	@Override
	public String toString() {
		return "Student [name=" + name + ", age=" + age + "]";
	}
	
	

}
