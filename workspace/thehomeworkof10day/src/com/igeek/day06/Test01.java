package com.igeek.day06;

import java.util.Random;

public class Test01 {
	
	public static void main(String[] args) {
		
		Random random = new Random();
		int[] arrays = new int[5];
		for(int i = 0;i < arrays.length;i++){
			arrays[i] = random.nextInt(100)+1;
			if(arrays[i] % 10 == 3 || arrays[i] / 10 == 3){
				System.out.print(arrays[i] + " ");
			}			
		}
		System.out.println();
		System.out.println("--------------------------\n");
		for(int i = 0;i < arrays.length;i++){
			System.out.print(arrays[i] + " ");
		}
		System.out.println();
	}

}
