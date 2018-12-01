package com.igeek.scan;

import java.util.Scanner;

public class TestScanner {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		//String str = sc.nextLine();//nextLine 方法表示接受控制台输入的内容，并保存成字符串形式。
		
		//System.out.println(str);
		
		int i = sc.nextInt();//当调用nextInt()方法的时候，要求输入的内容必须为数字，否则会产生异常。
		
		System.out.println(i);//InputMismatchException输入不匹配异常。
		
		
	}

}
