package com.igeek.innerclass;


/**
 * 
 * @author student
 * 
 * 内部类
 * 
 * 		一： 成员内部类
 * 			（1.修饰符，可以是public,default,pratected,private）
 * 			（2.内部类可以是静态的，也可以是非静态的）
 * 				静态内部类：只能访问外层的静态成员 。 里面可以声明静态成员
 * 				非静态内部类：里面不能声明静态成员
 * 			（3.还可以被final修饰。 ）{被final修饰的类不能被继承 ， 太监类}
 * 		二： 局部内部类（内部类在方法中定义）
 * 			1.方法的局部内部类
 * 					1.1只能是非static的 .
 * 					1.2只能在定义的方法中创建对象来使用  。 
 * 					1.3没有访问权限修饰符 （只能是默认不写的）
 * 
 * 			2.匿名内部类 。 
 * 					一般多用来创建接口对象 。 或者抽象类对象
 * 					{ 在方法体中加入实现的方法 }
 * 
 * 			在其他类中 ， 想要使用一个类的内部类 ，需要以下格式类创建对象 。 
 * 				外部类.内部类 	对象名称 = new 外部类构造器().内部类构造器();
 * 			在外部类中想要访问内部类的成员 。 非常简单创建对象 。 
 * 			在内部类中想要访问外部类的成员 。 非常简单直接写 。 
 *
 */
public class Out {
	
	private String name = "张";
	private static int age = 20;
	
	 class Inner{
		
		private  String name = "全";
		// 只有静态内部类中 ， 可以声明静态成员 。 
		// 一旦内部类是静态的 只能使用外层的静态成员
		public void eat(String name){
			System.out.println(name);
			System.out.println(this.name);
			System.out.println(Out.this.name);
			System.out.println(age);
			// System.out.println(super.name);
			System.out.println(age);
			wan();
		}
		
	}
	 
	 public void play(){
		// 在外部类中想要访问内部类的成员 。 非常简单创建对象 。
		 Inner in = new Inner();
		 in.eat("name");
	 }
	 
	 public void wan(){
		 // 没有访问权限修饰符 。 defult
		 class MethodInnerClass{
			 int age = 20;
			 String name = "李小龙";
			 public void test(){
				 System.out.println("测试下局部内类");
			 }
		 }
		 
		 MethodInnerClass mic = new MethodInnerClass();
		 System.out.println(mic.name);
		 System.out.println(mic.age);
		 mic.test();
	 }

}
