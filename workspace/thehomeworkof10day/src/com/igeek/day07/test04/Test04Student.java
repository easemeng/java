package com.igeek.day07.test04;

public class Test04Student {
	
	private String name;
	private int age;
	private String content;
	
	public Test04Student() {
		super();
	}
	
	public Test04Student(String name, int age, String content) {
		super();
		this.name = name;
		this.age = age;
		this.content = content;
	}
	
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
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	
	public static void eat(){
		System.out.println("���ڳԷ�");
	}
	
	public static void study(){
		System.out.println("����ר����־��������������֪ʶ....");
	}

}
