package com.igeek.day15.cp;

public class Main {

	public static void main(String[] args) {
		
		// 共同的去操作 Ticket 对象
		Ticket t = new Ticket();
		// 生产者 ， 生产票
		Producer p = new Producer(t);
		// 消费者 ， 消费票 。 使用票
		Consumer c = new Consumer(t);
		// 多个线程操作共享数据
		
		// 启动线程 看效果 。 
		Thread t1 = new Thread(p,"生产者1");
		Thread t7 = new Thread(p,"生产者2");
		Thread t8 = new Thread(p,"生产者3");
		Thread t9 = new Thread(p,"生产者4");

		
		Thread t2 = new Thread(c,"消费者1");
		Thread t3 = new Thread(c,"消费者2");
		Thread t4 = new Thread(c,"消费者3");
		Thread t5 = new Thread(c,"消费者5");
		Thread t6 = new Thread(c,"消费者6");

		t1.start();
		t2.start();
		t3.start();
		t4.start();
		t5.start();
		t6.start();
		t7.start();
		t8.start();
		t9.start();

	}

}
