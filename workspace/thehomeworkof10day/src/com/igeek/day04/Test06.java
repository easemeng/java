package com.igeek.day04;

public class Test06 {

	public static void main(String[] args) {
		
		int[] arr1 = {1,2,3,4,5};
		int[] arr2 = {5,6,7};
		int[] temp = arr1;
		
		System.out.println("ͨ��tempȡ��arr1�е�Ԫ��: ");  // 1 2 3 4 5 
		
		for(int i = 0;i<temp.length;i++) {
			System.out.print(temp[i]+" ");
		}
		
		temp = arr2;
		
		System.out.println("ͨ��tempȡ��arr2�е�Ԫ��: ");  //  5 6 7
		
		for(int i = 0;i<temp.length;i++) {
			System.out.print(temp[i]+" ");
		}

	}

}
