package com.igeek.hello;

public class Operator4 {

	public static void main(String[] args) {
		
		//  >  <   >=  <=   ==  != 
		
		System.out.println(3>4);//f
		System.out.println(4<5);//t
		System.out.println(3>=3);//t
		System.out.println(5<=5);//t
		
		System.out.println(10 == 1);//t
		
		System.out.println(10!=20);//t
		
		//�߼������ �������ӣ��Ƚ�����ġ�   3<x<5
		
		int x = 4;
		
		//& �߼���  | �߼���   ! ��     ^ ���
		System.out.println(3<x&x<5);//true & true  
		
		// &   ���߽����Ϊtrue ���ս������true  
		// |   ������һ��Ϊtrue ���ս������true
		// !   !true  �����false    !false �������true
		
		//��·������߼���������� ��
		//�߼������ ���������  �ұ߶���������� �� int x = 0;   x>3&x++>=1
		//��·���㣬�ض�������£��ұ߲��������㡣(�ұߵĴ��벻�ᱻִ�С�)
		//  && ���Ϊfalse,�ұ߲��ü����ˡ�  false
		//  || ���Ϊtrue���ұ߲��ü����ˡ� true
		
		int a=0;
		int b=10;
		a+=b+=b+=b;
		System.out.println(a);
	}

}
