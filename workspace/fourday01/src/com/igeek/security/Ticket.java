package com.igeek.security;

/**
 * 
 * ������̲߳����������Ե�ʱ�� �� ��ʱ�п��ܲ����̰߳�ȫ���� �� 
 * 
 * ������� ��  ͬ������� ��  �﷨��ʽ ��  synchronized�������һ�����󣬶����Գ䵱����{�����ſ��ܻ�����̰߳�ȫ����Ĵ��� �� }
 * 
 * ͬ�������   �ֽж����� �� 
 * 
 * ע�⣺ ʹ��ͬ��������ʱ�� �� �������������   �и�Ҫ�� �� Ҫ�����߳�ʹ�õ������� �� ������ͬһ������ �� 
 *
 */

public class Ticket implements Runnable {

	int ticket = 100;
	//Object obj = new Object();
	
	@Override
	public void run() {
		while(true){
			synchronized(this){
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

}
