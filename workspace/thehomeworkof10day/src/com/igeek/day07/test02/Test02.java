package com.igeek.day07.test02;

import java.util.Scanner;

public class Test02 {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		Test02Student stu = new Test02Student();
		
		System.out.println("������ѧԱ���:");
		stu.setId(scanner.nextLine());
		System.out.println("������ѧԱ����:");
		stu.setName(scanner.nextLine());
		System.out.println("������ѧԱ�Ա�:");
		stu.setSex(scanner.nextLine());
		System.out.println("������ѧԱ���:");
		stu.setHeight(scanner.nextDouble());
		System.out.println("������ѧԱ����:");
		stu.setAge(scanner.nextInt());
		
		System.out.println("ѧԱ���:" + stu.getId() + " ѧԱ����:" + stu.getName() + 
						" ѧԱ�Ա�:" + stu.getSex() + " ѧԱ���:" + stu.getHeight() + 
						" ѧԱ����:" + stu.getAge());

	}

}
