package com.igeek.day09.test03;

public class Student {
	
	private String id;
	private String name;
	private char sex;
	private int age;
	private double height;
				
	public Student() {
		super();
	}
	
	public Student(String id, String name, char sex, int age, double height) {
		super();
		this.id = id;
		this.name = name;
		this.sex = sex;
		this.age = age;
		this.height = height;
	}
	
	public char getSex() {
		return sex;
	}
	public void setSex(char sex) {
		this.sex = sex;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getHeight() {
		return height;
	}
	public void setHeight(double height) {
		this.height = height;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", sex=" + sex + ", age=" + age + ", height=" + height + "]";
	}

}
