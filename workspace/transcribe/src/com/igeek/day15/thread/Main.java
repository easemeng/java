package com.igeek.day15.thread;

public class Main {

	public static void main(String[] args) {
		
		// ��һ��
		/*Thread t = new Ticket();
		Thread t2 = new Ticket();
		Thread t3 = new Ticket();
		t.start();
		t2.start();
		t3.start();*/
		
		// �ڶ���
		/*Runnable run = new Ticket();
		Thread t = new Thread(run,"�߳�1");
		Thread t2 = new Thread(run,"�߳�2");
		Thread t3 = new Thread(run,"�߳�3");
		t.start();
		t2.start();
		t3.start();*/
		
		// �����ڲ���
		Runnable run = new Runnable(){
			int ticket = 100;
			@Override
			public void run() {
				while(true){
					if(ticket > 0){
						System.out.println(Thread.currentThread().getName() + "�۳���" + ticket--);
						// һ��������ִ�е�Ԫ �� ����ֳɶ������֮�� �� �̰߳�ȫ���ⱻ�Ŵ���
						//String name = Thread.currentThread().getName();
						//System.out.println(name + "�۳���" + ticket);
						//ticket--;
					}
				}
			}
			
		};
		Thread t = new Thread(run,"�߳�1");
		Thread t2 = new Thread(run,"�߳�2");
		Thread t3 = new Thread(run,"�߳�3");
		t.start();
		t2.start();
		t3.start();

	}

}
