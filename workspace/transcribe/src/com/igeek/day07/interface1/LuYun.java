package com.igeek.day07.interface1;

// implements 实现的意思  	表示左边的类 ， 实现右边的接口 。 
// 一旦一个类去实现接口了 ， 这个类就被称为接口的实现类 。 
// 实现类的要求 ， 必须实现当前接口中所有的抽象方法  	注意：不管在实现类中有没有用到
public class LuYun implements Count {

	@Override
	public void speak() {
		// TODO Auto-generated method stub

	}

	@Override
	public void count() {
		
		System.out.println("陆运，运费500+");

	}

	@Override
	public void count2() {
		// TODO Auto-generated method stub

	}

}
