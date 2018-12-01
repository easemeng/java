package com.igeek.oop;

//oop 面向对象编程。	 强调的是能够解决问题的对象。
//pop 面向过程编程。  解决问题的具体步骤。
public class Person {
	
	//编程为了解决现实问题。
	
	//类 。 对现实生活中客观存在的事物的一种描述，抽象上概念上的定义。

	// 类  其实就是在描述 同一类事物  所具有的共同行为，特征。
	
	// 共同特征 ，类的属性(成员变量)来表示 。
	// 共同行为，我们用方法来表示。
	
	//万物皆对象。
	
	// 对象  存在于类中的实实在在的个体。
	//特征 。
	
	//成员变量。
	public String name;//只声明不赋值 。 null
	
	public int age;// 0
	
	//....
	/**
	 * 对于类的属性而言 。
	 * 	如果只声明不赋值，属性有默认值。
	 * 		基本数据类型
	 * 			整型: byte short int long    0
	 * 			浮点型: float double  0.0
	 * 			字符型:	\u0000  表示一个空格
	 * 			布尔型: 			false
	 * 		引用数据类型(对象类型。)
	 * 			String            null
	 * 			[] 
	 * 			Class  
	 * 			Person tom 
	 * 	
	 */
	
	//成员方法。
	
	//人类的共同行为。
	public void eat(){
		System.out.println("人会吃");
	}
	
	public void play(){
		System.out.println("人会玩。。。");
	}
	

}
