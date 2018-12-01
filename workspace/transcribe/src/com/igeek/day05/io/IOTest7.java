package com.igeek.day05.io;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class IOTest7 {
	/**
	 * XXXXWriter  一定是字符输出流 
	 * XXXXReader  一定是字符输入流
	 * 
	 * XXXXInputStream  一定是字节输入流
	 * XXXXOutputStream 一定是字节输出流
	 * 
	 * buffered 一定是缓冲流。。。
	 * @param args
	 * @throws Exception
	 */
	//NIO ...
	public static void main(String[] args) throws Exception {
		Long startTime = System.currentTimeMillis();
		//FileReader fr = new FileReader("数组.xlsx");
		//FileWriter fw = new FileWriter("sb.xlsx");
		FileInputStream fr = new FileInputStream("c:/canglaoshi2.mp4");
		FileOutputStream fw = new FileOutputStream("c:/canglaoshi3.mp4");
		//创建缓冲流对象。
		BufferedInputStream bi = new BufferedInputStream(fr);
		BufferedOutputStream bo = new BufferedOutputStream(fw);
		/*int i = 0;
		byte [] c = new byte [1024];
		while((i=bi.read(c))!=-1){
			bo.write(c, 0, i);
		}*/
		/*int i = 0;
		while((i=bi.read())!=-1){
			bo.write(i);
		}*/
		bo.close();
		bi.close();
		fw.close();
		fr.close();
		Long time = System.currentTimeMillis()-startTime;
		System.out.println(time);
		
		
		
		
		/**
		 * XXXXWriter  一定是字符输出流 
		 * XXXXReader  一定是字符输入流
		 * 
		 * XXXXInputStream  一定是字节输入流
		 * XXXXOutputStream 一定是字节输出流
		 * 
		 * buffered 一定是缓冲流。。。
		 */
		Long startTime2 = System.currentTimeMillis();
		//FileReader fr = new FileReader("数组.xlsx");
		//FileWriter fw = new FileWriter("sb.xlsx");
		FileInputStream fr2 = new FileInputStream("c:/canglaoshi2.mp4");
		FileOutputStream fw2 = new FileOutputStream("c:/canglaoshi3.mp4");
		//创建缓冲流对象。
		BufferedInputStream bi2 = new BufferedInputStream(fr2);
		BufferedOutputStream bo2 = new BufferedOutputStream(fw2);
		/*int i = 0;
		byte [] c = new byte [1024];
		while((i=bi.read(c))!=-1){
			bo.write(c, 0, i);
		}*/
		/*int i = 0;
		while((i=bi.read())!=-1){
			bo.write(i);
		}*/
		bo.close();
		bi.close();
		fw.close();
		fr.close();
		Long time2 = System.currentTimeMillis()-startTime2;
		System.out.println(time2);
		
		
		
		
		/**
		 * XXXXWriter  一定是字符输出流 
		 * XXXXReader  一定是字符输入流
		 * 
		 * XXXXInputStream  一定是字节输入流
		 * XXXXOutputStream 一定是字节输出流
		 * 
		 * buffered 一定是缓冲流。。。
		 */
		Long startTime3 = System.currentTimeMillis();
		//FileReader fr = new FileReader("数组.xlsx");
		//FileWriter fw = new FileWriter("sb.xlsx");
		FileInputStream fr3 = new FileInputStream("c:/canglaoshi2.mp4");
		FileOutputStream fw3 = new FileOutputStream("c:/canglaoshi3.mp4");
		//创建缓冲流对象。
		BufferedInputStream bi3 = new BufferedInputStream(fr);
		BufferedOutputStream bo3 = new BufferedOutputStream(fw);
		/*int i = 0;
		byte [] c = new byte [1024];
		while((i=bi.read(c))!=-1){
			bo.write(c, 0, i);
		}*/
		/*int i = 0;
		while((i=bi.read())!=-1){
			bo.write(i);
		}*/
		bo.close();
		bi.close();
		fw.close();
		fr.close();
		Long time3 = System.currentTimeMillis()-startTime;
		System.out.println(time3);
		
		
		
		
		/**
		 * XXXXWriter  一定是字符输出流 
		 * XXXXReader  一定是字符输入流
		 * 
		 * XXXXInputStream  一定是字节输入流
		 * XXXXOutputStream 一定是字节输出流
		 * 
		 * buffered 一定是缓冲流。。。
		 */
		Long startTime4 = System.currentTimeMillis();
		//FileReader fr = new FileReader("数组.xlsx");
		//FileWriter fw = new FileWriter("sb.xlsx");
		FileInputStream fr4 = new FileInputStream("c:/canglaoshi2.mp4");
		FileOutputStream fw4 = new FileOutputStream("c:/canglaoshi3.mp4");
		//创建缓冲流对象。
		BufferedInputStream bi4 = new BufferedInputStream(fr);
		BufferedOutputStream bo4 = new BufferedOutputStream(fw);
		/*int i = 0;
		byte [] c = new byte [1024];
		while((i=bi.read(c))!=-1){
			bo.write(c, 0, i);
		}*/
		/*int i = 0;
		while((i=bi.read())!=-1){
			bo.write(i);
		}*/
		bo.close();
		bi.close();
		fw.close();
		fr.close();
		Long time4 = System.currentTimeMillis()-startTime;
		System.out.println(time);
		
		
		
		
		/**
		 * XXXXWriter  一定是字符输出流 
		 * XXXXReader  一定是字符输入流
		 * 
		 * XXXXInputStream  一定是字节输入流
		 * XXXXOutputStream 一定是字节输出流
		 * 
		 * buffered 一定是缓冲流。。。
		 */
		Long startTime5 = System.currentTimeMillis();
		//FileReader fr = new FileReader("数组.xlsx");
		//FileWriter fw = new FileWriter("sb.xlsx");
		FileInputStream fr5 = new FileInputStream("c:/canglaoshi2.mp4");
		FileOutputStream fw5 = new FileOutputStream("c:/canglaoshi3.mp4");
		//创建缓冲流对象。
		BufferedInputStream bi5 = new BufferedInputStream(fr5);
		BufferedOutputStream bo5 = new BufferedOutputStream(fw5);
		/*int i = 0;
		byte [] c = new byte [1024];
		while((i=bi.read(c))!=-1){
			bo.write(c, 0, i);
		}*/
		/*int i = 0;
		while((i=bi.read())!=-1){
			bo.write(i);
		}*/
		bo.close();
		bi.close();
		fw.close();
		fr.close();
		Long time5 = System.currentTimeMillis()-startTime5;
		System.out.println(time5);
	}

}
