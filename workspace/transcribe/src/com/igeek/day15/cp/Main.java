package com.igeek.day15.cp;

public class Main {

	public static void main(String[] args) {
		
		// ��ͬ��ȥ���� Ticket ����
		Ticket t = new Ticket();
		// ������ �� ����Ʊ
		Producer p = new Producer(t);
		// ������ �� ����Ʊ �� ʹ��Ʊ
		Consumer c = new Consumer(t);
		// ����̲߳�����������
		
		// �����߳� ��Ч�� �� 
		Thread t1 = new Thread(p,"������1");
		Thread t7 = new Thread(p,"������2");
		Thread t8 = new Thread(p,"������3");
		Thread t9 = new Thread(p,"������4");

		
		Thread t2 = new Thread(c,"������1");
		Thread t3 = new Thread(c,"������2");
		Thread t4 = new Thread(c,"������3");
		Thread t5 = new Thread(c,"������5");
		Thread t6 = new Thread(c,"������6");

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
