package com.igeek.day08;

import java.util.Scanner;

/**
 * 1.键盘录入一个源字符串由字符串变量scrStr接收
	2.键盘录入一个要删除的字符串由字符串变量delStr接收
	3.要求
		删除该字scrStr符串中的所有delStr字符串（最终的字符串中不能包含delStr），要求打印删除后的结果以及删除了几个delStr字符串
	4.代码运行打印格式:
		请输入源字符串:java woaijava,i like jajavava i enjoy java
		请输入要删除的字符串:java
		控制台输出结果:源字符串中总共包含:4 个 java 删除java后的字符串为: woai,i like  i enjoy
 * 
 *
 */

public class Test05 {

	@SuppressWarnings({ "resource", "unused" })
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("输入一个源字符串：");
		String scrStr = sc.nextLine();
		System.out.println("输入需要删除的字符串：");
		String delStr = sc.nextLine();
		int count = 0;
		int i = 0;
		while ((i = scrStr.indexOf(delStr)) != -1) {
			count++;
			scrStr = scrStr.replaceFirst(delStr, "");
			i += scrStr.length();
			System.out.println(scrStr);
		}

	/*	for (int i = 0; i < scrStr.length(); i++) {
			if (scrStr.indexOf(delStr, i) != -1) {
				i = scrStr.indexOf(delStr, i);
				count++;
				scrStr = scrStr.replaceAll(delStr, "");
			}
		}*/

		System.out.println(count + "个" + delStr + "删除" + delStr + "后的字符串为:" + scrStr);
	}

}
