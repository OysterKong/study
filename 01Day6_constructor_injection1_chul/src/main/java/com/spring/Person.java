package com.spring;

public class Person {


	String name;
	//기본생성자 없음
	
	public Person(String x) {
		super();
		this.name = x;
		System.out.println("person 생성자 호출 "+ x);
	}
	
	
	
	public Person() { //기본생성자
		super();
		// TODO Auto-generated constructor stub
	}



	public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
	}



	public String getInfo() {
		return "홍길동";
	}


}
