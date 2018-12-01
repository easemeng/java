package com.igeek.cp;

// 生产者
public class Producer implements Runnable {

	// Ticket 作为一个类的属性 。 这样才能让生产者跟消费者操作同一个对象
	private Ticket ticket;
	
	public Producer() {
		
	}
	public Producer(Ticket ticket){
		this.ticket = ticket;
	}
	
	int x = 1;
	@Override
	public void run() {
		
		// 生产，Ticket对象 。 	// number ++
		while(true){
			// ticket 生产者	在刚才线程1，线程2执行的过程中，无法拿到锁
			synchronized (ticket) {
				// 生产者 ， 如果有数据了 ， 就不继续生产了 。 等待。
				while (ticket.flag) {
					try {
						// 放弃当前线程的执行权 ， 并释放锁 。 进入到等待队列中 。
						ticket.wait();
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
				try {
					// 线程的休眠
					Thread.sleep(200);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				ticket.setNumber(x);
				String name = Thread.currentThread().getName();
				System.out.println(name + "生产了" + x + "号票");
				x++;

				ticket.flag = true; // 数据生产完毕 。
				// 如果有等待的消费者 ， 要唤醒消费者 。 如果没有等待的消费者 ， 这个代码也不会执行。
				ticket.notifyAll(); // 一次唤醒一个
			}

		}
	}
}
