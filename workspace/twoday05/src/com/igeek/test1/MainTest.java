package com.igeek.test1;

import java.util.ArrayList;
import java.util.Iterator;

public class MainTest {

	@SuppressWarnings("unused")
	public static void main(String[] args) {
		
		ArrayList<Person> list = new ArrayList<Person>();
		
		list.add(new Person("jack",18));
		list.add(new Person("rose",20));
		list.add(new Person("Trump",62));
		list.add(new Person("Obm",63));
		
		int sumAge = 0;
		ArrayList<Person> newlist = new ArrayList<Person>();
		Iterator<Person> ite = list.iterator();
		
		while(ite.hasNext()){
			Person thisNum = ite.next();
			if(thisNum.getAge() == 18){
				// ������ = 18		�����µļ�������������
				newlist.add(new Person("LGD",90));
				// ע�� �� ��ʱ�ڵ������������ϵ�ʱ�� �� ��������ԭʼ�������޸Ĳ��� �� 
			}
			
			System.out.println(thisNum.getName() + "\t" + thisNum.getAge());
			sumAge += thisNum.getAge();
		}
		System.out.println(sumAge);
		
		// ���µļ�������ƴ�ӹ���
		list.addAll(newlist);
		
		/**
		 * ��ʽ��
		 *  for(��������  xxx : list){
		 *  	System.out.println(xxx);
		 *  }
		 */
		
		for (Person person : list) {
			Person s = new Person();
			System.out.println(s.getName() + "\t" + s.getAge());
		}
		// ConcurrentModificationException �����޸��쳣��
		
		// ˼·  �� ����һ���µļ��϶��� �� ��������д��ÿһ��90���� �� װ��֮�� �� �ٰ�����µļ��� �� �ŵ��ϵļ����С�

	}

}