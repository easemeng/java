package com.igeek.day02;

import java.util.Scanner;

public class Test01 {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("输入数字：");
		int num = scanner.nextInt();
		String flag = (num % 2 == 0)?"是偶数":"是奇数";
		System.out.println(flag);

	}

}
