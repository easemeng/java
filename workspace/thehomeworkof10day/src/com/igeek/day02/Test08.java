package com.igeek.day02;

import java.util.Scanner;

public class Test08 {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("�����һ�����֣�");
		int num1 = scanner.nextInt();
		System.out.println("num1 = " + num1);
		System.out.println("����ڶ������֣�");
		int num2 = scanner.nextInt();
		System.out.println("num2 = " + num2);
		
		int temp = 0;
		temp = num1;
		num1 = num2;
		num2 = temp;
		
		System.out.println("num1 = " + num1 + "\t" +"num2 = " + num2);

	}

}
