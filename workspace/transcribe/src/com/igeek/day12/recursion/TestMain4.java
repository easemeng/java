package com.igeek.day12.recursion;

import java.io.File;

public class TestMain4 {

	public static void main(String[] args) {
		
		// 递归打印每个文件夹 。 
		// 声明一个 File 对象 。 
		File file = new File("./");
		printFile(file);

	}
	
	public static void printFile(File file){
		File[] listFiles = file.listFiles();
		// 拿到当前路径下所有的文件对象 。 可以遍历循环 。 
		for(File file2 : listFiles){
			if(file2.isFile()){
				// getAbsolutePath()   返回此抽象路径名的绝对路径名字符串。 
				System.out.println(file2.getAbsolutePath());
			}else{
				System.out.println(file2.getAbsolutePath());
				printFile(file2);
			}
		}
	}

}
