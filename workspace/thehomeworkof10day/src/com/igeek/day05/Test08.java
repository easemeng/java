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
		//  Arrays.toString(arr1) ��ӡ��������

	}
	
	public static boolean equals(int[] arr1,int[] arr2){
				
		// Arrays.equals(arr1,arr2) 
		// �Ƚ����������Ƿ���ȣ�����Ԫ�ض�Ӧ���±꣩
		
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
		// ��ָ����intֵ�����ָ����int�����ÿ��Ԫ�ء�
		return arr;
	}
	
	public static int[] fill(int[] arr,int fromIndex,int toIndex,int value){
		
		Arrays.fill(arr, fromIndex, toIndex, value);
		// Arrays.fill(int[] a, int fromIndex, int toIndex, int val) 
		// ��ָ����intֵ�����ָ����int�����ָ����Χ��ÿ��Ԫ�ء�
		return arr;
	}
	
	public static int[] copyOf(int[] arr, int newLength){
		
		int[] arr1 = Arrays.copyOf(arr, newLength);
		// Arrays.copyOf(int[] original, int newLength) 
		// ����ָ�������飬�����ȡ����䣨���б�Ҫ�����Ա㸴�ƾ���ָ���ĳ��ȡ�
		return arr1;
		
	}
	
	public static int[] copyOfRange(int[] arr,int from, int to){
		
		int[] arr1 = Arrays.copyOfRange(arr, from, to);
		// Arrays.copyOfRange(int[] original, int from, int to) 
		// ��ָ�������ָ����Χ���Ƶ���������
		return arr1;
	}
	

}
