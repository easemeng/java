package com.igeek.proxy;

import java.util.List;

public class WeiXiaoBao {
	
	// ΤС��
	// ��Ů�ӿ�
	// ˫��
	// ����
	// ����
	// ����

	// ���þ������Ů����   ��Ҫ�ҵ� ����  ... ������
	public static void main(String[] args) {
		
		// ���ģʽ   ����ģʽ  ��  Proxy...
		// ��̬����   ��̬����Java���䣩
		// ���ģʽ �� ʵ�ڴ�����ʵ�� �� ����������ѡ�Ĵ���ṹ �� ��̷�� �� �Լ���������˼����ʽ
		// 		       ������ɽ��� �� ��С�޶ȵ��޸Ĵ���ʵ�ָ��ӹ���
		
		// MeiNvRuYun longe = new LongErImpl();
		// longe.meet();
		
		// ����������� ��  ��Ҫ�ҵ��Ǹ�����Ķ��� �� ֻ��Ҫ���ߴ�����Ϳ����� �� 
		
		MeiNvRuYun ke = new AKeImpl();
		MeiNvRuYun longe = new LongErImpl();
		MeiNvRuYun shuang = new ShuangErImpl();
		
		/*MeiNvRuYun jianNing = new JianNingImpl(longe);
		jianNing.meet();*/  // ��̬����ģʽ
		
		// ��̬����ģʽ
		DynamicProxy dp = new DynamicProxy();
		Object prObject = dp.createOroxyInstance(longe);
		MeiNvRuYun my = (MeiNvRuYun) prObject;
		// List list = my.getAll();
		// System.out.println(list);
		// my.delete("1");
		my.meet();
		/**
		 *  ����ҵ��
		 * ����ҵ��	����ҵ��
		 *  ����ҵ��
		 *  ����ҵ��
		 */

	}

}
