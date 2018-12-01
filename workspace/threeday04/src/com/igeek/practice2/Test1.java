package com.igeek.practice2;

import java.util.Scanner;

public class Test1 {

	@SuppressWarnings({ "resource", "unused" })
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("输入一个源字符串：");
		String str1 = sc.nextLine();
		String str = str1;
		System.out.println("输入需要删除的字符串：");
		String delStr = sc.nextLine();
		
		int count = 0;
		int i = 0;
		while((i = str.indexOf(delStr)) != -1){
			count++;
			str = str.replaceFirst(delStr, "");
		}
		System.out.println("原字符串为：" + str1);
		System.out.println(count + "个" + delStr + "删除" + delStr + "后的字符串为:" + str);

	}

}
