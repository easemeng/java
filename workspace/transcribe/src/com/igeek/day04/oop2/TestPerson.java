package com.igeek.day04.oop2;

/*
 * @Override  判断注解修饰的方法 是否满足重写条件。
 * @SuppressWarnings("unused")  抑制编译警告。
 * @Deprecated 表示即将过期 。  在以后的版本升级中可能会被删除或者替换掉。
 *  JDK 1.0    ---   1.9  坑 。  稳定 。1.8   1.9
 */
@Deprecated
public class TestPerson {
	
	public static void main(String[] args) {
		int a = 10;
		//对象的数据类型    对象名称 = new 构造器();
		//java中的对象都是通过构造器 创建出来的。
		
		//Scanner sc = new Scanner(System.in);
		Person tom = new Person("张全蛋", 20, "妖");// 既创建对象，又给对象进行了初始化操作(给对象中的成员变量进行赋值。)
		//添加完toString之后  再打印对象名称  不再显示对象的内存地址，而是调用toString方法。
		System.out.println(tom);
		
		Person jack = new Person();// 单纯的创建对象，并没有给对象初始化 (并对象中的成员变量进行赋值。)
		System.out.println(jack);
		
		
		
		
		/*
		 * @Override  判断注解修饰的方法 是否满足重写条件。
		 * @SuppressWarnings("unused")  抑制编译警告。
		 * @Deprecated 表示即将过期 。  在以后的版本升级中可能会被删除或者替换掉。
		 *  JDK 1.0    ---   1.9  坑 。  稳定 。1.8   1.9
		 */
		int a2 = 10;
		//对象的数据类型    对象名称 = new 构造器();
		//java中的对象都是通过构造器 创建出来的。
		
		//Scanner sc = new Scanner(System.in);
		Person tom2 = new Person("张", 2, "");// 既创建对象，又给对象进行了初始化操作(给对象中的成员变量进行赋值。)
		//添加完toString之后  再打印对象名称  不再显示对象的内存地址，而是调用toString方法。
		System.out.println(tom2);
		
		Person jack2 = new Person();// 单纯的创建对象，并没有给对象初始化 (并对象中的成员变量进行赋值。)
		System.out.println(jack2);
		
		
		
		
		/*
		 * @Override  判断注解修饰的方法 是否满足重写条件。
		 * @SuppressWarnings("unused")  抑制编译警告。
		 * @Deprecated 表示即将过期 。  在以后的版本升级中可能会被删除或者替换掉。
		 *  JDK 1.0    ---   1.9  坑 。  稳定 。1.8   1.9
		 */
		int a3 = 10;
		//对象的数据类型    对象名称 = new 构造器();
		//java中的对象都是通过构造器 创建出来的。
		
		//Scanner sc = new Scanner(System.in);
		Person tom3 = new Person("张", 45, "");// 既创建对象，又给对象进行了初始化操作(给对象中的成员变量进行赋值。)
		//添加完toString之后  再打印对象名称  不再显示对象的内存地址，而是调用toString方法。
		System.out.println(tom3);
		
		Person jack3 = new Person();// 单纯的创建对象，并没有给对象初始化 (并对象中的成员变量进行赋值。)
		System.out.println(jack3);
		
		
		
		
		/*
		 * @Override  判断注解修饰的方法 是否满足重写条件。
		 * @SuppressWarnings("unused")  抑制编译警告。
		 * @Deprecated 表示即将过期 。  在以后的版本升级中可能会被删除或者替换掉。
		 *  JDK 1.0    ---   1.9  坑 。  稳定 。1.8   1.9
		 */
		int a4 = 10;
		//对象的数据类型    对象名称 = new 构造器();
		//java中的对象都是通过构造器 创建出来的。
		
		//Scanner sc = new Scanner(System.in);
		Person tom4 = new Person("张", 87, "");// 既创建对象，又给对象进行了初始化操作(给对象中的成员变量进行赋值。)
		//添加完toString之后  再打印对象名称  不再显示对象的内存地址，而是调用toString方法。
		System.out.println(tom4);
		
		Person jack4 = new Person();// 单纯的创建对象，并没有给对象初始化 (并对象中的成员变量进行赋值。)
		System.out.println(jack4);
		
		
		
		
		/*
		 * @Override  判断注解修饰的方法 是否满足重写条件。
		 * @SuppressWarnings("unused")  抑制编译警告。
		 * @Deprecated 表示即将过期 。  在以后的版本升级中可能会被删除或者替换掉。
		 *  JDK 1.0    ---   1.9  坑 。  稳定 。1.8   1.9
		 */
		int a5 = 10;
		//对象的数据类型    对象名称 = new 构造器();
		//java中的对象都是通过构造器 创建出来的。
		
		//Scanner sc = new Scanner(System.in);
		Person tom5 = new Person("张", 767, "");// 既创建对象，又给对象进行了初始化操作(给对象中的成员变量进行赋值。)
		//添加完toString之后  再打印对象名称  不再显示对象的内存地址，而是调用toString方法。
		System.out.println(tom5);
		
		Person jack5 = new Person();// 单纯的创建对象，并没有给对象初始化 (并对象中的成员变量进行赋值。)
		System.out.println(jack5);
	}

}
