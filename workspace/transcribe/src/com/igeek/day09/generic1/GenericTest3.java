package com.igeek.day09.generic1;

// 泛型还可以当做类的属性 

public class GenericTest3<E> {

	// 泛型被当做类的成员 。
	private E myField; 
	// 当一个属性不确定是什么类型的时候 。

	public E getmyField() {
		return myField;
	}

	public void setmyField(E myField) {
		this.myField = myField;
	}

}
