package com.igeek.day09.generic4;

import java.util.ArrayList;

public class GenericTest4 {

	public static void main(String[] args) {
		
		ArrayList<String> list = new ArrayList<String>();
		list.add("山有木兮木有枝");
		list.add("心悦君兮君不知");
		
		ArrayList<Integer> list1 = new ArrayList<Integer>();
		list1.add(999);
		list1.add(666);
		
		ArrayList<Object> students = new ArrayList<Object>();
		
		Person<Student> p = new Student<Student>();
		// p.d
		//  指定了泛型的上边界	下边界
		p.dream(students);

	}

}
