package com.igeek.test3;

import java.util.ArrayList;

public class ClassRoom {

	// �༶��
	private String class_Id;
	
	// private Student stu;  new Student("����","java",55.5);
	
	// �Ժ�ܳ��õ� ����
	// ��ClassRoom���� ��ѧ���ļ��� �� 
	private ArrayList<Student> studentList;

	public ClassRoom() {
		super();
	}

	public ClassRoom(String class_Id, ArrayList<Student> studentList) {
		super();
		this.class_Id = class_Id;
		this.studentList = studentList;
	}

	public String getClass_Id() {
		return class_Id;
	}

	public void setClass_Id(String class_Id) {
		this.class_Id = class_Id;
	}

	public ArrayList<Student> getStudentList() {
		return studentList;
	}

	public void setStudentList(ArrayList<Student> studentList) {
		this.studentList = studentList;
	}

	@Override
	public String toString() {
		return "ClassRoom [class_Id=" + class_Id + ", studentList=" + studentList + "]";
	}
	
}
