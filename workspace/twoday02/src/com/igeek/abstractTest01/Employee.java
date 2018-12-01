package com.igeek.abstractTest01;

public abstract class Employee {

	public String id;
	public String name;
	public int age;
	public double salary;

	public Employee() {
		
	}

	public Employee(String id, String name, int age, double salary) {
		this.id = id;
		this.name = name;
		this.age = age;
		this.salary = salary;
	}
	
	public abstract void work();

}
