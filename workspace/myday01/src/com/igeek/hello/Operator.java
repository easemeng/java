package com.igeek.hello;

public class Operator {

	@SuppressWarnings("unused")
	public static void main(String[] args) {
		//int a = 199;
		//ע�� ʹ�ó�����ʱ�򣬳���������0 ,������쳣��
		//ArithmeticException ��ѧ�����쳣��
		//int b = a/100;//1.23
		//System.out.println(b);
		
		// ��ȡģ�����ʱ�򣬱�ģ��Ϊ������ʱ��ģֵΪ������
		//  
		int a = -5;
		int b = a % -2;
		System.out.println(b);
		
		
		float f = 314.15F; 
		double f2 = f / 100;
		System.out.println(f/100);
		
		int i = 100;
		System.out.println(i+"");
	}

}
