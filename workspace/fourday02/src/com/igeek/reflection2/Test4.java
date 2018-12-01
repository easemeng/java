package com.igeek.reflection2;

import java.lang.reflect.Method;

public class Test4 {

	public static void main(String[] args) {
		
		// ͨ��java����������һ�����е�˽�з���
		
		try {
			Class classType = Class.forName("com.igeek.reflection2.Person");
			
			// ���˽�з��� �� method ����   ��ʾ�õ�����һ������ķ��� �� 
			Method method = classType.getDeclaredMethod("dream", null);
			method.setAccessible(true);
			// IllegalAccessException �Ƿ�����         ����д method.setAccessible(true)
			// method.invoke(obj, args) ��ʾ���÷��� ��   ��һ������   ��ʾ��Ҫ����Ķ��� ��   �����������ĸ�������ִ��
			// �ڶ��������ǿɱ���� �� ���ǵ��÷���ʱ �� ��Ҫ����ľ������ �� 
			Person my = new Person();
			method.invoke(my, null);  // ����.����		����.ִ��(����,����);
			
			Method dream = classType.getDeclaredMethod("dream", String.class,int.class,char.class);
			dream.setAccessible(true);
			Person p = new Person();
			String result = (String) dream.invoke(p, "��",99,'9');
			System.out.println(result);
			
			Method dream2 = classType.getDeclaredMethod("dream", String.class);
			dream2.setAccessible(true);
			String result2 = (String) dream2.invoke(p, "����");
			System.out.println(result2);
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
