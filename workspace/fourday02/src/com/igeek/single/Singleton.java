package com.igeek.single;

// 设计模式   单例设计模式
// 单实例 ， 多实例 。 
// 默认情况下 一个类可以创建无数个对象 。 （多实例模式）

// 一个类只能有一个对象产生
public class Singleton {

	// 饿汉式   单例模式 。 不存在线程安全问题
	/*2*/private static Singleton singlet = new Singleton();  // 类变量 ， 实例变量
	
	/*1*/private Singleton(){
		
	}
	
	// 写一个方法 ， 这个方法的作用就是用来返回对象 。 返回当前类的对象 。 
	/*3*/public static Singleton getInstance(){
		
		return singlet;
	}
}

/**
 * 想要完成单例模式
 *  1.需要私有化构造器
 *  2.创建需要返回的对象（成员变量）。 可以直接new ， 饿汉式 。 
 *  3.写一个静态方法 ， 返回这个成员变量 。 
 */
