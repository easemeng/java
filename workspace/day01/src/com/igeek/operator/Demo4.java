package com.igeek.operator;

public class Demo4 {

	public static void main(String[] args) {
		
		//��β鿴һ�����Ķ�����  ��   
		String binary = Integer.toBinaryString(-128);
		//0000 0000 0000 0000 0000 0000 0111 1111
		System.out.println(binary);
		
		String result = "1000000111111111111111111111111";
		//111111111111111111111110000000
		System.out.println(result.length());
		
		
		int a = 0;
		System.out.println(~a);
		String binary2 = Integer.toBinaryString(127);
		System.out.println(binary2);
		
		int a2 = -128;
		System.out.println(~a2);
		
		
	}

}