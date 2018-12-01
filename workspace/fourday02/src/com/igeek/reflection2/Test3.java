package com.igeek.reflection2;

import java.lang.reflect.Field;

public class Test3 {

	@SuppressWarnings("rawtypes")
	public static void main(String[] args) {
		
		// ͨ��java���������õ�ǰ���е�����  ��  ���� �� 
		try {
			Class classType = Class.forName("com.igeek.reflection2.Person");
			// ͨ���������   ����õ�ǰ���е�  ����  �� ֻ�ܻ�ù��е� �� 
			Field fields = classType.getField("name");
			// �����Խ��и�ֵ �� ��Ҫ������������ ��  obj ��ʾ���Ǹ������name���Խ��и�ֵ �� value ������Ҫ�����ֵ
			Person my = new Person();
			fields.set(my, "��");  // ����.����		����.����
			String name = (String) fields.get(my);
			System.out.println(name);
			
			// ��򵥵ķ�ʽ
			// Person p = new Person("�ܿ�" , 20);
			
			// ͨ��java����  ���˽������ ��   getDeclaredField ��ʾ��õ�ǰ�������������� �� ���ӷ���Ȩ�����η� �� 
			Field dream = classType.getDeclaredField("dream");
			// ���õ�ǰ���Եķ���Ȩ��Ϊ true ...
			dream.setAccessible(true);
			dream.set(my, "��������");
			String d = (String) dream.get(my);
			System.out.println(d);
			// ͨ��java������������ǰ���е�˽������
			
			// һ�㲻�Ƽ�ʹ��java��������������˽������ �� �����Ƽ�ʹ��     set/get ������˽������ �� 
			
			// System.out.println(fields);
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
