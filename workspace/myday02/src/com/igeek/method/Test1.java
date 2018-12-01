package com.igeek.method;

public class Test1 {

	public static void main(String[] args) {
		//方法 ， 方法就是完成特定功能的某一段代码。
		
		//方法Method(函数Function)定义的格式 。
		
		//访问权限修饰符   + 返回值类型  +方法名称 (参数列表){ 
		//		方法体
		//		return 具体的返回值;
		//}
		
		//如何调用方法 ？？
		//getSum(10,20);  //单独调用有返回值的方法。没有任何意义的。
		
		//System.out.println(getSum(10,20));//此时会打印当前方法的返回值。 我们也不推荐。
		
		//int i = getSum(10,20);//赋值调用。 推荐使用赋值调用。
		//System.out.println(i);
		print();//void 表示方法没有返回值类型，对于这种方法而言 。我们只能调用。
	}
	
	//public 共有的  protected 受保护的  default 默认不写的  private 私有的 。
	//返回值类型  。可以是基本数据类型，也可以引用数据类型 。
	//方法名称    自己定义的 命名规则    aaaBbbCcc  
	//参数列表 ， 表示在调用方法的时候需要传入的具体参数 。
	//return 表示方法的返回值 。
	
	public static int  getSum(int a,int b){//a=10,b=20;
		//
		// 方法体。
		//
		getMax(2,3);//方法的调用 。
		return a+b; //return 强制跳出方法 ，并且返回数据 。
	}
	
	//注意：方法之间不能互相嵌套 。
	public static int getMax(int x,int y){
		//getSum(10,20); // 方法之间不能互相调用，死循环。
		return x;
	}
	
	//StackOverflowError   一种Error ，无法通过程序处理 。
	//Exception  可以处理的 。
	//Throwable 是所有异常(Exception)跟错误类(Error)的父类 。
	
	public static void print(){
		System.out.println("哈哈哈你好。");
	}

}
