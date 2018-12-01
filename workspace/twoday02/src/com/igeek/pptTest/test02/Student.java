package com.igeek.pptTest.test02;

public class Student extends Person {
	
	long number;
	int math;
	int english;
	int computer;
	
	public Student() {
		super();
	}

	public Student(String name,char sex,int age,long number, int math, int english, int computer) {
		super(name,sex,age);
		this.number = number;
		this.math = math;
		this.english = english;
		this.computer = computer;
	}
	
	public double aver(){
		
		return 0;
		
	}
	
	public int max(){
		
		return 0;
		
	}
	
	public int min(){
		
		return 0;
		
	}

	@Override
	public String toString() {
		return "Student [number=" + number + ", math=" + math + ", english=" + english + ", computer=" + computer
				+ ", name=" + name + ", sex=" + sex + ", age=" + age + "]";
	}
	
	

}
