package com.igeek.operator;

import java.util.Scanner;

public class Demo5 {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		
		//String binary = Integer.toBinaryString(-3);
		//System.out.println(binary);
		
		//��Ԫ���� ����Ŀ���㡣
		//�﷨����    (�������͵ı��ʽ)?���1:���2;   ���1�����2���������ͱ���һ�¡�
		//�Ӽ�������һ������ ���ж�һ�� �����������������ż�� ��
		
		//��δӼ��̻�ȡ���� ��
		Scanner sc = new Scanner(System.in);
		System.out.println("���������֡�");
		int input = sc.nextInt();//sc.nextInt(); ��ʾ��ȡ�������ݲ�������ת����int���͡�
		
		int result = (input%2==0)?1:0;
		
		System.out.println(result);
		
		
		//�ӿ���̨���������� ��Ȼ�������������������ֵ �� ��һ����Ԫ���ʽ�㶨��
	}

}
