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
		
		// Collections.shuffle(list);  // ���� �� ���Դ���ԭʼ���ϵ�˳��
		// Collections.reverse(list);  // ���ϵķ�ת
		// Collections.sort(list);  // ����
		// Collections.reverse(list);
		
		// ע�⣺ʹ�ö��ֲ��ҷ���ʱ�� �� Ӧ�������� �� Ȼ����ܲ�����ȷ �� 
		
		Integer i = Collections.binarySearch(list, 30);  // -5
		// System.out.println(list);
		System.out.println(i);
		// 0 - 100		60

	}

}
