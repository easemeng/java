package com.igeek.day09;

import java.util.ArrayList;

public class Test06 {

	public static void main(String[] args) {

		ArrayList<String> list = new ArrayList<String>();

		list.add("ab1");
		list.add("123ad");
		list.add("bca");
		list.add("dadfadf");
		list.add("dddaaa");
		list.add("��ð�1");
		list.add("������1");
		list.add("���ܰ�");

		System.out.println(list);

		for (int i = 0; i < list.size(); i++) {
			if (list.get(i).length() > 5) {
				list.remove(i);
				i--;
			}
		}
		System.out.println(list);

		for (int i = 0; i < list.size(); i++) {
			char[] ch = list.get(i).toCharArray();
			boolean ea = rm(ch);
			if (ea) {
				list.remove(i);
				i--;
			}
		}
		System.out.println(list);
	}

	public static boolean rm(char[] ch) {

		boolean flag = false;
		for (int j = 0; j < ch.length; j++) {
			if (ch[j] >= '0' & ch[j] <= '9') {
				flag = true;
			}
		}
		return flag;
	}

}
