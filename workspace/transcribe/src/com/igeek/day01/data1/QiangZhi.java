package com.igeek.day01.data1;

public class QiangZhi {

	public static void main(String[] args) {
		
		/**
		 * ǿ������ת��
		 * 
		 * byte , short , char , int long float double ...
		 * 
		 * С���������� �� ת���ɴ���������� �� ��ʽת��  �Զ����
		 * 
		 * ����������� �� ת����С���������� �� ǿ��ת�� �� ��Ҫ���ֶ���ȥָ�� �� ��ʽ����
		 * 		Ŀ������  ��������  = ��Ŀ�����ͣ� ԭʼ����;
		 * 		long a = 10;
		 * 		int b = (int) a;
		 */
		
		// int a = 10;
		// long b = a;  // ��ʽת�� ��
		
		long a = 10;
		int b = (int) a;  // ǿ��ת�� ��  ��Ҫ���루��Ҫת�������ͣ�
		// ǿ��ת�����ܻ�������� �� ���ȵĽ��ͻ������ݵĶ�ʧ
		
		int i = 100;
		byte b2 = (byte)i;  // ����װ�µ�ʱ��û���κ�����
		System.out.println(b2);
		
		float f1 = 1321323.54564654654654F;  // float ��ʾ������ �� ��Чλ��8
		System.out.println(f1);
		
		double d1 = 321315423.4564646464646456456;  // double ��ʾ˫����
		System.out.println(d1);
		
		float f2 = (float) d1;
		System.out.println(f2);

	}

}
