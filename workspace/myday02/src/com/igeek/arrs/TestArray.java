package com.igeek.arrs;

public class TestArray {

	@SuppressWarnings("unused")
	public static void main(String[] args) {
		// ���� �� �洢���ݵġ�

		// java�����ݵ�������ʽ ��

		//����Ķ�̬������ʽ��
		int[] arrays = new int[3];
		arrays[0] = 10;
		arrays[1] = 20;
		arrays[2] = 30;  //����.length - 1  �������������±ꡣ
		
		//arrays[3] = 40;//ArrayIndexOutOfBoundsException �����±�Խ���쳣��
		
		
		//����ĵڶ��ִ�����ʽ����̬������ʽ��
		int [] arrays2 = new int []{2,3,5,7};
		//���Լ�д��  һ�·�ʽ��
		int [] arrays3 = {2,3,5,7};
		
		
		System.out.println(arrays.length);//����ĳ��� ʹ�ö���.length ����ʾ��
		System.out.println(arrays2.length);
		System.out.println(arrays3.length);
		
		//����洢���ݴ���ȱ�� ��  1.һ�����鱻���� ���Ȳ��ܱ��ı� �� 2.�����е��������ͱ���һ�¡�
		String [] strs = {"a","b","c"};
		
		
	}

}
