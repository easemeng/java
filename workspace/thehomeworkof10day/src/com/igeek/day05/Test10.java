package com.igeek.day05;

import java.util.Scanner;

public class Test10 {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("请输入一个整数：");
		int a = scanner.nextInt();
		digit(a);

	}
	
	public static void digit(int a){
		
		int count = 0;
		int b = a;
		while(b / 10 != 0){
			count++;
			b /= 10;
		}
		
		System.out.println(a + "是" + (count+1) + "位数字");
	}

}
