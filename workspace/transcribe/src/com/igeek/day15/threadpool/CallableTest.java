package com.igeek.day15.threadpool;

import java.util.concurrent.Callable;

public class CallableTest implements Callable<String>{

	@Override
	public String call() throws Exception {
		// TODO Auto-generated method stub
		// 实现线程的业务 。。。
		return "我是call方法的返回值";
	}

}
