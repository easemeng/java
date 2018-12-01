package com.igeek.day06;

import java.util.Arrays;
import java.util.Scanner;

public class Test06 {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("请输入10个整数：");
		int[] arr = new int[10];
		for(int i = 0;i < arr.length;i++){
			arr[i] = scanner.nextInt();
		}
		arr1(arr);
	}
	
	public static void arr1(int[] arr){
		int[] ars = new int[10];
		int sum = 0;
		int sum1 = 0;
		for(int i = 0;i < arr.length;i++){
			if(arr[i] % 2 == 0){
				ars[arr.length - sum - 1] = arr[i];
				sum++;
			}else{
				ars[sum1] = arr[i];
				sum1++;
			}
		}
		
		System.out.println(Arrays.toString(arr));
		System.out.println(Arrays.toString(ars));
		
	}

}
