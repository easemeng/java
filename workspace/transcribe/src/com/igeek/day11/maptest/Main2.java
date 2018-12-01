package com.igeek.day11.maptest;

import java.util.LinkedHashMap;

public class Main2 {

	public static void main(String[] args) {
		
		LinkedHashMap lhm = new LinkedHashMap();
		
		// 方法跟 HashMap 中的类似 。
		lhm.put("东邪", "黄药师");
		lhm.put(null, null);
		lhm.put("北侠", "郭靖");
		//
		System.out.println(lhm.toString());

	}

}
