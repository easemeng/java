package com.igeek.day15.security;

public class ThreadSecurity {

	public static void main(String[] args) {
		
		Runnable run = new Ticket();
		Thread window1 = new Thread(run,"����1");
		Thread window2 = new Thread(run,"����2");
		Thread window3 = new Thread(run,"����3");
		
		window1.start();
		window2.start();
		window3.start();

	}

}
