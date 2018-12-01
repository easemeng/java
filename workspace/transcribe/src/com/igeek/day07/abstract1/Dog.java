package com.igeek.day07.abstract1;
// 一旦子类继承抽象类 ， 子类必须重写（复写 、 覆盖） Override  父类中所有的抽象方法
public class Dog extends Quan {

	@Override
	public void speak() {
		
		System.out.println("汪汪汪...");

	}

	@Override
	public void eat() {
		
		System.out.println("狗粮");

	}

	@Override
	public void dream() {
		
		System.out.println("脱单....");

	}
	
	public void mimi(){
		System.out.println("隔壁藏了一根骨头");
	}

}
