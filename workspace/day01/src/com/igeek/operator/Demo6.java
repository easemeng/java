package com.igeek.operator;

import java.util.Scanner;

public class Demo6 {

	@SuppressWarnings({ "resource", "unused" })
	public static void main(String[] args) {
		int i = 10 ;//��������  �������� = ֵ��
		//�ӿ���̨���������� ��Ȼ�������������������ֵ �� ��һ����Ԫ����ʽ�㶨��
		Scanner sc = new Scanner(System.in);  //��������    �������� = ֵ��  new �����ġ�
		System.out.println("�������һ������:");
		int input1 = sc.nextInt();
		System.out.println("������ڶ�������:");
		int input2 = sc.nextInt();
		System.out.println("���������������:");
		int input3 = sc.nextInt();
		
		
		//int maxValue = ((input1>input2)?input1:input2)>input3?((input1>input2)?input1:input2):input3;
		
		int step1 = (input1>input2)?input1:input2;
		int maxValue = (step1>input3)?step1:input3;
		
		System.out.println(maxValue);
	}

}