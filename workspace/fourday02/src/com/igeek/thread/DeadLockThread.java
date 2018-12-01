package com.igeek.thread;

public class DeadLockThread extends Thread {
	
	boolean flag;  // �����ǣ�����ָ��Ҫִ�еĴ���
	
	public DeadLockThread(boolean flag){
		this.flag = flag;
	}
	
	@Override
	public void run() {
		// �߳�1		�߳�2
		if(flag){
			// flagֵΪtrueʱִ�еĴ���
			// �߳�1
			synchronized(DeadLockThreadDemo.LOCK1){
				System.out.println("if����1");
				// �߳�1 ���ڵȴ�״̬ ��
				synchronized(DeadLockThreadDemo.LOCK2){
					System.out.println("if����2");
				}
			}
			// ���������Ĵ����������   �߳�1 �õ�LOCK1 �߳�2�õ�LOCK2
		}else{
			// �߳�2
			// flagֵΪfalseʱִ�еĴ���
			synchronized(DeadLockThreadDemo.LOCK2){
				System.out.println("else����2");
				// �߳�2 Ҳ����ȴ�״̬
				synchronized(DeadLockThreadDemo.LOCK1){
					System.out.println("else����1");
				}
			}
		}
	}

}
