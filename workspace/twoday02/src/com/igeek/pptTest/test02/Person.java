package com.igeek.pptTest.test02;

public class Person {
	
	protected String name;
	protected char sex;
	protected int age;
	
	public Person() {
		super();
	}

	public Person(String name, char sex, int age) {
		super();
		this.name = name;
		this.sex = sex;
		this.age = age;
	}

	@Override
	public String toString() {
		return "Person [name=" + name + ", sex=" + sex + ", age=" + age + "]";
	}
	
	
}
