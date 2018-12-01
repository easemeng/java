package com.igeek.day05;

import java.util.Random;
import java.util.Scanner;

public class Test06 {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		
//		int[] arr= {10,20,60,40,30,50};
		Scanner scanner = new Scanner(System.in);
		System.out.println("请输入数组元素数：");
		int a = scanner.nextInt();
		int[] arr = new int[a];
		Random random = new Random();
		for(int i = 0;i < arr.length;i++){
			arr[i] = random.nextInt(100);
			System.out.print(arr[i] + " ");
		}
		System.out.println();
		index(arr);

	}
	
	public static void index(int[] args){
		
//		int[] arrays = new int[args.length];
		int max = 0;
		for(int i = 0;i < args.length;i++){
			if(max < args[i]){
			max = args[i];
			}
		}
//		Arrays.sort(args);
//		int i = args[args.length-1];
		for(int j = 0;j < args.length;j++){
			if(max == args[j]){
				System.out.println(j);
			}
		}
		
	}

}
