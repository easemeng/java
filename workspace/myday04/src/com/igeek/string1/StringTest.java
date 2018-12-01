package com.igeek.string1;

public class StringTest {

	//构造器 ，构造方法，构造函数 。
	
	//语法   访问修饰符  + 类名成(){  } 构造器是没有任何返回值的。void
	
	
	//构造器的作用  。1，创建对象   2.给对象完成初始化操作(对对象中的属性进行赋值 。)
	public StringTest(int age){
		this.age=age;
	}
	/**
	 * 当你不指定构造器的时候，系统会默认创建一个空的无参的构造器 。
	 * 
	 * public StringTest(){
		//super();
	   }
	 * 
	 * 一旦你手动的指定了构造器，系统就不再提供默认的无参的构造器 。
	 */
	
	
	
	public int age;//成员变量 ，属性，字段 。
	
	@SuppressWarnings("unused")
	public static void main(String[] args) {
		
		//StringTest st = new StringTest();
		//System.out.println(st.age);
		StringTest st2 = new StringTest(12);
	}
	
	//在同一个类中，允许出现同名方法，只要他们的参数列表不同，重载。

}
