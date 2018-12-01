package com.igeek.day04;

import java.util.Random;

public class Test02 {

	public static void main(String[] args) {
		
		Random random = new Random();
		int[] arrays = new int [3];
		for(int i = 0; i < arrays.length; i++){
			arrays[i] = random.nextInt(10);
			System.out.print(arrays[i] + "\t");
		}
		System.out.println();

	}

}
