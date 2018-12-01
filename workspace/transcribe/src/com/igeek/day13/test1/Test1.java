package com.igeek.day13.test1;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Test1 {
	
	public static void main(String[] args)  {
		// TODO Auto-generated method stub
		File oldPath = new File("src");
		File newPath = new File("desc");
		copy(oldPath, newPath);
	}

	//desc/come   desc/test
	public static void copy(File oldPath, File newPath)  {
		File[] files = oldPath.listFiles();
		for (File file : files) {
			File newFile = new File(newPath,file.getName());
			// 判断是否是一个目录 。
			if (file.isDirectory()) {
				//file src/come 
				//创建这个目录  所对应的新目录。desc/come/igeek 
				//File newFile = new File(newPath,file.getName());//desc/come
				//创建这个路径 。
				newFile.mkdirs();
				//src\com  oldPath  老的路径 。    newFile就是新的路径。
				//src/come  ,  desc/come
				//src/come/igeek  desc/come/igeek/test1.
				copy(oldPath,newFile);
			} else {
				//这个时候 就要拷贝文件。  给个原始路径 File 对象表示 ，新路径，也用File对象来表示 。
				//File newFile = new File(newPath,file.getName());
				copyFile(oldPath,newFile);
			}
		}
	}
	
	public static void copyFile(File oldPath, File newPath){
		
		try {
			//字节流 。
			FileInputStream fileInputStream = new FileInputStream(oldPath);
			FileOutputStream fileOutputStream = new FileOutputStream(newPath);
			BufferedInputStream bufferedInputStream = new BufferedInputStream(fileInputStream);
			BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(fileOutputStream);
			byte [] b = new byte[1024];
			int len = 0;
			while((len=bufferedInputStream.read(b))!=-1){
				bufferedOutputStream.write(b, 0, len);
			}
			bufferedOutputStream.close();
			bufferedInputStream.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	
	/**
	 * //判断是否是一个目录 。 
	 * if(file.isDirectory()){ 
	 * 	//得到新的文件对象。文件对象的地址 = newPath + file.getName(); 
	 * 	File newFile = new File(newPath,file.getName());
	 * 	System.out.println(newFile); //然后创建该目录所 
	 *  newFile.mkdirs();
	 * 	copy(file,newFile); 
	 * }else{ 
	 * 	File newFile2 = new File(newPath,file.getName()); 
	 * 	copyFile(file,newFile2); 
	 * }
	 */
	/**
	 * String path = file.getName(); 
	 * File newFile = new File(newPath,path);
	 * if(file.isDirectory()){ copy(file,newFile); newFile.mkdirs(); }else{
	 * copyFile(file,newFile); }
	 */

}
