package com.igeek.test3;

public class Student {
	
	private String name;
	private String class_Id;
	private double score;
	
	public Student() {
		super();
	}
	
	public Student(String name, String class_Id, double score) {
		super();
		this.name = name;
		this.class_Id = class_Id;
		this.score = score;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getClass_Id() {
		return class_Id;
	}
	public void setClass_Id(String class_Id) {
		this.class_Id = class_Id;
	}
	public double getScore() {
		return score;
	}
	public void setScore(double score) {
		this.score = score;
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", class_Id=" + class_Id + ", score=" + score + "]";
	}

}
