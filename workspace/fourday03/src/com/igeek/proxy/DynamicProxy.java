package com.igeek.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class DynamicProxy implements InvocationHandler {

	// 创建一个被代理类对象
	private Object obj;
	
	public Object createOroxyInstance(Object obj){
		this.obj = obj;
		return Proxy.newProxyInstance(obj.getClass().getClassLoader(), obj.getClass().getInterfaces(), this);
	}
	
	/**
	 * proxy 正在返回的那个代理对象 ， 一般在 invoke 方法中不适用该对象 。 
	 * 
	 * method 正在被调用的方法
	 * 
	 * args 方法需要被传入的参数
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
