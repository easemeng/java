package com.igeek.day09.generic4;

import java.util.ArrayList;

public class GenericTest4 {

	public static void main(String[] args) {
		
		ArrayList<String> list = new ArrayList<String>();
		list.add("ɽ��ľ��ľ��֦");
		list.add("���þ������֪");
		
		ArrayList<Integer> list1 = new ArrayList<Integer>();
		list1.add(999);
		list1.add(666);
		
		ArrayList<Object> students = new ArrayList<Object>();
		
		Person<Student> p = new Student<Student>();
		// p.d
		//  ָ���˷��͵��ϱ߽�	�±߽�
		p.dream(students);

	}

}
