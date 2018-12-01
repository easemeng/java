package com.igeek.thread;

public class DeadLockThread extends Thread {
	
	boolean flag;  // 定义标记，用来指定要执行的代码
	
	public DeadLockThread(boolean flag){
		this.flag = flag;
	}
	
	@Override
	public void run() {
		// 线程1		线程2
		if(flag){
			// flag值为true时执行的代码
			// 线程1
			synchronized(DeadLockThreadDemo.LOCK1){
				System.out.println("if中锁1");
				// 线程1 处于等待状态 。
				synchronized(DeadLockThreadDemo.LOCK2){
					System.out.println("if中锁2");
				}
			}
			// 产生死锁的代码情况分析   线程1 拿到LOCK1 线程2拿到LOCK2
		}else{
			// 线程2
			// flag值为false时执行的代码
			synchronized(DeadLockThreadDemo.LOCK2){
				System.out.println("else中锁2");
				// 线程2 也进入等待状态
				synchronized(DeadLockThreadDemo.LOCK1){
					System.out.println("else中锁1");
				}
			}
		}
	}

}
