package com.igeek.day05;

import java.util.Scanner;

public class Test05 {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("请输入一个数字：");
		int a = scanner.nextInt();
		
		System.out.println(test(a));
		

	}
	
	public static String test(int i){
		
		String c = "";
		
		if(i >= 90 & i <= 100){
			c = "A";
		}else if(i >= 80 & i < 90){
			c = "B";
		}else if(i >= 70 & i < 80){
			c = "C";
		}else if(i >= 60 & i < 70){
			c = "D";
		}else if(i >= 0 & i < 60){
			c = "E";
		}else{
			c = "F";
		}
		return c;
	}

}
