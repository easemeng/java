package com.igeek.test1;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class MainTest1 {
	
	@After
	public void test5(){
		System.out.println("%");
	}
	
	@Before
	public void test4(){
		System.out.println("&");
	}
	
	@After
	public void test3(){
		System.out.println("Uzi");
	}
	
	@Before
	public void test2(){
		System.out.println("世界第一");
	}
	
	@Test
	public void test1(){
		System.out.println("ADC");
	}

}
