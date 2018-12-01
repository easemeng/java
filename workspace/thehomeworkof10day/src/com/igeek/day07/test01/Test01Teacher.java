package com.igeek.day07.test01;

public class Test01Teacher {
	
	private String id;
	private String name;
	private String sex;
	private int age;
	private String subject;
	
	public Test01Teacher() {
		super();		
	}
	
	public Test01Teacher(String id, String name, String sex, int age, String subject) {
		super();
		this.id = id;
		this.name = name;
		this.sex = sex;
		this.age = age;
		this.subject = subject;
	}
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getSubject() {
		return subject;
	}
	public void setSubject(String subject) {
		this.subject = subject;
	}

	@Override
	public String toString() {
		return id + "	" + name + "	" + sex + "	" + age + "	" + subject + "\n";
	}

}
