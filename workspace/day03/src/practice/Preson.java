package practice;

public class Preson {
	
	// 属性或成员变量
	public String name;
	public int age;
	boolean isMarried;
	
	// 构造器
	public Preson(){}
/*	public Person(String n,int a,boolean im){
		name = n;
		age = a;
		isMarried = im;
	}*/
	
	// 方法，或函数
	public void walk(){
		System.out.println("走路...");
	}
	
	public String display(){
		
		return "名字是：" + name + ",年龄是：" + age + ",Married:" + isMarried;
		
	}
	
	
	// 代码块
	{
		name = "lilei";
		age = 71;
		isMarried = true;
	}
	
	// 内部类
	class pet{
		String name;
		float weight;
		float height;
	}

	public static void main(String[] args) {
		

	}

}
