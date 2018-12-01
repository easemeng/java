package com.igeek.practice;

import java.util.Scanner;

public class StringTest5 {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		
		// 输入内容，统计大小写及数字出现的次数 。 
		// boolean flag = true;
		while(true){
		Scanner scanner = new Scanner(System.in);
		System.out.println("请输入一个字符串：");
		String inp = scanner.nextLine();
		
		if(inp.equals("-")){
			break;
		}
		
		int a = 0;
		int b = 0;
		int c = 0;
		
		for(int i = 0;i < inp.length();i++){
			
			// 拿到每一个字符
			char ch = inp.charAt(i);
			if(ch <= 'Z' && ch >= 'A'){
				a++;
			}else if(ch <= 'z' && ch >= 'a'){
				b++;
			}else if(ch <= '9' && ch >= '0'){
				c++;
			}else{
				System.out.println("输入不合法，请重新输入");
			}
		}
		
		System.out.println("字符串含大写字母个数为" + a + "个");
		System.out.println("字符串含小写字母个数为" + b + "个");
		System.out.println("字符串含数字个数为" + c + "个");
		

	}
	}
}
