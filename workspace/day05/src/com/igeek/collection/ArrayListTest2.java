package com.igeek.collection;

import java.util.ArrayList;

//�̳�  
//��java��Ĭ��������ĸ��඼��object �� ��  
//���˼̳й�ϵ֮�� �������̳и��������е����Ը����� ��(ע�⣺˽�����Ը��������ܱ�������á�)
public class ArrayListTest2 {
	/**
	 * 
	 * java��  ����8�ֻ����������Ͷ���  ���������Լ��İ�װ�� ��
	 * 			�ѻ�����������Ҳ��ɶ����� ��
	 * 
	 * byte  ��װ�����  Byte
	 * short  		 Short 
	 * int           		Integer
	 * long 		 Long
	 * 
	 * char          		Character
	 * boolean 		 Boolean
	 * float         Float
	 * double		 Double
	 * 
	 */
	public static void main(String[] args) {
		//����  ����������Լ��   �����е��������� ��<String>  ֻ�ܷ�string���͡�
		ArrayList<Integer> list = new ArrayList<Integer>();
		
		list.add(123);
		list.add(456);
		list.add(789);
		
		//list.remove(0);
		//list.set(0, 888);
		//System.out.println(list);
		
		//����.length  ���� 
		//����.length()   �ַ���
		//����.size()   ����
		for (int i = 0; i < list.size(); i++) {
			Integer in = list.get(i);
			System.out.println(in);
		}
	}

}