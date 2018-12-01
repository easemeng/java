package com.igeek.day08.baozhuang;

public class Test1 {
	public static void main(String[] args) {
		// 包装类
		// 基本数据类型，引用数据类型
		// 每个基本数据类型都有他与之对应的引用数据类型 ， 就是包装类
		/**
		 * byte		Byte
		 * short    Short
		 * int		 Integer
		 * long		Long
		 * float	Float
		 * double	Double
		 * boolean	Boolean
		 * char		 Character
		 */
		// 包装类中存在很多常用的属性跟方法 。 
		
		// 装箱 、 拆箱
		// 装箱：把基本数据类型转换成包装类对象 。 
		// 拆箱：把包装类对象转换成基本数据类型 。 
		// JDK1.5   手动的去拆装箱		JDK1.5之后支持自动拆装箱 。 
		
		/*byte b1 = 12;
		Byte b2 = new Byte(b1);  // 装箱 。 
		Integer i1 = new Integer(b1);
		System.out.println(b2.MAX_VALUE);
		System.out.println(b2.MIN_VALUE);
		
		System.out.println(i1.MAX_VALUE);
		System.out.println(i1.MIN_VALUE);
		
		byte b3 = b2.byteValue();  // 拆箱	。凡是拆箱都是调用xxxxValue方法。
		int i2 = i1.intValue();*/
		
		
		int i = 10;
		Integer i2 = i;  // 自动装箱 。 		声明包装类对象 = 基本数据类型。
		Integer i3 = 10;
		System.out.println(i2);
		
		int i4 = i3;  // 自动拆箱 。 
		System.out.println(i4);
		String str = "123";
		int result = Integer.parseInt(str);  // 如何把一个字符串转换成基本数据类型 。 
		double result2 = Double.parseDouble(str);
		float result3 = Float.parseFloat(str);
		// 注：必须是纯数字字符串
		System.out.println(result3);
		
		
		
		
		// 包装类
		// 基本数据类型，引用数据类型
		// 每个基本数据类型都有他与之对应的引用数据类型 ， 就是包装类
		/**
		 * byte		Byte
		 * short    Short
		 * int		 Integer
		 * long		Long
		 * float	Float
		 * double	Double
		 * boolean	Boolean
		 * char		 Character
		 */
		// 包装类中存在很多常用的属性跟方法 。 
		
		// 装箱 、 拆箱
		// 装箱：把基本数据类型转换成包装类对象 。 
		// 拆箱：把包装类对象转换成基本数据类型 。 
		// JDK1.5   手动的去拆装箱		JDK1.5之后支持自动拆装箱 。 

		// 拆箱	。凡是拆箱都是调用xxxxValue方法。
		
		int i11 = 10;
		Integer i12 = i;  // 自动装箱 。 		声明包装类对象 = 基本数据类型。
		Integer i13 = 10;
		System.out.println(i12);
		
		int i14 = i13;  // 自动拆箱 。 
		System.out.println(i4);
		String str1 = "123";
		int result11 = Integer.parseInt(str1);  // 如何把一个字符串转换成基本数据类型 。 
		double result12 = Double.parseDouble(str1);
		float result13 = Float.parseFloat(str1);
		// 注：必须是纯数字字符串
		System.out.println(result13);
		
		
		
		
		// 包装类
		// 基本数据类型，引用数据类型
		// 每个基本数据类型都有他与之对应的引用数据类型 ， 就是包装类
		/**
		 * byte		Byte
		 * short    Short
		 * int		 Integer
		 * long		Long
		 * float	Float
		 * double	Double
		 * boolean	Boolean
		 * char		 Character
		 */
		// 包装类中存在很多常用的属性跟方法 。 
		
		// 装箱 、 拆箱
		// 装箱：把基本数据类型转换成包装类对象 。 
		// 拆箱：把包装类对象转换成基本数据类型 。 
		// JDK1.5   手动的去拆装箱		JDK1.5之后支持自动拆装箱 。 

		// 拆箱	。凡是拆箱都是调用xxxxValue方法。
		
		int i21 = 10;
		Integer i22 = i;  // 自动装箱 。 		声明包装类对象 = 基本数据类型。
		Integer i23 = 10;
		System.out.println(i22);
		
		int i24 = i23;  // 自动拆箱 。 
		System.out.println(i24);
		String str2 = "123";
		int result21 = Integer.parseInt(str2);  // 如何把一个字符串转换成基本数据类型 。 
		double result22 = Double.parseDouble(str2);
		float result23 = Float.parseFloat(str2);
		// 注：必须是纯数字字符串
		System.out.println(result23);
		
		
		
		
		// 包装类
		// 基本数据类型，引用数据类型
		// 每个基本数据类型都有他与之对应的引用数据类型 ， 就是包装类
		/**
		 * byte		Byte
		 * short    Short
		 * int		 Integer
		 * long		Long
		 * float	Float
		 * double	Double
		 * boolean	Boolean
		 * char		 Character
		 */
		// 包装类中存在很多常用的属性跟方法 。 
		
		// 装箱 、 拆箱
		// 装箱：把基本数据类型转换成包装类对象 。 
		// 拆箱：把包装类对象转换成基本数据类型 。 
		// JDK1.5   手动的去拆装箱		JDK1.5之后支持自动拆装箱 。 

		// 拆箱	。凡是拆箱都是调用xxxxValue方法。
		
		int i31 = 10;
		Integer i32 = i31;  // 自动装箱 。 		声明包装类对象 = 基本数据类型。
		Integer i33 = 10;
		System.out.println(i32);
		
		int i34 = i33;  // 自动拆箱 。 
		System.out.println(i4);
		String str3 = "123";
		int result31 = Integer.parseInt(str1);  // 如何把一个字符串转换成基本数据类型 。 
		double result32 = Double.parseDouble(str1);
		float result33 = Float.parseFloat(str1);
		// 注：必须是纯数字字符串
		System.out.println(result33);
		
		
		
		
		// 包装类
		// 基本数据类型，引用数据类型
		// 每个基本数据类型都有他与之对应的引用数据类型 ， 就是包装类
		/**
		 * byte		Byte
		 * short    Short
		 * int		 Integer
		 * long		Long
		 * float	Float
		 * double	Double
		 * boolean	Boolean
		 * char		 Character
		 */
		// 包装类中存在很多常用的属性跟方法 。 
		
		// 装箱 、 拆箱
		// 装箱：把基本数据类型转换成包装类对象 。 
		// 拆箱：把包装类对象转换成基本数据类型 。 
		// JDK1.5   手动的去拆装箱		JDK1.5之后支持自动拆装箱 。 

		// 拆箱	。凡是拆箱都是调用xxxxValue方法。
		
		int i41 = 10;
		Integer i42 = i41;  // 自动装箱 。 		声明包装类对象 = 基本数据类型。
		Integer i43 = 10;
		System.out.println(i42);
		
		int i44 = i43;  // 自动拆箱 。 
		System.out.println(i4);
		String str4 = "123";
		int result41 = Integer.parseInt(str4);  // 如何把一个字符串转换成基本数据类型 。 
		double result42 = Double.parseDouble(str4);
		float result143 = Float.parseFloat(str4);
		// 注：必须是纯数字字符串
		System.out.println(result143);
		
	}
}
