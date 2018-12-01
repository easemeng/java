package com.igeek.day03.obj;

import java.util.UUID;

public class Test {

	public static void main(String[] args) {
		// 注意：创建对象  格式    对象的数据类型   对象名称 = new 构造器();
		
		Person tom = new Person();
		//直接调用 。
		//int result = tom.getSum();
		//System.out.println(result);
		
		//如何调用一个类中方法 ，通过对象.的方式进行调用。
		Person jack = new Person();
		
		tom.name="汤姆汉克斯";
		//tom.age=25;
		
		jack.name="杰克";
		//jack.age=100;
		
		Person.country="西班牙";
		System.out.println(tom.name);
		//System.out.println(tom.age);
		System.out.println(jack.name);
		//System.out.println(jack.age);
		System.out.println(Person.country);
		
		
		
		String country = Person.country;
		System.out.println(country);
		
		int result = Person.getSum();
		System.out.println(result);
		
		UUID uuid = UUID.randomUUID();
		uuid.toString();
		
		UUID.randomUUID().toString();
		
		//面向过程  。
		int i = Math.abs(-20);
		System.out.println(i);
		
		
		//new 就是在堆中新开辟空间。
		new Person();
		new Person();
		System.out.println(new Person()==new Person());
		
		//一般什么情况下使用匿名对象。
		
		//调用下面的非静态方法。      匿名对象的用法  主要用来当做参数传递 。
		Test test = new Test();
		//将匿名对象  作为实际参数  传递给方法 。
		test.displayPerson(new Person());
		
		//要多次使用一个对象的时候，不推荐使用匿名对象。   因为会在堆空间中创建多个不同的对象。
		new Person().name="托马斯";
		new Person().age=20;
		
		
		
		
		// 注意：创建对象  格式    对象的数据类型   对象名称 = new 构造器();
		Person tom2 = new Person();
		//直接调用 。
		//int result = tom.getSum();
		//System.out.println(result);
		//如何调用一个类中方法 ，通过对象.的方式进行调用。
		Person jack2 = new Person();
		tom2.name="汤姆汉克斯";
		//tom2.age=25;
		jack2.name="杰克";
		//jack2.age=100;
		
		Person.country="西班牙";
		System.out.println(tom2.name);
		//System.out.println(tom2.age);
		System.out.println(jack2.name);
		//System.out.println(jack2.age);
		System.out.println(Person.country);
		
		
		
		String country2 = Person.country;
		System.out.println(country2);
		int result2 = Person.getSum();
		System.out.println(result2);
		UUID uuid2 = UUID.randomUUID();
		uuid2.toString();
		UUID.randomUUID().toString();
		
		//面向过程  。
		int i2 = Math.abs(-20);
		System.out.println(i2);
		
		//new 就是在堆中新开辟空间。
		new Person();
		new Person();
		System.out.println(new Person()==new Person());
		
		//调用下面的非静态方法。      匿名对象的用法  主要用来当做参数传递 。
		Test test2 = new Test();
		//将匿名对象  作为实际参数  传递给方法 。
		test.displayPerson(new Person());
		
		//要多次使用一个对象的时候，不推荐使用匿名对象。   因为会在堆空间中创建多个不同的对象。
		new Person().name="托马斯";
		new Person().age=20;
		
		
		
		
		// 注意：创建对象  格式    对象的数据类型   对象名称 = new 构造器();
		Person tom3 = new Person();
		//直接调用 。
		//int result = tom.getSum();
		//System.out.println(result);
		//如何调用一个类中方法 ，通过对象.的方式进行调用。
		Person jack3 = new Person();
		tom3.name="汤姆汉克斯";
		//tom3.age=25;
		
		jack3.name="杰克";
		//jack3.age=100;
		
		Person.country="西班牙";
		System.out.println(tom3.name);
		//System.out.println(tom3.age);
		System.out.println(jack3.name);
		//System.out.println(jack3.age);
		System.out.println(Person.country);
		
		
		
		String country3 = Person.country;
		System.out.println(country3);
		int result3 = Person.getSum();
		System.out.println(result3);
		UUID uuid3 = UUID.randomUUID();
		uuid3.toString();
		
		UUID.randomUUID().toString();
		
		//面向过程  。
		int i3 = Math.abs(-20);
		System.out.println(i3);
		
		
		//new 就是在堆中新开辟空间。
		new Person();
		new Person();
		System.out.println(new Person()==new Person());
			
		//调用下面的非静态方法。      匿名对象的用法  主要用来当做参数传递 。
		Test test3 = new Test();
		//将匿名对象  作为实际参数  传递给方法 。
		test.displayPerson(new Person());
		
		//要多次使用一个对象的时候，不推荐使用匿名对象。   因为会在堆空间中创建多个不同的对象。
		new Person().name="托马斯";
		new Person().age=20;
		
		
		
		
		// 注意：创建对象  格式    对象的数据类型   对象名称 = new 构造器();
		Person tom4 = new Person();
		//直接调用 。
		//int result = tom.getSum();
		//System.out.println(result);
		//如何调用一个类中方法 ，通过对象.的方式进行调用。
		Person jack4 = new Person();
		
		tom4.name="汤姆汉克斯";
		//tom4.age=25;
		
		jack4.name="杰克";
		//jack4.age=100;
		
		Person.country="西班牙";
		System.out.println(tom4.name);
		//System.out.println(tom4.age);
		System.out.println(jack4.name);
		//System.out.println(jack4.age);
		System.out.println(Person.country);
		
		
		
		String country4 = Person.country;
		System.out.println(country4);
		
		int result4 = Person.getSum();
		System.out.println(result4);
		UUID uuid4 = UUID.randomUUID();
		uuid4.toString();
		
		UUID.randomUUID().toString();
		
		//面向过程  。
		int i4 = Math.abs(-20);
		System.out.println(i4);
		
		
		//new 就是在堆中新开辟空间。
		new Person();
		new Person();
		System.out.println(new Person()==new Person());
		
		//调用下面的非静态方法。      匿名对象的用法  主要用来当做参数传递 。
		Test test4 = new Test();
		//将匿名对象  作为实际参数  传递给方法 。
		test.displayPerson(new Person());
		//要多次使用一个对象的时候，不推荐使用匿名对象。   因为会在堆空间中创建多个不同的对象。
		new Person().name="托马斯";
		new Person().age=20;
		
		
		
		
		// 注意：创建对象  格式    对象的数据类型   对象名称 = new 构造器();
		Person tom5 = new Person();
		//直接调用 。
		//int result = tom.getSum();
		//System.out.println(result);
		
		//如何调用一个类中方法 ，通过对象.的方式进行调用。
		Person jack5 = new Person();
		
		tom5.name="汤姆汉克斯";
		//tom5.age=25;
		
		jack5.name="杰克";
		//jack5.age=100;
		
		Person.country="西班牙";
		System.out.println(tom5.name);
		//System.out.println(tom5.age);
		System.out.println(jack5.name);
		//System.out.println(jack.age);
		System.out.println(Person.country);

		String country5 = Person.country;
		System.out.println(country5);
		
		int result5 = Person.getSum();
		System.out.println(result5);
		UUID uuid5 = UUID.randomUUID();
		uuid5.toString();
		
		UUID.randomUUID().toString();
		
		//面向过程  。
		int i5 = Math.abs(-20);
		System.out.println(i5);
		
		
		//new 就是在堆中新开辟空间。
		new Person();
		new Person();
		System.out.println(new Person()==new Person());
		
		//调用下面的非静态方法。      匿名对象的用法  主要用来当做参数传递 。
		Test test5 = new Test();
		//将匿名对象  作为实际参数  传递给方法 。
		test.displayPerson(new Person());
		
		//要多次使用一个对象的时候，不推荐使用匿名对象。   因为会在堆空间中创建多个不同的对象。
		new Person().name="托马斯";
		new Person().age=20;
	}

	public void displayPerson(Person person){
		person.display();
	}
	
	public void a(){
		
	}
	
}
