package com.igeek.if1;

import java.util.Scanner;

public class TestIf5 {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入数字a:");
		int a = sc.nextInt();
		System.out.println("请输入数字b:");
		int b = sc.nextInt();
		
		if(a>b){
			System.out.println("a最大");
		}else{
			System.out.println("b最大");
		}

	}

}
