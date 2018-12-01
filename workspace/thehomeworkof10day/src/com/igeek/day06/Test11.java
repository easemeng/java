package com.igeek.day06;

import java.util.Arrays;
import java.util.Random;

public class Test11 {

	public static void main(String[] args) {
		
		Random random = new Random();
		int[] arr = new int[10];
		int[] arr1 = new int[10];
		
		for(int i = 0;i < arr.length;i++){
			arr[i] = random.nextInt(100)+1;
			for(int j = 0;j <= i;j++){
				if(arr[j] == arr[i]){
					arr[i] = random.nextInt(100)+1;
				}
			}
			arr1[i] = random.nextInt(100)+1;
			for(int k = 0;k <= i;k++){
				if(arr[k] == arr[i]){
					arr[i] = random.nextInt(100)+1;
				}
			}
		}
		
		System.out.println(Arrays.toString(arr));
		System.out.println(Arrays.toString(arr1));

	}
	
	public static void joint(int[] arr,int[] ars){
		
		
	}

}
