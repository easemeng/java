package com.igeek.day10.collection1;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Stack;

import org.junit.Test;

public class LinkedListTest1 {
	
	@Test
	public void test2(){
		// ʵ�ֶ���
		LinkedList<String> list = new LinkedList<String>();
		
		// offer(E e)   ��ָ����Ԫ������Ϊ���б���β�������һ��Ԫ�أ���
		list.offer("123");
		list.offer("321");
		list.offer("231");
		
		System.out.println(list);
		
		String str = list.poll();
		System.out.println(str);
		String str1 = list.peek();
		System.out.println(str1);
		
	}
	
	@Test
	public void test1(){
		// LinkedList �ж���ջ��ʵ��
		LinkedList<String> list = new LinkedList<String>();
		list.push("123");
		list.push("456");
		list.push("789");
		
		// list.poll();  ������ɾ�����б���ͷ��ֻ��ʾͷ��Ԫ�� ����һ��Ԫ�أ�
		String str = list.poll(); // Object
		System.out.println(str);
		// list.peek();  ��������ɾ�����б���ͷ��ֻ��ʾͷ��Ԫ�� ����һ��Ԫ�أ�
		String str1 = list.peek();
		System.out.println(str1);
		
		
	}
	
	@Test
	public void test(){
		// Vector,ArrayList  ʵ�ַ�ʽ ͬ�����Ƕ�������
		// Ч�ʵ��� �� Vector��һ������ �� ��JDK1.0��ʼ
		Stack stack = new Stack();
		stack.push("789");
		stack.push("987");
		stack.push("897");
		
	}
	
	@Test
	public void ss(){
		
		// ArrayList	// LinkedList ...   ���Ǽ��� �� ����List�ӿڵ�ʵ���ࡣ
		// ArrayList	�����ڱ�����
		// LinkedList	��������ҪƵ���޸ĵļ����� ��
		
		LinkedList<String> list = new LinkedList<String>();
		
		list.add("159");
		list.add("357");
		list.add("852");
		
		list.addFirst("999");
		list.addLast("666");
		
		// System.out.println(list);
		// System.out.println(list.getLast());
		// System.out.println(list.getFirst());
		
		// ���潲�ļ���  ��û���±�������� �� 
		// System.out.println(list.get(1));
		// 1.ArrayList . ѭ������20W��Ԫ�� ��  0...
		
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}
		
		// ������
		Iterator ite = list.iterator();
		while(ite.hasNext()){
			// ���������  .hasNext()���� �� �����һ���쳣	NoSuchElementException
			System.out.println(ite.next()); // ȡ��Ԫ�� �� �ƶ�ָ�� �� 
		}
		
		for(Iterator ite1 = list.iterator();ite1.hasNext();){
			System.out.println(ite1.next());
		}
		
		for (String string : list) {
			System.out.println(string);
		}
		
	}

}