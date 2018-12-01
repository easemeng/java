package com.igeek.day05;

import java.util.Scanner;

public class Test09 {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("请输入起始年份：");
		int year1 = scanner.nextInt();
		System.out.println("请输入终止年份：");
		int year2 = scanner.nextInt();
		year(year1,year2);

	}
	
	public static void year(int a,int b){
					
		for(int i = a;i <= b;i++){			
			if((i % 4 == 0 & i % 100 != 0) || i % 400 == 0){				
				System.out.println(i);
			}
		} 
	}

}
