package com.igeek.iteratorDome;

import java.util.ArrayList;
import java.util.Iterator;

public class IteratorDemo {
	
	public static void main(String[] args) {
		
		// �������϶���
		ArrayList<Integer> list = new ArrayList<Integer>();
		
		// �򼯺������Ԫ��
		list.add(10);
		list.add(100);
		list.add(1000);
		
		// ���ü��ϵ�iterator����  ���ص���������
		Iterator<Integer> ite = list.iterator();
		
		// ���ʹ��hasNext �� next ������ѭ����ȡԪ��
		while(ite.hasNext()){
			// �����Ԫ�ؾͻ�ȡԪ��
			Integer thisNumber = ite.next();
			System.out.println(thisNumber);
		}
		
	}

}
