package com.igeek.property;

import java.io.Serializable;


// ������  ���췽��  ���캯��
// JavaBean ... Entity ... POJO ... domain

public class Student implements Serializable {
	
	// ��װ �� ����
	private String name;
	private int age;
	
	// ������   ��  toString ����ʵ����Ҫ��ȥ���
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
	

}
