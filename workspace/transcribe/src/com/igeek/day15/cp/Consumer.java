package com.igeek.day15.cp;

// ������ �� 
public class Consumer implements Runnable {
	
	private Ticket ticket;

	public Consumer() {
		
	}

	public Consumer(Ticket ticket) {
		this.ticket = ticket;
	}

	// ������ ҲҪ������������ �� Ticket ������ǹ������� �� 
	
	@Override
	public void run() {
		// ������	�������� �� ÿ��ȡ��һ��Ʊ
		while(true){
			// �̵߳�һ�ν��������� �� ������1 �õ��� �� ������2��
			synchronized (ticket) {
				// û������  �͵ȴ� ��  !ticket.flag �ͱ�ʾû������
				while(!ticket.flag){
					try {
						ticket.wait(); // �߳�1�ͽ��뵽�ȴ������У������ͷ���
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
				try {
					Thread.sleep(200);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				String name = Thread.currentThread().getName();
				System.out.println(name + "������" + ticket.getNumber());
				
				ticket.flag = false;  // ������������  ���ˡ���Ҫ����������
				// ����������
				ticket.notifyAll();
			}
		}
		
	}
	
	

}
