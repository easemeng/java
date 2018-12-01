package com.igeek.day01.data3;

public class QiangZhi {

	public static void main(String[] args) {
		
		/**
		 * 强制类型转换
		 * 
		 * byte short char    int long float double
		 * 
		 * 小的数据类型 转换成大的数据类型  隐式转化 自动完成
		 * 
		 * 大的数据类型转换成小的数据类型   强制转化  需要你手动去指定
		 * 格式 ：    目标类型  变量名称  = (目标类型) 原始变量
		 * 		long a = 100；
		 * 		int b = （int） a； 
		 */
		// int b = 10;
		// long a = b;  // 隐式转换
		
		long a = 10;
		int b = (int)a;  // 强制转换 。  需要加入 （你需要的数据类型）
		// 强制转换可能会带来问题  精度的降低 或数据的丢失
		
		int i = 10;
		byte b2 = (byte)a;  // 可以装下的时候没有任何问题
		System.out.println(b2);
		
		float f1 = 56443.465464864443F;  // float 类型表示单精度  有效数位8
		System.out.println(f1);
		
		double d1 = 87987.67965464444446469468;  // double  表示双精度
		System.out.println(d1);
		
		float f2 = (float)d1;
		System.out.println(f2);

	}

}
