package com.igeek.test3;

public class Main {

	public static void main(String[] args) {
		
		SonBase son = new SonBase();  // son.count 20
		son.disPlay();
		// Base son2 = new Base();  // son2.count 1
		// StringBuffer		Object		Intejer
		// Base son3 = new Base();  // son3.count 1
		// System.out.println(son2.count);
		
		/**
		 * 当存在继承关系的时候 ， 如果父类中的A方法 调用自身的B方法的时候 ， 
		 * 此时B方法也被子类重写 。 当创建子类对象的时候 ， 调用A方法 ，
		 * 实际执行的是子类重写之后的
		 */

	}

}
