package com.igeek.day09.test1;

import java.util.ArrayList;
import java.util.Iterator;

public class MainTest2 {

	public static void main(String[] args) {
		
		ArrayList<Person> list = new ArrayList<Person>();
		
		list.add(new Person("",1));
		list.add(new Person("",2));
		list.add(new Person("",3));
		list.add(new Person("",4));
		
		int sumAge = 0;
		ArrayList<Person> newlist = new ArrayList<Person>();
		Iterator<Person> ite = list.iterator();
		
		while(ite.hasNext()){
			Person thisNum = ite.next();
			if(thisNum.getAge() == 18){
				// ������ = 18		�����µļ������������
				newlist.add(new Person("LGD",90));
				// ע�� �� ��ʱ�ڵ������������ϵ�ʱ�� �� �������ԭʼ�������޸Ĳ��� �� 
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
		
		// ����һ���µļ��϶��� �� ��������д��ÿһ��90���� �� װ��֮�� �� �ٰ�����µļ��� �� �ŵ��ϵļ����С�

	}

}
