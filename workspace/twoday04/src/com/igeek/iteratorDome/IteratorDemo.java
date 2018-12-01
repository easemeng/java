package com.igeek.iteratorDome;

import java.util.ArrayList;
import java.util.Iterator;

public class IteratorDemo {
	
	public static void main(String[] args) {
		
		// 创建集合对象
		ArrayList<Integer> list = new ArrayList<Integer>();
		
		// 向集合中添加元素
		list.add(10);
		list.add(100);
		list.add(1000);
		
		// 调用集合的iterator方法  返回迭代器对象
		Iterator<Integer> ite = list.iterator();
		
		// 混合使用hasNext 和 next 方法，循环获取元素
		while(ite.hasNext()){
			// 如果有元素就获取元素
			Integer thisNumber = ite.next();
			System.out.println(thisNumber);
		}
		
	}

}
