package com.igeek.day12.io3;

import java.io.Serializable;

// 一个类 想要被序列化  必须实现 Serializable 接口
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
	
	// transient 和 static 修饰的属性 ， 不能被序列化
	// transient 短暂的	static 表示静态的 。 
	
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
