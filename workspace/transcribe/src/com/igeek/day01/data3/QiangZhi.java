package com.igeek.day01.data3;

public class QiangZhi {

	public static void main(String[] args) {
		
		/**
		 * ǿ������ת��
		 * 
		 * byte short char    int long float double
		 * 
		 * С���������� ת���ɴ����������  ��ʽת�� �Զ����
		 * 
		 * �����������ת����С����������   ǿ��ת��  ��Ҫ���ֶ�ȥָ��
		 * ��ʽ ��    Ŀ������  ��������  = (Ŀ������) ԭʼ����
		 * 		long a = 100��
		 * 		int b = ��int�� a�� 
		 */
		// int b = 10;
		// long a = b;  // ��ʽת��
		
		long a = 10;
		int b = (int)a;  // ǿ��ת�� ��  ��Ҫ���� ������Ҫ���������ͣ�
		// ǿ��ת�����ܻ��������  ���ȵĽ��� �����ݵĶ�ʧ
		
		int i = 10;
		byte b2 = (byte)a;  // ����װ�µ�ʱ��û���κ�����
		System.out.println(b2);
		
		float f1 = 56443.465464864443F;  // float ���ͱ�ʾ������  ��Ч��λ8
		System.out.println(f1);
		
		double d1 = 87987.67965464444446469468;  // double  ��ʾ˫����
		System.out.println(d1);
		
		float f2 = (float)d1;
		System.out.println(f2);

	}

}
