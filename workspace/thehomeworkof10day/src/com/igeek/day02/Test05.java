package com.igeek.day02;

import java.util.Scanner;

public class Test05 {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("�����볤���εĳ���");
		double a = scanner.nextDouble();
		System.out.println("�����볤���εĿ�");
		double b = scanner.nextDouble();
		
		double s = a * b;
		double c = (a + b) * 2;
		
		System.out.println("�ó����ε����Ϊ" + s + "�ܳ�Ϊ" + c);

	}

}
