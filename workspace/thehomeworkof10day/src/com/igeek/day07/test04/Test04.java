package com.igeek.day07.test04;

public class Test04 {

	public static void main(String[] args) {
		
		Test04Teacher tesT = new Test04Teacher("周志鹏",30,"Java基础中面向对象");
		Test04Student tesS = new Test04Student("韩光",18,"面向对象");
		
		System.out.println("年龄为" + tesT.getAge() + "的" + tesT.getName());
		Test04Teacher.eat();
		System.out.println("年龄为" + tesT.getAge() + "的" + tesT.getName());
		Test04Teacher.teach();
		System.out.println(tesT.getContent());
		
		System.out.println("年龄为" + tesS.getAge() + "的" + tesS.getName());
		Test04Student.eat();
		System.out.println("年龄为" + tesS.getAge() + "的" + tesS.getName());
		Test04Student.study();
		
		Test04Teacher tesT1 = new Test04Teacher();
		tesT1.setName("周志鹏");
		tesT1.setAge(30);
		tesT1.setContent("Java基础中面向对象");
		
		Test04Student tesS1 = new Test04Student();
		tesS1.setName("韩光");
		tesS1.setAge(18);
		tesS1.setContent("面向对象");

	}

}
