package com.igeek.day06;

public class Test04 {

	public static void main(String[] args) {
		
		int[] arr = {1,2,3,2};
		ars(5,arr);

	}
	
	public static void ars(int key,int[] arr){
		
		int count = 0;
		for(int i = 0;i < arr.length;i++){
			if(arr[i] == key){
				count++;
				System.out.println(i);
			}			
		}
		if(count == 0){
				System.out.println("数组中没有这个数字");
			}
	}

}
