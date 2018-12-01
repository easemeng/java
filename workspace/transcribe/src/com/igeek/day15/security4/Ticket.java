package com.igeek.day15.security4;

public class Ticket implements Runnable {

	static int ticket = 100; // �����
	int x = 0; // ʵ������
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
	
	// this �Ǿ�̬����ʹ�õ��� �� 
	// ��̬���� ʹ�õ���	���� this �� ���ǵ�ǰ����ֽ��� ��  ����.class
	// Ticket.class ���� ��̬����ʹ�õ���
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
