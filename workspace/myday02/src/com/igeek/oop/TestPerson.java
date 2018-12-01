package com.igeek.oop;

public class TestPerson {

	public static void main(String[] args) {
		
		//创建一个对象 。语法格式  。   对象的类型   对象名称 = new 构造器();
		
		Person tom = new Person();
		Person jack = new Person();
		tom.name="汤姆";
		tom.age=19;
		System.out.println(tom.name);//可以通过对象. 来或者当前类中成员。
		System.out.println(tom.age);
		tom.eat();
		tom.play();
		jack.name="杰克";
		jack.age=20;
		System.out.println(jack.name);
		System.out.println(jack.age);
		jack.eat();
		jack.play();
		
		//tom 跟 jack 不是同一个对象 。都是根据Person类来产生的。
		
	}

}
