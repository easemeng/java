//package 表示包的意思  ， 其实就是文件夹 。
package com.igeek.hello;

//标识符  :  在java中凡是可以自己取名字的地方。
/**
 * 标识符的命名规范 。
 *  只能A-Z,a-z,0-9,_,$。
 *  命名的时候，不能是java的关键字或者保留字 。
 *  不能包含空格，还不能以数字开头。
 *  不能包含空格。
 *  
 *  
 *  java关键字,被java赋予了特殊含义的单词 。
 *  所有字符都是小写。 
 *  
 *  public 共有的 。  访问权限修饰符 。
 *  class 类 。
 *  static 静态的。
 *  void 没有返回值。
 *  
 *  保留字：当前版本不是java关键字，在以后的版本升级中可能称为java关键字 。
 *  
 *  包名称   com/cn   .  你的公司或者组织的名称  igeek   .  hello 表示描述当前包中的java类都是hello.
 *  
 *  类名称   AaaaBbbbbCccc  每个单词的首字母大写 。
 * 
 * @author 极客营
 * @Version 1.0 2018年8月20日
 * Company wh.igeekhome.com
 */
public class Hello {

	public static void main(String[] args) {
		/**
		 * 常量 ，在程序过程中，其值不能发生改变 。
		 * 
		 * java中分为以下数据类型 。
		 * 		1.基本数据类型。(4类8种)
		 * 			1.1 整数类型 。
		 * 				byte -128-127  1个字节  -2^7 -  2^7-1
		 * 				short -32768-32767 2字节  -2^15  - 2^15-1
		 * 				int 				4字节	-2^31  - 2^31-1   (整数中默认的数据类型)
		 * 				long                8字节 -2^63  -  2^63-1    L或者l
		 * 			1.2 浮点类型。
		 * 				float     4字节     F或者f  单精度。
		 * 				double    8字节   (小数中默认的数据类型)  双精度。
		 * 			1.3 布尔类型。
		 * 				boolean   1字节	true(真),false(假)
		 * 			1.4 字符类型。
		 * 				char  1|2 字节   
		 * 		2.引用数据类型。(对象。)
		 * 			数组 
		 * 			类的对象
		 * 			String 
		 */
		System.out.println("hello");
		System.out.println(100);
		System.out.println(-100);
		System.out.println(15.5);
	}

}
