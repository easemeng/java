package com.igeek.maptest;

import java.util.LinkedHashMap;

public class Main2 {

	@SuppressWarnings({ "unchecked", "rawtypes" })
	public static void main(String[] args) {
		
		LinkedHashMap lhm = new LinkedHashMap();
		
		// ������ HashMap �е����� ��
		lhm.put("��а", "��ҩʦ");
		lhm.put(null, null);
		lhm.put("����", "����");
		//
		System.out.println(lhm.toString());

	}

}