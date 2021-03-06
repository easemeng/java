package com.igeek.day08.exception1;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;


/**
 * 
 * 异常处理的两种方式：
 * 	1.抛
 *  2.处理
 * 
 * @author student
 *
 */
public class TestThrows {
	
	public static void main(String[] args){
		
		// 注意： 在处理异常的时候 ， 抛 。 
		// 抛完之后 ， 谁用谁处理
		
		test();
		
	}
	public static void test() {
		// try 一般只包裹可能产生异常的代码 。
		int a = 0;
		try {
			a = 10;
			FileWriter fw = new FileWriter("e:/a.txt");
			File file = new File("e:/aaa");
		} catch (FileNotFoundException e) {
			e.printStackTrace();// 这里的...
		} catch (IOException e) {
			e.printStackTrace();// 这里的..
		}
		System.out.println(a);
	}
	
	
	
	
	// 注意： 在处理异常的时候 ， 抛 。 
	// 抛完之后 ， 谁用谁处理
	public static void test2() {
		// try 一般只包裹可能产生异常的代码 。
		int a = 0;
		try {
			a = 10;
			FileWriter fw = new FileWriter("e:/a.txt");
			File file = new File("e:/aaa");
		} catch (FileNotFoundException e) {
			e.printStackTrace();// 这里的...
		} catch (IOException e) {
			e.printStackTrace();// 这里的..
		}
		System.out.println(a);
	}
	
	
	
	
	// 注意： 在处理异常的时候 ， 抛 。 
	// 抛完之后 ， 谁用谁处理
	public static void test3() {
		// try 一般只包裹可能产生异常的代码 。
		int a = 0;
		try {
			a = 10;
			FileWriter fw = new FileWriter("e:/a.txt");
			File file = new File("e:/aaa");
		} catch (FileNotFoundException e) {
			e.printStackTrace();// 这里的...
		} catch (IOException e) {
			e.printStackTrace();// 这里的..
		}
		System.out.println(a);
	}
	
	
	
	
	// 注意： 在处理异常的时候 ， 抛 。 
	// 抛完之后 ， 谁用谁处理
	public static void test4() {
		// try 一般只包裹可能产生异常的代码 。
		int a = 0;
		try {
			a = 10;
			FileWriter fw = new FileWriter("e:/a.txt");
			File file = new File("e:/aaa");
		} catch (FileNotFoundException e) {
			e.printStackTrace();// 这里的...
		} catch (IOException e) {
			e.printStackTrace();// 这里的..
		}
		System.out.println(a);
	}
	
	
	
	
	// 注意： 在处理异常的时候 ， 抛 。 
	// 抛完之后 ， 谁用谁处理
	public static void test5() {
		// try 一般只包裹可能产生异常的代码 。
		int a = 0;
		try {
			a = 10;
			FileWriter fw = new FileWriter("e:/a.txt");
			File file = new File("e:/aaa");
		} catch (FileNotFoundException e) {
			e.printStackTrace();// 这里的...
		} catch (IOException e) {
			e.printStackTrace();// 这里的..
		}
		System.out.println(a);
	}

}
