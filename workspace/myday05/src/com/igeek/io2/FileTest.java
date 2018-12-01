package com.igeek.io2;

import java.io.File;

public class FileTest {

	public static void main(String[] args) throws Exception {
		File file = new File("d:/eclipse");//eclipse 圆缺。
		/*boolean flag = file.exists();
		System.out.println(flag);*/
		//boolean flag = file.mkdirs();//mkdirs 创建多层目录  mkdir 创建单层目录 。
		//System.out.println(flag);
		//boolean flag=file.createNewFile();//createNewFile 创建一个具体的文件 。.txt
		//System.out.println(flag);
		/*String [] files = file.list();//列出目录下的列表。
		for (int i = 0; i < files.length; i++) {
			//System.out.println(files[i]);
			File ff = new File("d:\\eclipse",files[i]);
			if(ff.isFile()){
				//证明这的确是一个文件。
				System.out.println("这就是一个文件。");
			}
		}
		
		boolean isDirectory = file.isDirectory();
		System.out.println(isDirectory);
		
		boolean isFile = file.isFile();
		System.out.println(isFile);*/
		file.delete();
	}

}
