package com.igeek.day15.thread;
/**
 * 
 * 当多个线程操作共享属性的时候 ，此时有可能产生线程安全问题 。 
 *
 */
public class Ticket extends Thread implements Runnable {
	
	int ticket = 100;
	public void run() {
		while(true){
			if(ticket > 0){
				// System.out.println(Thread.currentThread().getName() + "售出了" + ticket--);
				// 一个完整的执行单元 ， 被拆分成多个步骤之后 。 线程安全问题被放大了
				String name = Thread.currentThread().getName();
				System.out.println(name + "售出了" + ticket);
				ticket--;
			}
		}
	}
	
}
