package com.igeek.day03;

import java.util.Scanner;

public class Test11 {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		while(true){
		System.out.println("请输入第一个整数：");
		int num1 = scanner.nextInt();
		System.out.println("请输入第二个整数：");
		int num2 = scanner.nextInt();
		System.out.println("请输入您要进行的运算(0:表示加法运算,1:表示减法运算,2:表示乘法运算,3:表示除法运算)：");
		int op = scanner.nextInt();
		switch(op){
		case 0:
			System.out.println(num1 + " + " + num2 + " = " + (num1 + num2));
			break;
		case 1:
			System.out.println(num1 + " - " + num2 + " = " + (num1 - num2));
			break;
		case 2:
			System.out.println(num1 + " * " + num2 + " = " + (num1 * num2));
			break;
		case 3:
			System.out.println(num1 + " / " + num2 + " = " + (num1 / num2));
			break;
			default:
				System.out.println("请输入正确的运算符");
		}
		}
	}

}
