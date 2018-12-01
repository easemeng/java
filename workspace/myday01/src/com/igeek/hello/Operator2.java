package com.igeek.hello;

public class Operator2 {

	public static void main(String[] args) {
        int i1 = 10,i2 = 20;// 给变量进行连续赋值。 i1 = 10 i2 = 20
        int i = i1++;//i = 10  i1 = 11
        System.out.print("i="+i);//10
        System.out.println("i1="+i1);//11
        i = ++i1;//12  
        System.out.print("i="+i);//12
        System.out.println("i1="+i1);//12
        i = i2--;//i=20  i2=19
        System.out.print("i="+i);//20
        System.out.println("i2="+i2);//19
        i = --i2;//i2=18  i=18
        System.out.print("i="+i);
        System.out.println("i2="+i2);

	}

}
