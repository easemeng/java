package com.igeek.day15.thread;

public class MainTest {

	public static void main(String[] args) {
		
		// ������������߳� �� ������Ʊ
		Runnable run = new Ticket();
		Thread t = new Thread(run,"�߳�1");
		Thread t2 = new Thread(run,"�߳�2");
		Thread t3 = new Thread(run,"�߳�3");
		
		t.start();
		t2.start();
		t3.start();

	}

}
