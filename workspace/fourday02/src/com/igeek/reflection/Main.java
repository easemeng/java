package com.igeek.reflection;

public class Main {

	public static void main(String[] args) throws Exception {
		
		// Class.forName("");
		// System.out.println(args[0]);
		// classType  ¿‡¿‡–Õ

		Class<?> classType = Class.forName(args[0]);
		Office office = (Office) classType.newInstance();
		office.start();
	}

}
