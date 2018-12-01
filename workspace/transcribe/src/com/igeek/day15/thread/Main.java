package com.igeek.day15.thread;

public class Main {

	public static void main(String[] args) {
		
		// 第一种
		/*Thread t = new Ticket();
		Thread t2 = new Ticket();
		Thread t3 = new Ticket();
		t.start();
		t2.start();
		t3.start();*/
		
		// 第二种
		/*Runnable run = new Ticket();
		Thread t = new Thread(run,"线程1");
		Thread t2 = new Thread(run,"线程2");
		Thread t3 = new Thread(run,"线程3");
		t.start();
		t2.start();
		t3.start();*/
		
		// 匿名内部类
		Runnable run = new Runnable(){
			int ticket = 100;
			@Override
			public void run() {
				while(true){
					if(ticket > 0){
						System.out.println(Thread.currentThread().getName() + "售出了" + ticket--);
						// 一个完整的执行单元 ， 被拆分成多个步骤之后 。 线程安全问题被放大了
						//String name = Thread.currentThread().getName();
						//System.out.println(name + "售出了" + ticket);
						//ticket--;
					}
				}
			}
			
		};
		Thread t = new Thread(run,"线程1");
		Thread t2 = new Thread(run,"线程2");
		Thread t3 = new Thread(run,"线程3");
		t.start();
		t2.start();
		t3.start();

	}

}
