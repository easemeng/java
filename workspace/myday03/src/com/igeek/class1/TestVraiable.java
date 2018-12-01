package com.igeek.class1;

public class TestVraiable {
	
	//成员变量 。(类的属性。   描述事物所具有的共同特征。)
	
	//实例变量 。  每个对象各自拥有一套不同的副本，彼此之间的属性不受影响。
	private int age = 10;
	//类变量 。   被所有的对象共享值 。
	public static String country = "中国";
	
	//一旦属性 被私有话了。外界无法直接访问属性 。   对象. 
	//set , get 方法    。 set用来给age属性进行赋值操作 。get用来获取age属性的值。
	
	public void setAge(int age){//age 
		//当方法的参数名称 ，跟当前类中的属性名称同名的时候，
		//这个时候我们需要使用this关键字 来进行区分 。
		//this 关键字的意思   代表当前对象本身 。
		
		//if  age >0   <130;  Syso(年龄输入错误。)
		this.age = age;
	}
	
	public int getAge(){
		return this.age;
	}
	
	public void show(){
		System.out.println(age);
	}

}
