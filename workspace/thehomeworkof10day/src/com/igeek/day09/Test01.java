package com.igeek.day09;

import java.util.ArrayList;

public class Test01 {

	public static void main(String[] args) {
		
		ArrayList<String> list = new ArrayList<String>();
		list.add("�����");
		list.add("��˽�");
		list.add("ɳ����");
		list.add("���ȹ���");
		
		System.out.println(list);
		
		System.out.println(list.get(3));
		
		System.out.println(list.size());
		
		list.remove("���ȹ���");
		
		list.remove(2);
		
		list.set(1, "������");
		
		System.out.println(list);

	}

}
