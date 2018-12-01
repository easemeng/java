package com.igeek.cp;

// ������
public class Producer implements Runnable {

	// Ticket ��Ϊһ��������� �� ���������������߸������߲���ͬһ������
	private Ticket ticket;
	
	public Producer() {
		
	}
	public Producer(Ticket ticket){
		this.ticket = ticket;
	}
	
	int x = 1;
	@Override
	public void run() {
		
		// ������Ticket���� �� 	// number ++
		while(true){
			// ticket ������	�ڸղ��߳�1���߳�2ִ�еĹ����У��޷��õ���
			synchronized (ticket) {
				// ������ �� ����������� �� �Ͳ����������� �� �ȴ���
				while (ticket.flag) {
					try {
						// ������ǰ�̵߳�ִ��Ȩ �� ���ͷ��� �� ���뵽�ȴ������� ��
						ticket.wait();
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
				try {
					// �̵߳�����
					Thread.sleep(200);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				ticket.setNumber(x);
				String name = Thread.currentThread().getName();
				System.out.println(name + "������" + x + "��Ʊ");
				x++;

				ticket.flag = true; // ����������� ��
				// ����еȴ��������� �� Ҫ���������� �� ���û�еȴ��������� �� �������Ҳ����ִ�С�
				ticket.notifyAll(); // һ�λ���һ��
			}

		}
	}
}
