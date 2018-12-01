package com.igeek.day05;

import java.util.Arrays;

public class Test04 {
	
	public static void main(String[] args) {
		
		int[] arr= {10,20,30,40,50,60};
		System.out.println(min(arr));
		
	}
	
	public static int min(int[] args){
		
		Arrays.sort(args);
		return args[0];
		
	}

}
