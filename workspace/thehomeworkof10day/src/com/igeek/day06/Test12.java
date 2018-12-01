package com.igeek.day06;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Test12 {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		
		Random random = new Random();
		Scanner scanner = new Scanner(System.in);
		System.out.println("请输入10个整数：");
		int[] arr = new int[10];
		for(int i = 0;i < arr.length;i++){
			arr[i] = scanner.nextInt();
		}
		System.out.println("请输入一个索引：");
		int index = scanner.nextInt();
		
		if(index < 0 & index > 9){
			index = random.nextInt(10);
		}
		
		System.out.println(Arrays.toString(arr));
		
		System.out.println(arr[index]);
		
		if(index > 0 & index < 9){
		int temp = arr[index - 1];
		arr[index - 1] = arr[index + 1];
		arr[index + 1] = temp;
		}
		
		System.out.println(Arrays.toString(arr));
	}

}
