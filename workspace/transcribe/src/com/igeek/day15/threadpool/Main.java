package com.igeek.day15.threadpool;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

import com.igeek.day15.thread.Ticket;

public class Main {

	@SuppressWarnings("unused")
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		
		// �̳߳�
		ExecutorService threadPool = Executors.newFixedThreadPool(3);
		Runnable task = new Ticket();
		// ���̳߳��ύִ������ �� 
	/*	threadPool.submit(task);
		threadPool.submit(task);
		threadPool.submit(task);
		
		threadPool.submit(task);
		threadPool.submit(task);
		threadPool.submit(task);*/
		
		Callable<String> call = new CallableTest();
		// ���̳߳��ύ���� �� 	�ڶ��ַ�ʽ �� ���� Callable �ӿڵĶ��� �� Future<String> ����  �� future ��������õ��̷߳����ķ���ֵ
		Future<String> future = threadPool.submit(call);
		String result = future.get();
		System.out.println(result);
		
		// �̳߳ص�ʹ�� �� 
		threadPool.shutdown();

	}

}