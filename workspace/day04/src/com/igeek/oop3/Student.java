package com.igeek.oop3;

public class Student {
	
	private String name;
	
	/*
	 * public Student(){
	 * 
	 * }
	 */
	public Student(String name){
		this.name=name;
	}
	


	//�������� ��Ա������
	public void learn(){
		System.out.println(name+"ѧϰ��");
	}
	
	//�������ԡ�
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
}
