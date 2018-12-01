package com.igeek.day06;

public class Test03 {

	public static void main(String[] args) {
		
		int[] arr = {3,4,3,5,7,9};
		System.out.println(ars(5,arr));

	}
	
	public static int ars(int key,int[] arr){
		
		int count = 0;
		for(int i = 0;i < arr.length;i++){			
			if(arr[i] == key){
				count++;
			}
			System.out.print(arr[i] + " ");
		}
		System.out.println();
		return count;
	}

}
