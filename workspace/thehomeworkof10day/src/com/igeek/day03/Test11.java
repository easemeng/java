package com.igeek.day03;

import java.util.Scanner;

public class Test11 {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		while(true){
		System.out.println("�������һ��������");
		int num1 = scanner.nextInt();
		System.out.println("������ڶ���������");
		int num2 = scanner.nextInt();
		System.out.println("��������Ҫ���е�����(0:��ʾ�ӷ�����,1:��ʾ��������,2:��ʾ�˷�����,3:��ʾ��������)��");
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
				System.out.println("��������ȷ�������");
		}
		}
	}

}
