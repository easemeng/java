package com.igeek.test3;

public class Base {
	
	int count = 1;
	
	public void disPlay(){
		System.out.println(count);
		show();
	}
	
	public void show(){
		System.out.println("父类中的show方法");
	}

}
