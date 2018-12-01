package com.igeek.test1;

import java.util.ArrayList;
import java.util.List;

import org.junit.Before;
import org.junit.Test;

public class Test1 {
	
	// null
	private List list;
	
	// @Before 一般用来给属性赋值
	@Before
	public void test2(){
		
		list = new ArrayList();
		list.add("1");
		list.add("2");
		list.add("3");
		list.add("4");
		list.add("5");
		
	}
	
	@Test
	public void test(){
		for (Object object : list) {
			System.out.println(object);
		}
	}

}
