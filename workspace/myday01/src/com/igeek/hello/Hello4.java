package com.igeek.hello;

public class Hello4 {

	public static void main(String[] args) {
		//�������͵�ת�� ��
		//��ʽת�� ��(��С���������ͣ���ɴ����������) �Զ���ɵ� ��
		byte b1 = 100;  //1  -128  -  127     1L
		
		int i1 = b1;  //  4L   
		
		System.out.println(i1);
		
		//ǿ��ת��(��ʾת��)�� (�Ӵ���������ͣ����С����������)  ��Ҫʹ��ǿ��ת����
		
		int i2 = 128;//  4
		
		byte b2 = (byte)i2; // 1    ������������Ƚ��͡�
		
		System.out.println(b2);
		
	}

}
