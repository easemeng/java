package com.igeek.day04;

import java.util.Arrays;
import java.util.Random;

public class Test01 {

	public static void main(String[] args) {
		
		Random random = new Random();
		int[] arrays = new int [5];
		for(int i = 0; i < arrays.length; i++){
			arrays[i] = random.nextInt(100);
			System.out.print(arrays[i] + "\t");
		}
		System.out.println();
		Arrays.sort(arrays);
		for(int i = 0; i < arrays.length; i++){
			System.out.print(arrays[i] + "\t");
		}
		System.out.println();
		System.out.println("数组中所有元素的最小值为" + arrays[0]);

	}

}
