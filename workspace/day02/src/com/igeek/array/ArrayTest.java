package com.igeek.array;

public class ArrayTest {

	@SuppressWarnings("unused")
	public static void main(String[] args) {
		//�����������ʽ��
		//��ʽ1�������е��������� [] ��������;���Ƽ���ʽ��
		//��ʽ2�������е��������� �������� [];�����Ƽ���
		
		int arrays1[];
		//arrays1[0] = 1;
		//����ĸ�ֵ��ʽ �� 1
		int [] arrays = new int [5];  //5 ��ʾ����ĳ��� �� ������Ԫ�صĸ��� �� 
		arrays[0] = 19;
		arrays[1] = 97;
		arrays[2] = 03;
		arrays[3] = 03;
		arrays[4] = 520;
		//arrays[5] = 1314;  ArrayIndexOutOfBoundsException  ����������±������쳣
		
		//��̬������ʽ �� ��̬��ʼ����ʽ �� 
		String [] strs = {"ASD","FGH","JKL"};
		
		String [] strs1 = new String[3];
		strs1[0] = "123";
		strs1[1] = "123";
		strs1[2] = "123";
		
		//��ȡ�����еĵ�һ���� �� ͨ�� 		��������[�±�־]		����ȡָ��Ԫ�� �� 
		System.out.println(strs1[2]);
		
		//��λ������ĳ���   ��������.length		��λ���ַ������� �� �ַ�������.length();	��С���ŵľ��Ƿ����� 
		System.out.println(strs.length);
		
		
		
		
		
		
		

	}

}