package com.igeek.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class DynamicProxy implements InvocationHandler {

	// ����һ�������������
	private Object obj;
	
	public Object createOroxyInstance(Object obj){
		this.obj = obj;
		return Proxy.newProxyInstance(obj.getClass().getClassLoader(), obj.getClass().getInterfaces(), this);
	}
	
	/**
	 * proxy ���ڷ��ص��Ǹ�������� �� һ���� invoke �����в����øö��� �� 
	 * 
	 * method ���ڱ����õķ���
	 * 
	 * args ������Ҫ������Ĳ���
	 */
	
	@Override
	public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
		
		// System.out.println("check");
		// System.out.println("beforLog...");
		Request.check();
		Object result = null;
		
		try {
			result = method.invoke(obj, args);
		} catch (Exception e) {
			e.printStackTrace();
			throw e;
		}
		
		// System.out.println("afterLog...");
		Request.logging();
		Request.sing();
		return result;
	}

}
