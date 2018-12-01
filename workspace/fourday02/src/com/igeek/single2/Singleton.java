package com.igeek.single2;

public class Singleton {
	
	// 懒汉式		只声明   不赋值 。 
	private static Singleton single;
	
	private Singleton(){
		
	}
	
	// 懒汉式		存在线程安全问题 。 	Singleton.class
	public static synchronized Singleton getInstance(){
		
		if(single == null){
			single = new Singleton();
		}
		return single;
	}
	
	public void chi(){
		System.out.println("吃...");
	}

}
