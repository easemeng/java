package com.igeek.string1;

import java.util.Scanner;

public class ScannerTest {

	@SuppressWarnings({ "resource", "unused" })
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.println("请输入内容。");
		
		//String str = sc.nextLine();// 获取读取到的字符串。
		
		int x = sc.nextInt();  //要什么类型 就调用不同的方法  即可。
	}

}
