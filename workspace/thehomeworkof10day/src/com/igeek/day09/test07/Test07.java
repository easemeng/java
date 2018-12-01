package com.igeek.day09.test07;

import java.util.ArrayList;

public class Test07 {

	public static void main(String[] args) {
		
		ArrayList<Integer> list = new ArrayList<Integer>();
		
		list.add(1);
		list.add(5);
		list.add(6);
		list.add(5);
		list.add(4);
		list.add(5);
		list.add(8);
		list.add(9);
		list.add(3);
		list.add(3);
		list.add(5);
		list.add(4);
		System.out.println(list);
		MyArrays.reverse(list);
		System.out.println(list);
		
		System.out.println(MyArrays.max(list));
		
		System.out.println(MyArrays.min(list));
		
		System.out.println(MyArrays.indexOf(list, 6));
		
		MyArrays.replaceAll(list, 5, 0);
		
		System.out.println(list);

	}

}
