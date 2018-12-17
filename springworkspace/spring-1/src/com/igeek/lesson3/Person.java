package com.igeek.lesson3;

public class Person {

	private String name;
	private int age;
	private double type;

	public Person() {

	}

	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}

	public Person(String name, double type) {
		this.name = name;
		this.type = type;
	}

	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + ", type=" + type + "]";
	}
	

}
