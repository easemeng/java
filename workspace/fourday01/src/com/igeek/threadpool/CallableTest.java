package com.igeek.threadpool;

import java.util.concurrent.Callable;

public class CallableTest implements Callable<String>{

	@Override
	public String call() throws Exception {
		// TODO Auto-generated method stub
		// ʵ���̵߳�ҵ�� ������
		return "����call�����ķ���ֵ";
	}

}
