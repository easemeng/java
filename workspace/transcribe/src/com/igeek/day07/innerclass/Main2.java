package com.igeek.day07.innerclass;

public class Main2 {

	public static void main(String[] args) {
		// 内部类创建对象的格式
		// 外部类.内部类	内部类对象名称	=	new 外部类构造器().new 内部类构造器();
		Out.Inner sb = new Out().new Inner();
		sb.show(".....");

	}

}
