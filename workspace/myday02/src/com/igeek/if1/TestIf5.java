package com.igeek.if1;

import java.util.Scanner;

public class TestIf5 {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("����������a:");
		int a = sc.nextInt();
		System.out.println("����������b:");
		int b = sc.nextInt();
		
		if(a>b){
			System.out.println("a���");
		}else{
			System.out.println("b���");
		}

	}

}
