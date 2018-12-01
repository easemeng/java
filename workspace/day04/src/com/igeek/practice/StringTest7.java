package com.igeek.practice;

import java.util.Scanner;

public class StringTest7 {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("请输入内容：");
		String input = scanner.nextLine();
		
		String e = input.substring(0, 1).toUpperCase();
		String s = input.substring(1,input.length()).toLowerCase();
		System.out.println(e+s);

	}

}
