package com.igeek.sanmu;

public class Test1 {

	@SuppressWarnings("unused")
	public static void main(String[] args) {
		
		//格式  (布尔类型的表达式)?结果1:结果2;
		
		//  int x = 0;    x>10&&x++<5&&x++>100
		
		int x = 0;    
		
		byte i = (byte) ((x>10&&x++<5&&x++>100)?1:-1);
		System.out.println(x);
		
		//其实 三元运算就是简化版的if  else...
	//	System.out.println(str);
	}

}
