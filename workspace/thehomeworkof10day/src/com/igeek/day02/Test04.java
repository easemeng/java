package com.igeek.day02;

public class Test04 {

	public static void main(String[] args) {
		
		int num = 123;
		int a = num / 100;
		int b = num / 10 % 10;
		int c = num % 10;
		System.out.println("123的个位是" + c + "十位是" + b + "百位是" + a);

	}

}
