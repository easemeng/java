package com.igeek.day06;

import java.util.Arrays;
import java.util.Scanner;

public class Test05 {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("请输入第一个整数：");
		int a = scanner.nextInt();
		System.out.println("请输入第二个整数：");
		int b = scanner.nextInt();
		
		System.out.println(Arrays.toString(operation(a, b)));

	}
	
	public static int[] operation(int a,int b){
		
		int z = a + b;
		int x = a - b;
		int c = a * b;
		int v = a / b;
		
		int[] arr = new int[4];
		arr[0] = z;
		arr[1] = x;
		arr[2] = c;
		arr[3] = v;
		
		return arr;
		
	}

}
