package com.igeek.test1;

import java.util.ArrayList;
import java.util.Iterator;

public class Test1 {

	@SuppressWarnings("rawtypes")
	public static void main(String[] args) {
		
		// ArrayList	�ײ�ʹ��Object [] ������
		
		// ����ӷ��͵�ʱ�� �� һ��Ҫָ�������������͵İ�װ�� �� 
		ArrayList<Integer> list = new ArrayList<Integer>();
		list.add(10);
		list.add(20);
		list.add(30);
		
		// �������ϵķ�ʽ �� 
		/*for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}*/
		
		/*for (Integer integer : list) {
			System.out.println(integer);
		}*/
		
		// ʹ�õ��������� ���������� �� 
		// ʹ�õ���������������	�������������� ��	��Ҫ�����ļ���  . iterator  �����Ϳ����õ�һ������������
		/*Iterator ite = list.iterator();
		while(ite.hasNext()){
			System.out.println(ite.next());
		}*/
		
		// for ѭ�� + ����������������
		for(Iterator ite = list.iterator();ite.hasNext();){
			System.out.println(ite.next());
		}
		
		// key - value		��ֵ�Զ�	name - С��

	}

}
