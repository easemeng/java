package com.igeek.reflection2;

import java.lang.reflect.Field;

public class Test3 {

	@SuppressWarnings("rawtypes")
	public static void main(String[] args) {
		
		// 通过java反射来调用当前类中的属性  跟  方法 。 
		try {
			Class classType = Class.forName("com.igeek.reflection2.Person");
			// 通过反射对象   来获得当前类中的  属性  。 只能获得共有的 。 
			Field fields = classType.getField("name");
			// 给属性进行赋值 。 需要传入两个参数 。  obj 表示给那个对象的name属性进行赋值 。 value 就是你要赋予的值
			Person my = new Person();
			fields.set(my, "梦");  // 对象.方法		方法.对象
			String name = (String) fields.get(my);
			System.out.println(name);
			
			// 最简单的方式
			// Person p = new Person("杰克" , 20);
			
			// 通过java反射  获得私有属性 。   getDeclaredField 表示获得当前类中声明的属性 。 忽视访问权限修饰符 。 
			Field dream = classType.getDeclaredField("dream");
			// 设置当前属性的访问权限为 true ...
			dream.setAccessible(true);
			dream.set(my, "世世相随");
			String d = (String) dream.get(my);
			System.out.println(d);
			// 通过java反射来操作当前类中的私有属性
			
			// 一般不推荐使用java反射来操作类中私有属性 。 而是推荐使用     set/get 来操作私有属性 。 
			
			// System.out.println(fields);
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
