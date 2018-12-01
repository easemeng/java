package com.igeek.proxy;

public class LongErImpl implements MeiNvRuYun {

	@Override
	public void meet() {
		
		// 代码重复 ， 耦合度高
		// Request.check();   // 依旧出现重复代码 。    代理类
		// System.out.println("在人群中看了你一眼...");
		System.out.println("结识龙儿......");
		// System.out.println("娶回家...");
		// Request.logging();
		// Request.sing();

	}

}
