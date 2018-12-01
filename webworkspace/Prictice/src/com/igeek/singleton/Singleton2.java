package com.igeek.singleton;

// ����ģʽ��������ʽ(�̲߳���ȫ)
public class Singleton2 {
	
	private Singleton2(){};
	
	private static Singleton2 singleton;
	
	public static Singleton2 getSingleton() {

		if(singleton == null){
			singleton = new Singleton2();
		}
		return singleton;
	}

}

// ����ʽ�����̰߳�ȫ
class Singleton21 {
	
	private Singleton21(){};
	
	private static Singleton21 singleton;
	
	public static synchronized Singleton21 getSingleton() {

		if(singleton == null){
			singleton = new Singleton21();
		}
		return singleton;
	}

}

// ˫����У��
class Singleton22{
	
	private Singleton22() {};
	
	private volatile static Singleton22 singleton;
	
	public static Singleton22 getInstance() {
		if (singleton == null) {
			synchronized (Singleton22.class) {
				if (singleton == null) {
					singleton = new Singleton22();
				}
			}
		}
		return singleton;
	}
	
}
