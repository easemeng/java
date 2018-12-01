package com.igeek.day07.test05;

public class Test05Dog {

	private String color;
	private String breed;

	public Test05Dog() {
		super();
	}

	public Test05Dog(String color, String breed) {
		super();
		this.color = color;
		this.breed = breed;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getBreed() {
		return breed;
	}

	public void setBreed(String breed) {
		this.breed = breed;
	}

	public void eat() {
		
		System.out.println(color + "的" + breed + "正在啃骨头.....");

	}

	public void lookHome() {
		
		System.out.println(color + "的" + breed + "正在看家.....");

	}

}
