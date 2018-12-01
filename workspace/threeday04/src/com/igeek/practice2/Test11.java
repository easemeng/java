package com.igeek.practice2;

import java.util.Scanner;

public class Test11 {

	public static void main(String[] args) throws Exception {
		
		System.out.println("输入原字符串：");
		Scanner scanner = new Scanner(System.in);
		String initString = scanner.nextLine();
		String finalString = initString;
		int count = 0;
		int index = finalString.indexOf("java");
		while(index != -1){
			System.out.println(index);
			Thread.sleep(1000);
			count++;
			String before = finalString.substring(0,index);
			String after = finalString.substring(index + 4);
			finalString = before + after;
			index = finalString.indexOf("java");
			System.out.println(finalString);
		}
		
		System.out.println("\n*********************************************\n");
		System.out.println("原字符串："+initString+"中");
		System.out.println("总共包含："+count+"个java，删除java后的字符串为："+finalString);

	}

}
