package com.igeek.day07.abstract1;

// 只有覆盖了抽象类中所有的抽象方法后，其子类才可以创建对象。否则该子类还是一个抽象类。
public class Wolf extends Quan {

	@Override
	public void speak() {
		
		System.out.println("嗷呜...");

	}

	@Override
	public void eat() {
		
		System.out.println("肉");

	}

	@Override
	public void dream() {
		System.out.println("成为灰太狼");

	}

}
