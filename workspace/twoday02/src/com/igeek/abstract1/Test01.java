package com.igeek.abstract1;

public class Test01 {

	public static void main(String[] args) {
		
		//Quan lang = new Quan();
		
		// 向上转型  。 声明父类对象 ，  由子类完成实例化操作 。 
		// 对于这种写法而言 。 dog1对象  只能调用当前类 。 所有的方法 。 	
		Quan dog1 = new Dog();
		// 只能调用父类（当前类）中的方法  不能调用自身特有的方法
		
		dog1.speak();
		dog1.eat();
		dog1.dream();

		// 单独创建的对象可以调用所有的方法，包括自身和父类
		// 单独创建dog2对象
		//Dog dog2 = new Dog();
		
		// 多态 ： 事物存在的多种形态
		// 允许不同的对象 ， 对同一消息做出相应操作。
		// 在Java的代码中 。 首先要有继承关系 ， 然后发生重写 ， 然后还要完成向上转型 。
		
		// 例如早上吃什么 ...  回答不一

	}

}
