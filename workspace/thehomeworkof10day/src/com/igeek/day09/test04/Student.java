package com.igeek.day09.test04;

public class Student {
	private String name;
	private int age;
	private double score;
	
	
	public Student() {
		
	}
	public Student(String name, int age, double score) {
		super();
		this.name = name;
		this.age = age;
		this.score = score;
	}
	@Override
	public String toString() {
		return "姓名" + name + "，年龄" + age + "，分数" + score ;
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
	public double getScore() {
		return score;
	}
	public void setScore(double score) {
		this.score = score;
	}
	
	public void eat(){
		System.out.println("学生会吃饭!");
	}	
}
