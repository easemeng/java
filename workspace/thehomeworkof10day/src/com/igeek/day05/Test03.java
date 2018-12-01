package com.igeek.day05;

public class Test03 {

	public static void main(String[] args) {
		
		int[] arr={10,20};
		System.out.println(add(arr));

	}
	
	public static int add(int...args){
		
		int sum = 0;
		for(int i = 0;i < args.length;i++){
			sum += args[i];
		}
		
		return sum;
	}

}
