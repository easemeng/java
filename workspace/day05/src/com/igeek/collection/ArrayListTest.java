package com.igeek.collection;

import java.util.ArrayList;

import com.igeek.objarr.Phone;

//collection ���Ͽ�� ��
public class ArrayListTest {

	public static void main(String[] args) {

		//���� ��
		ArrayList<Object> list = new ArrayList<Object>();
		
		list.add("hello");
		list.add(123);
		list.add(new Phone());
		list.add(null);
		list.add("sadfs");
		System.out.println(list.size());
		
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}
		
		//size() ��ʾ���ϵĴ�С ��
		//add() ������������Ԫ�ء�
		//get(int index) ��ȡָ���±�����Ӧ��Ԫ�ء�
		
	}

}