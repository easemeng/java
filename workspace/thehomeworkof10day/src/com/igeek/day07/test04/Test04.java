package com.igeek.day07.test04;

public class Test04 {

	public static void main(String[] args) {
		
		Test04Teacher tesT = new Test04Teacher("��־��",30,"Java�������������");
		Test04Student tesS = new Test04Student("����",18,"�������");
		
		System.out.println("����Ϊ" + tesT.getAge() + "��" + tesT.getName());
		Test04Teacher.eat();
		System.out.println("����Ϊ" + tesT.getAge() + "��" + tesT.getName());
		Test04Teacher.teach();
		System.out.println(tesT.getContent());
		
		System.out.println("����Ϊ" + tesS.getAge() + "��" + tesS.getName());
		Test04Student.eat();
		System.out.println("����Ϊ" + tesS.getAge() + "��" + tesS.getName());
		Test04Student.study();
		
		Test04Teacher tesT1 = new Test04Teacher();
		tesT1.setName("��־��");
		tesT1.setAge(30);
		tesT1.setContent("Java�������������");
		
		Test04Student tesS1 = new Test04Student();
		tesS1.setName("����");
		tesS1.setAge(18);
		tesS1.setContent("�������");

	}

}
