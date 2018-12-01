package com.igeek.single2;

public class Singleton {
	
	// ����ʽ		ֻ����   ����ֵ �� 
	private static Singleton single;
	
	private Singleton(){
		
	}
	
	// ����ʽ		�����̰߳�ȫ���� �� 	Singleton.class
	public static synchronized Singleton getInstance(){
		
		if(single == null){
			single = new Singleton();
		}
		return single;
	}
	
	public void chi(){
		System.out.println("��...");
	}

}
