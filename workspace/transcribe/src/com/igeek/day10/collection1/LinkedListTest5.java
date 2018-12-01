package com.igeek.day10.collection1;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Stack;

import org.junit.Test;

public class LinkedListTest5 {
	
	@Test
	public void test2(){
		// 实现队列
		LinkedList<String> list = new LinkedList<String>();
		
		// offer(E e)   将指定的元素添加为此列表的尾部（最后一个元素）。
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
		// LinkedList 中对于栈的实现
		LinkedList<String> list = new LinkedList<String>();
		list.push("123");
		list.push("456");
		list.push("789");
		
		// list.poll();  检索并删除此列表的头（只显示头部元素 即第一个元素）
		String str = list.poll(); // Object
		System.out.println(str);
		// list.peek();  检索但不删除此列表的头（只显示头部元素 即第一个元素）
		String str1 = list.peek();
		System.out.println(str1);
		
		
	}
	
	@Test
	public void test(){
		// Vector,ArrayList  实现方式 同样都是对象数组
		// 效率低下 。 Vector的一个子类 ， 从JDK1.0开始
		Stack stack = new Stack();
		stack.push("789");
		stack.push("987");
		stack.push("897");
		
	}
	
	@Test
	public void ss(){
		
		// ArrayList	// LinkedList ...   都是集合 。 都是List接口的实现类。
		// ArrayList	多用在遍历。
		// LinkedList	多用在需要频繁修改的集合上 。
		
		LinkedList<String> list = new LinkedList<String>();
		
		list.add("159");
		list.add("357");
		list.add("852");
		
		list.addFirst("999");
		list.addLast("666");
		
		// System.out.println(list);
		// System.out.println(list.getLast());
		// System.out.println(list.getFirst());
		
		// 后面讲的集合  就没有下标可以用了 。 
		// System.out.println(list.get(1));
		// 1.ArrayList . 循环添加20W条元素 。  0...
		
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}
		
		// 迭代器
		Iterator ite = list.iterator();
		while(ite.hasNext()){
			// 如果不调用  .hasNext()方法 ， 会出现一个异常	NoSuchElementException
			System.out.println(ite.next()); // 取出元素 ， 移动指针 。 
		}
		
		for(Iterator ite1 = list.iterator();ite1.hasNext();){
			System.out.println(ite1.next());
		}
		
		for (String string : list) {
			System.out.println(string);
		}
		
	}

}
