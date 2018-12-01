package com.igeek.reflection2;

import java.lang.reflect.Method;

public class Test4 {

	public static void main(String[] args) {
		
		// 通过java反射来调用一个类中的私有方法
		
		try {
			Class classType = Class.forName("com.igeek.reflection2.Person");
			
			// 获得私有方法 。 method 对象   表示拿到的是一个具体的方法 。 
			Method method = classType.getDeclaredMethod("dream", null);
			method.setAccessible(true);
			// IllegalAccessException 非法访问         必须写 method.setAccessible(true)
			// method.invoke(obj, args) 表示调用方法 。   第一个参数   表示需要传入的对象 。   方法到底由哪个对象来执行
			// 第二个参数是可变参数 ， 就是调用方法时 ， 需要传入的具体参数 。 
			Person my = new Person();
			method.invoke(my, null);  // 对象.方法		方法.执行(对象,参数);
			
			Method dream = classType.getDeclaredMethod("dream", String.class,int.class,char.class);
			dream.setAccessible(true);
			Person p = new Person();
			String result = (String) dream.invoke(p, "梦",99,'9');
			System.out.println(result);
			
			Method dream2 = classType.getDeclaredMethod("dream", String.class);
			dream2.setAccessible(true);
			String result2 = (String) dream2.invoke(p, "不悔");
			System.out.println(result2);
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
