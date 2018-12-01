package com.igeek.day07.test02;

import java.util.Scanner;

public class Test02 {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		Test02Student stu = new Test02Student();
		
		System.out.println("请输入学员编号:");
		stu.setId(scanner.nextLine());
		System.out.println("请输入学员姓名:");
		stu.setName(scanner.nextLine());
		System.out.println("请输入学员性别:");
		stu.setSex(scanner.nextLine());
		System.out.println("请输入学员身高:");
		stu.setHeight(scanner.nextDouble());
		System.out.println("请输入学员年龄:");
		stu.setAge(scanner.nextInt());
		
		System.out.println("学员编号:" + stu.getId() + " 学员姓名:" + stu.getName() + 
						" 学员性别:" + stu.getSex() + " 学员身高:" + stu.getHeight() + 
						" 学员年龄:" + stu.getAge());

	}

}
