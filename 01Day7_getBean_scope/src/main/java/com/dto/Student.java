package com.dto;

public class Student {
	
	String username="이순신";  //객체에 초기값이 이순신이 들어가있어서 username 을 사용시 항상 이순신이 찍힐거고...
	int age;
	
	public Student() {
		super();
		System.out.println("student 기본생성자 ========");
	}
	public Student(String username, int age) {
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
		return "Student [username=" + username + ", age=" + age + "]";
	}
	
	
}
