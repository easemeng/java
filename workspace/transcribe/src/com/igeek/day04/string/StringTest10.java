package com.igeek.day04.string;

import java.util.Scanner;

public class StringTest10 {
	//��ת�ַ�����
	public static void main(String[] args) {
		System.out.println("�ӿ���̨�������ݣ�");
		Scanner sc =new Scanner(System.in);
		String str  = sc.nextLine();
		String result = reverse(str);
		System.out.println(result);
	}

	//��ת�Ĺ��ܷ�װ�������С�
	public static String reverse(String str){
		char [] arrays = str.toCharArray(); 
		
		for (int i = 0; i < arrays.length/2; i++) {
			  char temp = arrays[i];
			  arrays[i] = arrays[arrays.length-i-1];
			  arrays[arrays.length-i-1]=temp;
		}
		String result = new String(arrays);
		return result;
	}
	
	
	
	
	public static String reverse2(String str){
		char [] arrays = str.toCharArray(); 
		
		for (int i = 0; i < arrays.length/2; i++) {
			  char temp = arrays[i];
			  arrays[i] = arrays[arrays.length-i-1];
			  arrays[arrays.length-i-1]=temp;
		}
		String result = new String(arrays);
		return result;
	}
	
	
	
	
	public static String reverse3(String str){
		char [] arrays = str.toCharArray(); 
		
		for (int i = 0; i < arrays.length/2; i++) {
			  char temp = arrays[i];
			  arrays[i] = arrays[arrays.length-i-1];
			  arrays[arrays.length-i-1]=temp;
		}
		String result = new String(arrays);
		return result;
	}
	
	
	
	
	public static String reverse4(String str){
		char [] arrays = str.toCharArray(); 
		
		for (int i = 0; i < arrays.length/2; i++) {
			  char temp = arrays[i];
			  arrays[i] = arrays[arrays.length-i-1];
			  arrays[arrays.length-i-1]=temp;
		}
		String result = new String(arrays);
		return result;
	}
	
	
	
	
	public static String reverse5(String str){
		char [] arrays = str.toCharArray(); 
		
		for (int i = 0; i < arrays.length/2; i++) {
			  char temp = arrays[i];
			  arrays[i] = arrays[arrays.length-i-1];
			  arrays[arrays.length-i-1]=temp;
		}
		String result = new String(arrays);
		return result;
	}
}
