package com.igeek.homework;

import java.util.Scanner;

public class IfPractice {

	public static void main(String[] args) {
		
//		one();
		two();
	}
	
	@SuppressWarnings("resource")
	public static void one(){
		Scanner sc = new Scanner(System.in);
		
		
		System.out.println("������ɼ�(1~100)��");
		
		int i = sc.nextInt();
		
		if(i > 100){
			System.out.println("������Դ���ĳɼ�");
		}else if(i == 100){
			System.out.println("��ϲ���BWMһ����");
		}else if(i > 80 & i <= 99){
			System.out.println("��ϲ���iPhoneXһ̨��");
		}else if(i >= 60){
			System.out.println("����һ���ο��飬�ٽ�������");
		}else{
			System.out.println("��Ҫ���ģ��´μ���Ŭ����");
		
		}
	}
	
	@SuppressWarnings("resource")
	public static void two(){
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("�������һ��������");
		int num1 = scanner.nextInt();
		System.out.println("num1=" + num1);
		System.out.println("������ڶ���������");
		int num2 = scanner.nextInt();
/*		if(num2 == num1){
			System.out.println("�����ظ�������������");
		}else{*/
		System.out.println("num2=" + num2);
//		}
		System.out.println("�����������������");
		int num3 = scanner.nextInt();
		/*if(num3 == num1 || num3 == num2){
			System.out.println("�����ظ�������������");
		}else{*/
		System.out.println("num3=" + num3);
//		}
		
		if(num1 > num2 & num2 > num3){
			System.out.println("num3" + "<" + "num2" + "<" + "num1");
		}else if(num3 > num2 & num1 > num3){
			System.out.println("num2" + "<" + "num3" + "<" + "num1");
		}else if(num1 > num2 & num1 < num3){
			System.out.println("num2" + "<" + "num1" + "<" + "num3");
		}else if(num1 < num2 & num3 > num2){
			System.out.println("num1" + "<" + "num2" + "<" + "num3");
		}else if(num3 < num2 & num1 < num3){
			System.out.println("num1" + "<" + "num3" + "<" + "num2");
		}else{
			System.out.println("num3" + "<" + "num1" + "<" + "num2");
		}
		
		
		
	}

}
