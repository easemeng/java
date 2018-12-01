package com.igeek.day02;

import java.util.Scanner;

public class Test05 {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("请输入长方形的长：");
		double a = scanner.nextDouble();
		System.out.println("请输入长方形的宽：");
		double b = scanner.nextDouble();
		
		double s = a * b;
		double c = (a + b) * 2;
		
		System.out.println("该长方形的面积为" + s + "周长为" + c);

	}

}
