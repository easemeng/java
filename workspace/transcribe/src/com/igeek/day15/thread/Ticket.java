package com.igeek.day15.thread;
/**
 * 
 * ������̲߳����������Ե�ʱ�� ����ʱ�п��ܲ����̰߳�ȫ���� �� 
 *
 */
public class Ticket extends Thread implements Runnable {
	
	int ticket = 100;
	public void run() {
		while(true){
			if(ticket > 0){
				// System.out.println(Thread.currentThread().getName() + "�۳���" + ticket--);
				// һ��������ִ�е�Ԫ �� ����ֳɶ������֮�� �� �̰߳�ȫ���ⱻ�Ŵ���
				String name = Thread.currentThread().getName();
				System.out.println(name + "�۳���" + ticket);
				ticket--;
			}
		}
	}
	
}
