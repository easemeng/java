package com.igeek.day03;

import java.util.Scanner;

public class Test04 {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("请输入一个大于100的数字：");
		int num = scanner.nextInt();
		int sum = 0;
		for(int i = 100 ; i < num ; i++){
			if(i % 10 != 7 & i / 10 % 10 != 5 & i % 100 != 3){
				sum += i;
			}
		}
		System.out.println(sum);

	}

}
