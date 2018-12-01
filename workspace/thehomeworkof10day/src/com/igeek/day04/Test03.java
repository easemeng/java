package com.igeek.day04;

public class Test03 {

	public static void main(String[] args) {
		
		int[] nums = {5,10,15};
		int[] nums1 = new int[3];
		for(int i = 0; i < nums.length; i++){
			nums1[i] = nums[i] * 2;
			System.out.print(nums1[i] + "\t");
		}

	}

}
