package com.igeek.day12.io3;

import java.io.Serializable;

// һ���� ��Ҫ�����л�  ����ʵ�� Serializable �ӿ�
public class Person implements Serializable {

	/**
	 * ArrayList
	 */
	private static final long serialVersionUID = 1L;
	
	public Person() {
		super();
	}
	
	public Person(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	
	// transient �� static ���ε����� �� ���ܱ����л�
	// transient ���ݵ�	static ��ʾ��̬�� �� 
	
	private String name;
	private int age;
	
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
