package com.igeek.lesson4;

public class Person {
	
	private String name;
	private int age;
	// 类的关联关系		关联、继承
	// Pet pet = new Pet();	耦合
	private Pet pet; // 高内聚 低耦合
	
	public Person() {
		super();
	}
	
	public Person(String name, int age, Pet pet) {
		super();
		this.name = name;
		this.age = age;
		this.pet = pet;
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
	public Pet getPet() {
		return pet;
	}
	public void setPet(Pet pet) {
		this.pet = pet;
	}
	
	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + ", pet=" + pet + "]";
	}
	
}
