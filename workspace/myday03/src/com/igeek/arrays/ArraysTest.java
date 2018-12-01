package com.igeek.arrays;

public class ArraysTest {

	public static void main(String[] args) {
		int [] arr = {1,55,22,33,-22,-55,0,10,10};
		//int max = ArraysTools.getMax(arr);
		//System.out.println(max);
		//int min = ArraysTools.getMin(arr);
		//System.out.println(min);
		
		//ArraysTools.reverseArray(arr);
		//ArraysTools.sortMp(arr);
		ArraysTools.sortFast(arr);
		for(int sb:arr){
			System.out.print(sb+"  ");
		}
	}

}
