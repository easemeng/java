package com.igeek.lesson4;

// ������������
public class Pet {
	
	private String petName;
	private int age;
	public String getPetName() {
		return petName;
	}
	public void setPetName(String petName) {
		this.petName = petName;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	@Override
	public String toString() {
		return "Pet [petName=" + petName + ", age=" + age + "]";
	}
	
}
