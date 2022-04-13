package com.spring;

public class Dog {
	
	String dogname;

	public Dog() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Dog(String dogname) {
		super();
		this.dogname = dogname;
	}

	public String getDogname() {
		return dogname;
	}

	public void setDogname(String dogname) {
		this.dogname = dogname;
	}

	@Override
	public String toString() {
		return "Dog [dogname=" + dogname + "]";
	}


}
