package com.igeek.day02;

import java.util.Scanner;

public class Test06 {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("�����һ����");
		int a = scanner.nextInt();
		System.out.println("����ڶ�����");
		int b = scanner.nextInt();
		
		int x = a + b;
		int y = a * b;
		
		int flag = (a > b)?x:y;
		System.out.println(flag);

	}

}
