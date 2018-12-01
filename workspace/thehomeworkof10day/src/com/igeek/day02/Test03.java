package com.igeek.day02;

import java.util.Scanner;

public class Test03 {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("输入姓名：");
		String name = scanner.nextLine();
		System.out.println("输入年龄");
		int age = scanner.nextInt();
		System.out.println("输入身高：");
		int height = scanner.nextInt();
		
		System.out.println("我的姓名是" + name + "，年龄" + age + "，身高" + height + "CM");
		
		

	}

}
