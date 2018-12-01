package com.igeek.day02;

import java.util.Scanner;

public class Test02 {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		
		System.out.println("输入成绩：");
		Scanner scanner = new Scanner(System.in);
		int num = scanner.nextInt();
		String flag = (num >= 60)?"及格":"不及格";
		System.out.println(flag);

	}

}
