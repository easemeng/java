package com.igeek.homework;

import java.util.Arrays;
import java.util.Random;
import java.util.Stack;

public class ArrayPractice {

	public static void main(String[] args) {
		
		arraysPractice();

	}
	
	@SuppressWarnings({ "unused", "unchecked", "rawtypes" })
	public static void arraysPractice(){
		
		Random rand = new Random();
		
		int sum = 0;
		
		int[] arrayss = new int[10];
		for(int i = 0; i < 10; i++){
			arrayss[i] = (int)( Math.random() *100 );
		}
		
		for(int k = 0; k < arrayss.length; k++){
			System.out.print(arrayss[k] + "\t");
			sum += arrayss[k];
		}
		System.out.println("\n");
		
		Arrays.sort(arrayss);
		
		Stack stack = new Stack();
		
		stack.push(arrayss);
		for(int i = 0;i < arrayss.length;i++){
			arrayss[i] = (int) stack.pop();
			System.out.print(arrayss + "\t");
		}
		
		/*int[] arr = new int[arrayss.length];
		
		for( int j = 0;j < arrayss.length; j++){
			System.out.print(arrayss[j] + "\t");
			
			arr[j] = arrayss[arrayss.length - 1 - j];
			
			System.out.print(arr[j] + "\t");
		}	*/
		
		System.out.println();
		
		System.out.println("数组最大值为：" + arrayss[9]);
		System.out.println("数组最小值为：" + arrayss[0]);
		System.out.println("数组平均值为：" + sum/10);
		
	}

}
