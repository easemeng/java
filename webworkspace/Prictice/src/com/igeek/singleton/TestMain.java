package com.igeek.singleton;

import org.junit.Test;

public class TestMain {
	
	@Test
	public void test1(){
		Singleton1 s1 = Singleton1.getSingleton();
		Singleton1 s2 = Singleton1.getSingleton();
		
		Runtime runtime = Runtime.getRuntime();
		
		boolean flag = (s1==s2);
		System.out.println(flag);
	}
	
	@Test
	public void test2(){
		Singleton2 s3 = Singleton2.getSingleton();
		Singleton2 s4 = Singleton2.getSingleton();
		
		boolean flag = (s3==s4);
		System.out.println(flag);
	}
	
	@Test
	public void test3(){
		
		Singleton5 singleton = Singleton5.SINGLETON;
		singleton.Singleton();
	}
}
