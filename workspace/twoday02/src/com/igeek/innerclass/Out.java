package com.igeek.innerclass;

public class Out {
	
	private static String name = "外部类";
	// 内部类
	public class Inner{
		// 构造器...
		// 属性...
		// 方法...
		private String name = "内部类中的name";
		public String color = "黑色";
		
		public void show(String name){
			// Out out = new Out();
			System.out.println(name);
			System.out.println(this.name);
			System.out.println(Out.name);
			// 对于静态内部类 ， 想要访问外部类的成员 ， 一般给这个成员变成静态的
			eat();
		}
	}
	
	public void show(){
		// 外部类  想要调用内部类的成员	必须内部类对象 . 创建对象的方式	直接	内部类   对象名 = new 内部类构造器();
		Inner in = new  Inner();
		String color = in.color;
		System.out.println(color);
	}
	
	public static void eat(){
		System.out.println("吃...");
	}
	
	

}
