package com.igeek.thread2;

public class Main {

	public static void main(String[] args) {
		
		// �߳��������ڵ�״̬ ��
		//  1. �½�״̬	�̶߳��󴴽����� �� 
		//  2. ������״̬	start()
		//  3. ����/�ȴ�	״̬
		//  4. ����״̬
		//  5. ����״̬
		
		// ����ǰ�߳�����   ���ȼ�
		Thread t1 = new Thread(new Ticket("t1"));
		
		t1.setPriority(1);
		// �����߳�
		
		Thread t2 = new Thread(new Ticket("t2"));
		t2.setPriority(10);
		
		Thread t3 = new Thread(new Ticket("t3"));
		t3.setPriority(10);
		
		// setPriority �������� �̵߳����ȼ� ��  1-10 �̵߳����ȼ�Խ�� �� ����ִ��Ȩ�ĸ���Խ�� �� Ĭ�ϵ�ִ��Ȩ����5��
		
		t1.start();
		t2.start();
		t3.start();
		
		// t2.yield();  // ˭���ã�˭�ͻ������ǰ��CPUִ��Ȩ �� �������̲߳������ �� ����һ���������� �� ��ʱ˭������˭ִ��
		
		/*for(int i = 0; i < 50; i++){
			// �߳����ȼ�	Ĭ����5
			Thread thread = Thread.currentThread();
			thread.setName("���߳�");
			thread.setPriority(1);
			if(i == 5){
				try {
					// ������join������ʱ�� �� ��ǰ�̻߳���� ִ��Ȩ �� ����t1��ִ�� �� 
					// ֱ��t1ִ����� �� �Ż�ִ�����߳��еĴ��� �� 
					t1.join();
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			System.out.println(thread.getName() + i);
		}
		*/
		// join() ������join����֮�� �� ��ʱ˭���� ˭�ͻ�ִ����� �� ֱ��ִ�����֮�� �� �Ż�ִ�н��������߳� �� 

	}

}
