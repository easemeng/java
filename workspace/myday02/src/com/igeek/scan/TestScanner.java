package com.igeek.scan;

import java.util.Scanner;

public class TestScanner {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		//String str = sc.nextLine();//nextLine ������ʾ���ܿ���̨��������ݣ���������ַ�����ʽ��
		
		//System.out.println(str);
		
		int i = sc.nextInt();//������nextInt()������ʱ��Ҫ����������ݱ���Ϊ���֣����������쳣��
		
		System.out.println(i);//InputMismatchException���벻ƥ���쳣��
		
		
	}

}
