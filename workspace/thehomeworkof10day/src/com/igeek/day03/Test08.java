package com.igeek.day03;

public class Test08 {

	public static void main(String[] args) {
		
		int x = 1,y = 1;
		if(x++==1 | ++y==1)	{
			x =7;
		}
		System.out.println("x="+x+",y="+y);  // 7 2
		
		int a = 1,b = 1;
		if(a++==1 || ++b==1) {
			a =7;
		}
		System.out.println("a="+a+",b="+b);  // 7 1
		
		boolean c = true;
		if(c==false) 
			System.out.println("a");
		else if(c)
			System.out.println("b");  //
		else if(!c)
			System.out.println("c");
		else
			System.out.println("d");

	}

}
