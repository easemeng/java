package com.igeek.day01.data2;

public class QiangZhi {

	public static void main(String[] args) {
		
		/**
		 * ǿ������ת�� �� 
		 * 
		 * byte short char   int  long  float  double  ...
		 * 
		 * С���������ͣ�ת���ɴ����������   ��ʽת��  �Զ����
		 * 
		 * ����������� ת����С����������  ǿ��ת��  ��Ҫ�ֶ�ָ��  ��ʽ��
		 *    Ŀ�����	�������� = ��Ŀ�����ͣ�ԭʼ����;
		 *    long a = 10;
		 *    int b = (int) a;
		 *    
		 */
		
		// int a = 10;
		// long b = a;  // ��ʽת��
		
		long a = 10;
		int b = (int)a;  // ǿ��ת�� ��  ��Ҫ���루��Ҫת�������� ��
		// ǿ��ת�����ܻ��������  ���ȵĽ��ͻ������ݵĶ�ʧ
		
		int i = 100;
		byte b2 = (byte)i;  // ����װ�µ�ʱ��û���κ�����
		System.out.println(b2);
		
		float f1 = 584461.545456465464F;  // float ���ͱ�ʾ������  ��Ч��λ8
		System.out.println(f1);
		
		double d1 = 54646.67687867897647646464;  // double ��ʾ˫����
		System.out.println(d1);
		
		float f2 = (float)d1;
		System.out.println(f2);

	}

}
