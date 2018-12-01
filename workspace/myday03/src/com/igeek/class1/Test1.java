package com.igeek.class1;

public class Test1 {
	/**
	 * 面向对象  
	 * 	封装:
	 * 		1.私有属性，提供共有的set/get。
	 * 		2.把实现某一段功能的代码，写入到一个方法中的过程。我们也叫封装。  
	 *  继承:
	 *  多态:
	 */
	@SuppressWarnings("unused")
	public static void main(String[] args) {
		
		//通过一个类的构造器，我们可以创建无数个对象。
		
		//创建对象。
		TestVraiable tv1 = new TestVraiable();
		TestVraiable tv2 = new TestVraiable();
		tv1.setAge(22);
		//tv1.age=100;
		TestVraiable.country="大清朝.";
		//tv2.age=200;
		int age = tv1.getAge();//赋值调用。
		System.out.println(age);
		System.out.println(TestVraiable.country);
		
		//System.out.println(tv2.age);
		System.out.println(TestVraiable.country);
		
	}
	
	//求和   。 传递一个任意参数，给你返回 1到这个数的和 。
	public int getSum(int n){
		int sum = 0;
		for (int i = 1; i <=n; i++) {
			sum+=i;
		}
		return sum;
	}

}
