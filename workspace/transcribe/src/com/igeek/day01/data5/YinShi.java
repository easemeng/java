package com.igeek.day01.data5;

public class YinShi {

	public static void main(String[] args) {

		/**
		 * boolean...�ų�����true false ... char ���� �� 1|2
		 * 
		 * byte < short < int < long < float < double 
		 * 		|| 
		 * 		char
		 * 
		 * ����ĵط� �� byte short char ��������֮���������ʱ�򣬶���ͳһ��ת����int���� Ȼ���ٲ�������
		 * ���յ�����������int...
		 */

		// ��ʽ��������ת�� �� ��С���������͵��������������ʽת�����Զ����
		// ����ͬ�����������������ʱ��С���������ͣ����Զ�ת��Ϊ����������ͣ�Ȼ��������
		byte b1 = 12;
		int i1 = 3;
		int result = b1 + i1;
		System.out.println(result);

		short s1 = 3;
		double d1 = 6.14;
		double result2 = s1 + d1;
		System.out.println(result2);

		short s2 = 3;
		int i2 = 3;
		float f2 = 3.0f;
		float result3 = s2 + i2 + f2;
		System.out.println(result3);

		byte bbb = 1;
		short sss = 1;
		char ccc = 'E';
		int result4 = bbb + sss + ccc;
		System.out.println(result4);

	}

}
