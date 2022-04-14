package com.dto;

public class Student {
	
	private String name;
	private int age;

	public void getInfo() {
		System.out.println("getInfo()====================");
	}
	
	//init-method : 초기화작업, xml에 등로하여 init 함수로 사용
	public void aaa() {
		System.out.println("init-method.aaa");
	}
	//destroy-method : 자원반납
	public void bbb() {
		System.out.println("destroy-method.bbb");
	}
	

	public Student() {
		super();
		System.out.println("기본생성자 호출 ===================");
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
