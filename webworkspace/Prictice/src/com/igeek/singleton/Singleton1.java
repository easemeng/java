package com.igeek.singleton;

// ����ģʽ��������ʽ
public class Singleton1 {
	
	private Singleton1(){};
	
	private static Singleton1 singleton = new Singleton1();
	
	public static Singleton1 getSingleton(){
		return singleton;
	}
	
}

// ����ʽ
class Singleton11{
	
	private static Singleton11 singleton;
	static{
		singleton = new Singleton11();
	}
	
	public Singleton11 getSingleton() {

		return singleton;

	}
	
}