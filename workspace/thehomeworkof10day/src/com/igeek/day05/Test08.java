package com.igeek.day05;

import java.util.Arrays;

public class Test08 {

	public static void main(String[] args) {
		
		int[] arr1 = {1,2,3,4,5};
		int[] arr2 = {1,2,3,4,5};
		System.out.println(equals(arr1, arr2));
		System.out.println(Arrays.toString(fill(arr1, 10)));
		System.out.println(Arrays.toString(fill(arr1, 1 , 3 , 9)));
		System.out.println(Arrays.toString(copyOf(arr1,1)));
		System.out.println(Arrays.toString(copyOfRange(arr1,1,5)));
		//  Arrays.toString(arr1) 打印整个数组

	}
	
	public static boolean equals(int[] arr1,int[] arr2){
				
		// Arrays.equals(arr1,arr2) 
		// 比较两个数组是否相等（包括元素对应的下标）
		
		/*if(Arrays.equals(arr1, arr2)){  
			flag = true;
		}*/
		boolean flag = Arrays.equals(arr1, arr2);
		return flag;
	}
	
	public static int[] fill(int[] arr,int value){
		
/*		for(int i = 0;i < arr.length;i++){
			arr[i] = value;			
		}*/
		Arrays.fill(arr, value);
		//  Arrays.fill(int[] a, int val) 
		// 将指定的int值分配给指定的int数组的每个元素。
		return arr;
	}
	
	public static int[] fill(int[] arr,int fromIndex,int toIndex,int value){
		
		Arrays.fill(arr, fromIndex, toIndex, value);
		// Arrays.fill(int[] a, int fromIndex, int toIndex, int val) 
		// 将指定的int值分配给指定的int数组的指定范围的每个元素。
		return arr;
	}
	
	public static int[] copyOf(int[] arr, int newLength){
		
		int[] arr1 = Arrays.copyOf(arr, newLength);
		// Arrays.copyOf(int[] original, int newLength) 
		// 复制指定的数组，用零截取或填充（如有必要），以便复制具有指定的长度。
		return arr1;
		
	}
	
	public static int[] copyOfRange(int[] arr,int from, int to){
		
		int[] arr1 = Arrays.copyOfRange(arr, from, to);
		// Arrays.copyOfRange(int[] original, int from, int to) 
		// 将指定数组的指定范围复制到新数组中
		return arr1;
	}
	

}
