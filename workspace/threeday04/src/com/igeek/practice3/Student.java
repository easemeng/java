package com.igeek.practice3;

public class Student {
	
	private String name;
	private String class_number;
	private double score;
	
	public Student() {
		super();
	}

	public Student(String name, String class_number, double score) {
		super();
		this.name = name;
		this.class_number = class_number;
		this.score = score;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getClass_number() {
		return class_number;
	}

	public void setClass_number(String class_number) {
		this.class_number = class_number;
	}

	public double getScore() {
		return score;
	}

	public void setScore(double score) {
		this.score = score;
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", class_number=" + class_number + ", score=" + score + "]";
	}	

}
