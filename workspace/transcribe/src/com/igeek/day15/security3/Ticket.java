package com.igeek.day15.security3;

public class Ticket implements Runnable {

	int ticket = 100;
	int x = 0;
	// Object obj = new Object();
	
	@Override
	public void run() {
		
		while(true){
			if(x % 2 == 0){
				// �߳�1	��	�߳�2
				// �߳�1 �õ�������������ִ�� �� ֱ��ִ�е�x++	x = 1
				// �߳�3
				// ��xΪż����ʱ�� ��
				synchronized (this) { // new Object();
					if(ticket > 0){
						String name = Thread.currentThread().getName();
						System.out.println(name + "�۳���" + ticket);
						ticket--;
					}
				}
			}else{ // ��  ֻ��һ��
				get();
			}
			// ѭ������������
			if(ticket <= 0){
				break;
			}
			// x���ۼ�
			x++;
		}
		
	}
	
	// ͬ���� �� 	�����������η��� synchronized ע�⣺ �ص�  ����ʹ��ͬ���Ǿ�̬������ʱ�� �� ��������this
	public synchronized void get(){
		// ���Ķ������this...
		// synchronized (this) {
			if(ticket > 0){
				String name = Thread.currentThread().getName();
				System.out.println(name + "�۳���" + ticket);
				ticket--;
			}
		// }
	}

}
