package com.igeek.thread;

public class DeadLockThreadDemo {

	// 定义了锁1与锁2的对象
	public static Object LOCK1 = new Object();
	public static Object LOCK2 = new Object();
	
	public static void main(String[] args) {
		
		DeadLockThread thread1 = new DeadLockThread(true);
		DeadLockThread thread2 = new DeadLockThread(false);
		
		thread1.start();
		thread2.start();

	}

}
