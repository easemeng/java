package com.igeek.day09.generic5;

import java.util.ArrayList;

public class Test3 {

	public static void main(String[] args) {
		
		ArrayList<String> list1 = new ArrayList<String>();
		list1.add("L");
		list1.add("O");
		
		ArrayList<String> list2 = new ArrayList<String>();
		list2.add("V");
		list2.add("E");
		
		list1.addAll(list2);
		
		for (String string : list1) {
			System.out.println(string);
		}

	}

}
