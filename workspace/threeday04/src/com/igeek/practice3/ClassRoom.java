package com.igeek.practice3;

import java.util.ArrayList;

public class ClassRoom {
	
	private String class_number;
	private ArrayList<Student> studentList;
	
	public ClassRoom() {
		super();
	}

	public ClassRoom(String class_number, ArrayList<Student> studentList) {
		super();
		this.class_number = class_number;
		this.studentList = studentList;
	}
	
	public String getClass_number() {
		return class_number;
	}
	public void setClass_number(String class_number) {
		this.class_number = class_number;
	}
	public ArrayList<Student> getStudentList() {
		return studentList;
	}
	public void setStudentList(ArrayList<Student> studentList) {
		this.studentList = studentList;
	}

}
