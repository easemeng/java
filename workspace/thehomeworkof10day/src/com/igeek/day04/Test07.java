package com.igeek.day04;

import java.util.Random;

public class Test07 {

	public static void main(String[] args) {
		
		int[] nums = {1,2,3,4,5,6,7,8,9,10};
		int[] nums1 = new int[3];
		
		Random random = new Random();		
		int sum = 0;
		for(int i = 0; i < nums1.length; i++){
			int a = random.nextInt(10);
			nums1[i] = nums[a];
			System.out.print(nums1[i] + "\t");
			sum += nums1[i];
		}
		System.out.println();
		System.out.println(sum);

	}

}
