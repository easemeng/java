package com.igeek.proxy;

// 代理类  。   代理  其他的几个接口实现类
public class JianNingImpl implements MeiNvRuYun {
	
	private MeiNvRuYun meiNvRuYun;
	
	public JianNingImpl(MeiNvRuYun meiNvRuYun){
		this.meiNvRuYun = meiNvRuYun;
	}

	@Override
	public void meet() {
		
		Request.check();
		// 其实是在调用		被代理类的方法  。。。
		meiNvRuYun.meet();
		Request.logging();
		Request.sing();

	}

}
