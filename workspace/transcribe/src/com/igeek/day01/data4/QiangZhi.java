package com.igeek.day01.data4;

public class QiangZhi {

	public static void main(String[] args) {
		
		/**
		 * ǿ������ת��
		 *  byte short char  int long float double 
		 *  С���������ͣ�ת���ɴ���������ͣ���ʽת�����Զ���ɵ� ��
		 *  ����������ͣ�ת����С���������� ��ǿ��ת������Ҫ���ֶ���ȥָ������ʽ���£�
		 *  	Ŀ������  ��������  = (Ŀ������)ԭʼ���� ;
		 *  	long a = 10;
		 *  	int b = (int)a;
		 */
		
		// int a = 10;
		// long b = a;  // ��ʽת��
		
		long a = 10;
		int b = (int)a;  // ǿ��ת��  �� ��Ҫ���루��Ҫת�������ͣ�
		// ǿ��ת�����ܻ�������� �� ���Ƚ��ͻ����ݶ�ʧ
		
		int i = 100;
		byte b2 = (byte)i;  // ����װ�µ�ʱ��û���κ�����
		System.out.println(b2);
		
		float f1 = 154986864.546446486468F;  // float ���ͱ�ʾ������  ��  ��Ч��λ8
		System.out.println(f1);
		
		double d1 = 7676.647674674687468;  // double ��ʾ˫����
		System.out.println(d1);
		
		float f2 = (float)d1;
		System.out.println(f2);

	}

}
