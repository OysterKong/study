package com.spring;

public class Person {

	String username;
	int age;
	Cat cat;
	Dog dog;
    @Override
	public String toString() {
		return "Person [username=" + username + ", age=" + age + ", cat=" + cat + ", dog=" + dog + "]";
	}
	/**
	 * @param username
	 * @param age
	 * @param cat
	 * @param dog
	 */
	public Person(String username, int age, Cat cat, Dog dog) {
		super();
		this.username = username;
		this.age = age;
		this.cat = cat;
		this.dog = dog;
	}
	public Dog getDog() {
		return dog;
	}
	public void setDog(Dog dog) {
		System.out.println("setDog()");
		this.dog = dog;
	}
	public Person() {
		super();
		// TODO Auto-generated constructor stub
	}
	public void setAge(int age) {
		this.age = age;
	}


	public void setUsername(String username) {
		this.username = username;
	}
	public void setCat(Cat cat) {
		System.out.println("setCat()");
		this.cat = cat;
	}
   public String getUsername() {
		return username;
	}





	public int getAge() {
		return age;
	}



public Person(String username, int age, Cat cat ) {
		this.username = username;
		this.age = age;
		this.cat= cat;
	
	}

public Cat getCat() {
	return cat;
}


public String getInfo() {
	   return username +"\t" +age+"\t"+ cat.catName+"\t";
   }
}
