package com.igeek.day06;

import java.util.Arrays;
import java.util.Scanner;

public class Test08 {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		int[] arr = new int[6];
		System.out.println("请输入6个整数：");
		for(int i = 0;i < arr.length;i++){
			arr[i] = scanner.nextInt();
		}
		arrays(arr);

	}
	
	@SuppressWarnings("unused")
	public static void arrays(int[] arr){
		
		for(int i = 0,j = arr.length-1;i < j; i++,j--){
			int temp = arr[i];
			arr[i] = arr[j];
			arr[j] = temp;
		}
		System.out.println(Arrays.toString(arr));
		for(int i = 0;i < arr.length - 2;i++){
			if(i % 2 != 0){
				int temp = arr[i];
				arr[i] = arr[i+2];
				arr[i+2] = temp;
			}
		}
		System.out.println(Arrays.toString(arr));
		int max = arr[1];
		for(int i = arr.length - 1 ;i > 0;i--){
			if(i % 2 != 0){
				int temp = arr[i];
				arr[i] = arr[1];
				arr[1] = temp;
				break;
			}
			
		}
		
		System.out.println(Arrays.toString(arr));
		
	}

}
