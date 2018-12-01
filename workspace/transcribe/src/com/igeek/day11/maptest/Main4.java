package com.igeek.day11.maptest;

import java.util.ArrayList;
import java.util.Collections;

public class Main4 {

	public static void main(String[] args) {
		
		ArrayList<Integer> list = new ArrayList<Integer>();
		list.add(9);
		list.add(12);
		list.add(18);
		list.add(36);
		
		// Collections.shuffle(list);  // 打乱 ， 可以打乱原始集合的顺序
		// Collections.reverse(list);  // 集合的反转
		// Collections.sort(list);  // 排序
		// Collections.reverse(list);
		
		// 注意：使用二分查找法的时候 ， 应该先排序 。 然后才能查找正确 。 
		
		Integer i = Collections.binarySearch(list, 30);  // -5
		// System.out.println(list);
		System.out.println(i);
		// 0 - 100		60

	}

}
