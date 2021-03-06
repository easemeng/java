package com.igeek.day10.collection1;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Vector;

import org.junit.Test;

public class HashSetTest3 {

	@Test
	public void test8() {
		// 无序 ， 不重复 。
		// HashSet 在调用add方法存数据的时候 。 其实会调用对象的 .equals 方法 。
		HashSet<Person> hs = new HashSet<Person>();
		Person tom = new Person("", 10);
		Person jack = new Person("", 10);
		hs.add(tom);
		hs.add(jack);

		// HashSet 标准就是通过两个对象equals jack.equals(tom) 如果这个值为true的时候
		System.out.println(hs.size()); // 问集合中装了几个元素？？？ 注意： 当前person类 ，
										// 没有重写equals 方法 ， hashCode也没重写

	}

	@Test
	public void test7() {
		// JDK 1.0
		Vector v = new Vector();
		v.add("132");
		v.add("456");

		// ArrayList 效率要高于 Vector ...
		System.out.println(8888888 % 101);
	}

	@Test
	public void test6() {

		/*
		 * String str1 = "1"; String str2 = "1"; String str3 = new String("1");
		 * System.out.println(str1 == str2); // true System.out.println(str1 ==
		 * str3);
		 */ // false

		// intern()  方法的作用 。 假如出现字符串拼接了 。
		// 如果不调用intern ， 拼接之后的结果 ， 如果常量池中存在 ， 也会拼接一个新的出来 。
		String str1 = "ABC";
		String str2 = "EFG";
		String str4 = "ABCEFG";
		String str3 = (str1 + str2).intern();
		System.out.println(str3 == str4);

	}

	// 需求 ， 想判断两个对象是否相等 ， 只要看他们的属性是否想相等 就可以了 ， 而不看对象的内存地址 。 需要重写equals方法
	// 注意: 一旦重写了类的equals方法 就必须重写与之对应的hashCode方法 。
	@Test
	public void test5() {

		ArrayList<Person> list1 = new ArrayList<Person>();

		list1.add(new Person("", 10)); // new Person("杰克",10)
		list1.add(new Person("", 20));
		list1.add(new Person("", 30));

		boolean b = list1.contains(new Person("", 10)); // new Person("杰克",10)
		System.out.println(b); // Object

	}

	@Test
	public void test4() {
		ArrayList<String> list = new ArrayList<String>();
		list.add("");
		list.add("jack");
		list.add("");
		// String 类中重写了 Object 的 equals 方法 ， 主要的作用是 循环对比 每一个元素是否相等
		// "Jack".equals("每一个元素"); 如果发现值相同，就返回下标 。
		boolean b = list.contains("jack");
		// contains(Object o)  如果此列表包含指定的元素，则返回 true 。
		System.out.println(b);

	}

	@Test
	public void test3() {
		// ArrayList ...

		// == equals 方法的区别
		/*
		 * 1）对于==，如果作用于基本数据类型的变量，则直接比较其存储的 “值”是否相等；
		 * 
		 * 如果作用于引用类型的变量，则比较的是所指向的对象的地址
		 * 
		 * 2）对于equals方法，注意：equals方法不能作用于基本数据类型的变量
		 * 
		 * 如果没有对equals方法进行重写，则比较的是引用类型的变量所指向的对象的地址；
		 * 
		 * 诸如String、Date等类对equals方法进行了重写的话，比较的是所指向的对象的内容。
		 */
		Person tom = new Person();
		Person jack = new Person();
		System.out.println(tom.equals(jack));

	}

	@Test
	public void test2() {

		/**
		 * 求一个字符串"aiodjl;hriWFUADJSVUEHiowfjnivowe" 中一共有几个不重复的字母 区分大小写，如a A
		 * 算两个字符
		 */
		HashSet<Character> set = new HashSet<Character>();

		String str = "aiodjl;hriWFUADJSVUEHiowfjnivowe";
		char[] chars = str.toCharArray();
		for (int i = 0; i < chars.length; i++) {
			// char c = chars[i];
			if (chars[i] >= 'a' && chars[i] <= 'z' || chars[i] >= 'A' && chars[i] <= 'Z') {
				set.add(chars[i]);
			}
		}
		System.out.println(set.size());

	}

	@Test
	public void test1() {
		// Set 接口 。 又叫Set集合 。
		// 1.不允许重复 。 2.无序

		HashSet<String> hs = new HashSet<String>();
		hs.add("ABC");
		hs.add("ABC2");
		hs.add("ABC3");
		hs.add("ABC");
		hs.add("ABC4");
		hs.add("ABC5");

		// hs.remove("ABC");

		System.out.println(hs);

		// 想要遍历 。 Set 集合 
		System.out.println("ABC3".hashCode());
	}

}
