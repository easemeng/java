package com.igeek.method;

public class Test2 {

	@SuppressWarnings("unused")
	public static void main(String[] args) {
		//方法的重载 (Overload)。
		//在同一个类中，允许出现同名方法，只要他们的参数列表不同，即是重载，跟返回值类型无关。
		
		
		String str = haHa(10);
		haHa(); 
	}
	
	//public protected  default  private
	public static String haHa(int a){
		return "哈哈";
	}
	
	public static void haHa(){
		System.out.println("哈哈");
	}

}
