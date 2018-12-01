package com.igeek.day07.test02;

public class Test02Student {
	
	private String id;
	private String name;
	private String sex;
	private double height;
	private int age;
	
	public Test02Student() {
		super();
	}
	
	public Test02Student(String id, String name, String sex, double height, int age) {
		super();
		this.id = id;
		this.name = name;
		this.sex = sex;
		this.height = height;
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
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	public double getHeight() {
		return height;
	}
	public void setHeight(double height) {
		this.height = height;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}

}
