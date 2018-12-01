package com.igeek.generic4;

import java.util.ArrayList;

public abstract class Person<T> {
	
	// ArrayList<? super T>  你传入的对象类型	  一定要是ArrayList类型的
	// 并且对象的泛型	只能是 T 或者 T 的父类 。 
	// T 代表你创建 Person 对象时 ， 指定的类型
	// Person<String> p = new Student<String>();

	public abstract void dream(ArrayList<? super T> list);

}
