package com.igeek.proxy;

// ������  ��   ����  �����ļ����ӿ�ʵ����
public class JianNingImpl implements MeiNvRuYun {
	
	private MeiNvRuYun meiNvRuYun;
	
	public JianNingImpl(MeiNvRuYun meiNvRuYun){
		this.meiNvRuYun = meiNvRuYun;
	}

	@Override
	public void meet() {
		
		Request.check();
		// ��ʵ���ڵ���		��������ķ���  ������
		meiNvRuYun.meet();
		Request.logging();
		Request.sing();

	}

}
