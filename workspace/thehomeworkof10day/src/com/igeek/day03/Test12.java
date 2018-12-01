package com.igeek.day03;

public class Test12 {

	public static void main(String[] args) {
		
		double sum = 0.0001;
		int count = 0;
		while((sum *= 2) < 8848){
			count++;
		}
		System.out.println(count+1);

	}

}
