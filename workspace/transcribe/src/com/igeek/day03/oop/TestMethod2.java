package com.igeek.day03.oop;

/**
 * 值传递，引用传递 。
 * 注意：在java中参数传递的方式  只有一种，我们叫做值传递 。即传递对象的副本。
 */
public class TestMethod2 {
	//当形式参数是基本数据类型的时候，形式参数的改变不影响实际参数。
	
	public static void setAge(int age){
		age = 20;
	}
	//这个位置需要我们传入一个对象 。Student
	public static void setStudentId(Student stu){
		stu.id=20;
	}
	
	
	
	
	/**
	 * 值传递，引用传递 。
	 * 注意：在java中参数传递的方式  只有一种，我们叫做值传递 。即传递对象的副本。
	 */
	//当形式参数是基本数据类型的时候，形式参数的改变不影响实际参数。
	
	public static void setAge2(int age){
		age = 20;
	}
	//这个位置需要我们传入一个对象 。Student
	public static void setStudentId2(Student stu){
		stu.id=20;
	}
	
	
	
	
	/**
	 * 值传递，引用传递 。
	 * 注意：在java中参数传递的方式  只有一种，我们叫做值传递 。即传递对象的副本。
	 */
	//当形式参数是基本数据类型的时候，形式参数的改变不影响实际参数。
	
	public static void setAge3(int age){
		age = 20;
	}
	//这个位置需要我们传入一个对象 。Student
	public static void setStudentId3(Student stu){
		stu.id=20;
	}
	
	
	
	
	/**
	 * 值传递，引用传递 。
	 * 注意：在java中参数传递的方式  只有一种，我们叫做值传递 。即传递对象的副本。
	 */
	//当形式参数是基本数据类型的时候，形式参数的改变不影响实际参数。
	
	public static void setAge4(int age){
		age = 20;
	}
	//这个位置需要我们传入一个对象 。Student
	public static void setStudentId4(Student stu){
		stu.id=20;
	}
	
	
	
	
	/**
	 * 值传递，引用传递 。
	 * 注意：在java中参数传递的方式  只有一种，我们叫做值传递 。即传递对象的副本。
	 */
	//当形式参数是基本数据类型的时候，形式参数的改变不影响实际参数。
	
	public static void setAge5(int age){
		age = 20;
	}
	//这个位置需要我们传入一个对象 。Student
	public static void setStudentId5(Student stu){
		stu.id=20;
	}
	
	public static void main(String[] args) {
		//int age = 18;//我的年龄
		//setAge(age);//实参 。
		//System.out.println(age);
		
		//创建一个student对象 。
		Student tom = new Student();
		Student jack = new Student();
		System.out.println(tom.id);
		System.out.println(jack.id);
		System.out.println(tom==jack);
		
//		String i = "11";
//		String j = "11";
//		System.out.println(i.equals(j));
		
		setStudentId(tom);
		
		System.out.println(tom.id);
	}

}
