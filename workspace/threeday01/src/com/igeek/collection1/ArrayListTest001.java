package com.igeek.collection1;

import java.util.ArrayList;
import java.util.LinkedList;

@SuppressWarnings("unused")
public class ArrayListTest001 {

	@SuppressWarnings({ "rawtypes", "unchecked" })
	public static void main(String[] args) {
		
		long startTime = System.currentTimeMillis();
		// ArrayList list = new ArrayList();
		LinkedList list = new LinkedList();
		for(int i = 0;i < 3000000;i++){
			list.add(i);
		}
		long time = System.currentTimeMillis() - startTime;
		System.out.println(time);

	}

}
