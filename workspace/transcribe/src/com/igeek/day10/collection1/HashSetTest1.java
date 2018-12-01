package com.igeek.day10.collection1;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Vector;

import org.junit.Test;

public class HashSetTest1 {

	@Test
	public void test8() {
		// ���� �� ���ظ� ��
		// HashSet �ڵ���add���������ݵ�ʱ�� �� ��ʵ����ö���� .equals ���� ��
		HashSet<Person> hs = new HashSet<Person>();
		Person tom = new Person("", 10);
		Person jack = new Person("", 10);
		hs.add(tom);
		hs.add(jack);

		// HashSet ��׼����ͨ����������equals jack.equals(tom) ������ֵΪtrue��ʱ��
		System.out.println(hs.size()); // �ʼ�����װ�˼���Ԫ�أ����� ע�⣺ ��ǰperson�� ��
										// û����дequals ���� �� hashCodeҲû��д

	}

	@Test
	public void test7() {
		// JDK 1.0
		Vector v = new Vector();
		v.add("132");
		v.add("456");

		// ArrayList Ч��Ҫ���� Vector ...
		System.out.println(8888888 % 101);
	}

	@Test
	public void test6() {

		/*
		 * String str1 = "1"; String str2 = "1"; String str3 = new String("1");
		 * System.out.println(str1 == str2); // true System.out.println(str1 ==
		 * str3);
		 */ // false

		// intern()  ���������� �� ��������ַ���ƴ���� ��
		// ���������intern �� ƴ��֮��Ľ�� �� ����������д��� �� Ҳ��ƴ��һ���µĳ��� ��
		String str1 = "ABC";
		String str2 = "EFG";
		String str4 = "ABCEFG";
		String str3 = (str1 + str2).intern();
		System.out.println(str3 == str4);

	}

	// ���� �� ���ж����������Ƿ���� �� ֻҪ�����ǵ������Ƿ������ �Ϳ����� �� ������������ڴ��ַ �� ��Ҫ��дequals����
	// ע��: һ����д�����equals���� �ͱ�����д��֮��Ӧ��hashCode���� ��
	@Test
	public void test5() {

		ArrayList<Person> list1 = new ArrayList<Person>();

		list1.add(new Person("", 10)); // new Person("�ܿ�",10)
		list1.add(new Person("", 20));
		list1.add(new Person("", 30));

		boolean b = list1.contains(new Person("", 10)); // new Person("�ܿ�",10)
		System.out.println(b); // Object

	}

	@Test
	public void test4() {
		ArrayList<String> list = new ArrayList<String>();
		list.add("");
		list.add("jack");
		list.add("");
		// String ������д�� Object �� equals ���� �� ��Ҫ�������� ѭ���Ա� ÿһ��Ԫ���Ƿ����
		// "Jack".equals("ÿһ��Ԫ��"); �������ֵ��ͬ���ͷ����±� ��
		boolean b = list.contains("jack");
		// contains(Object o)  ������б�����ָ����Ԫ�أ��򷵻� true ��
		System.out.println(b);

	}

	@Test
	public void test3() {
		// ArrayList ...

		// == equals ����������
		/*
		 * 1������==����������ڻ����������͵ı�������ֱ�ӱȽ���洢�� ��ֵ���Ƿ���ȣ�
		 * 
		 * ����������������͵ı�������Ƚϵ�����ָ��Ķ���ĵ�ַ
		 * 
		 * 2������equals������ע�⣺equals�������������ڻ����������͵ı���
		 * 
		 * ���û�ж�equals����������д����Ƚϵ����������͵ı�����ָ��Ķ���ĵ�ַ��
		 * 
		 * ����String��Date�����equals������������д�Ļ����Ƚϵ�����ָ��Ķ�������ݡ�
		 */
		Person tom = new Person();
		Person jack = new Person();
		System.out.println(tom.equals(jack));

	}

	@Test
	public void test2() {

		/**
		 * ��һ���ַ���"aiodjl;hriWFUADJSVUEHiowfjnivowe" ��һ���м������ظ�����ĸ ���ִ�Сд����a A
		 * �������ַ�
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
		// Set �ӿ� �� �ֽ�Set���� ��
		// 1.�������ظ� �� 2.����

		HashSet<String> hs = new HashSet<String>();
		hs.add("ABC");
		hs.add("ABC2");
		hs.add("ABC3");
		hs.add("ABC");
		hs.add("ABC4");
		hs.add("ABC5");

		// hs.remove("ABC");

		System.out.println(hs);

		// ��Ҫ���� �� Set ���� 
		System.out.println("ABC3".hashCode());
	}

}