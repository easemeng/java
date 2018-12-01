package com.igeek.day08;

import java.util.Scanner;

public class Test04 {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("请输入一个大字符串：");
		String bs = scanner.nextLine();
		System.out.println("请输入一个小字符串：");
		String ss = scanner.nextLine();
		int count = 0;
		int i = 0;
		//找到小字符串出现的首次位置之后，再从当前索引处往后找，依次找处所有的小字符串
		while((i = bs.indexOf(ss,i)) != -1){
			count++;
			//找到首次出现的位置后，从这个索引处之后找，所以索引值应该加上小字符串的长度
			i += ss.length();
		}
		System.out.println(count);

	}

}
