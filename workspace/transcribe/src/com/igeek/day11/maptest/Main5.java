package com.igeek.day11.maptest;

import java.util.Arrays;
import java.util.List;

public class Main5 {

	public static void main(String[] args) {
		
		//
		List<String> list = Arrays.asList("tom","jack","rose");
		
		// Arrays.asList �����򼯺���������� �� 
		
		// ע�� �� ����ֵ	 list ����	������������ɾ������ �� 
		list.add("trump");
		// UnsupportedOperationException ��֧�ֵĲ����쳣
		System.out.println(list);

	}

}
