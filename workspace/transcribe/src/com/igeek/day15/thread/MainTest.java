package com.igeek.day15.thread;

public class MainTest {

	public static void main(String[] args) {
		
		// 创建多个窗口线程 ， 用来售票
		Runnable run = new Ticket();
		Thread t = new Thread(run,"线程1");
		Thread t2 = new Thread(run,"线程2");
		Thread t3 = new Thread(run,"线程3");
		
		t.start();
		t2.start();
		t3.start();

	}

}
