package com.igeek.thread;

public class DeadLockThreadDemo {

	// ��������1����2�Ķ���
	public static Object LOCK1 = new Object();
	public static Object LOCK2 = new Object();
	
	public static void main(String[] args) {
		
		DeadLockThread thread1 = new DeadLockThread(true);
		DeadLockThread thread2 = new DeadLockThread(false);
		
		thread1.start();
		thread2.start();

	}

}
