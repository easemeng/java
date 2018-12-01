package com.igeek.bean;

import java.util.Map;

import org.apache.commons.beanutils.BeanUtils;

public class MyBeanUtils {
	
	// ��װ��һ������    ��һ������дObject	��ʾ�ڵ��÷�����ʱ���һ���������Դ�����������
	public static Object populate(Object bean, Map<String, String[]> properties){
		
		// �Զ���ķ���
		try {
			BeanUtils.populate(bean, properties);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
		return bean;
		
	}
	
	// �ڶ��ַ�װ�ķ���
	/*public static Object populate(Class classTypy, Map<String, String[]> properties){
		Object bean = null;
		try {
			bean = classTypy.newInstance();
			BeanUtils.populate(bean, properties);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return bean;
	}*/
	
	// �����ַ�װ��ʽ		User.class  Student.class
	public static <T>T populate(Class<T> classType, Map<String, String[]> properties){
		// ���巺������
		T bean = null;
		try {
			BeanUtils.populate(bean, properties);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return bean;
	}

}
