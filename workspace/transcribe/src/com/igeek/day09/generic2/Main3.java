package com.igeek.day09.generic2;

import com.igeek.day09.test1.Person;

public class Main3 {

	public static void main(String[] args) {
		
		GenericTest gt = new GenericTest();
		String str = gt.set("123"); // 子类	子类对象  =（子类）父类
		System.out.println(str);
		
		boolean flag = gt.set(true);
		System.out.println(flag);
		
		Person p = gt.set(new Person());
		System.out.println(p);
		
		Integer i = gt.set(123);
		System.out.println(i);

	}

}
