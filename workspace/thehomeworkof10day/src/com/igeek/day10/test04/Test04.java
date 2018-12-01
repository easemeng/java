package com.igeek.day10.test04;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;

/*
 * 分析以下需求，并用代码实现
	定义一个工具类IOUtils，有以下方法，方法描述如下(以下操作只针对纯文本文件(.txt文件))：
	1.copyFile2Dir(String srcFile,String destDir)
	    参数String srcFile:要复制的源文件
		参数String destDir:复制产生的新文件的存储路径(目标路径)
		要求：将srcFile文件复制到destDir目标文件夹中(不能改变源文件的名称)
	2.copyDir2Dir(String srcDir,String destDir)
		参数File srcDir:要复制的源文件夹
		参数File destDir:复制产生的新文件的存储路径(目标路径)
		要求：将srcDir文件夹中的所有文件(不包含子文件夹)复制到destDir目标文件夹中(不能改变源文件的名称)

 */
public class Test04 {
	public void copyFile2Dir(String srcFile,String destDir ) {
		try{
			//定义字符读取留
			BufferedReader bufferReader = new BufferedReader(new FileReader(srcFile));
			
			//定义StringBuilder来拼接写入地址
			StringBuilder stringBuilder = new StringBuilder();
			
			//判断给定字符串地址是否有文件/||\\标识符
			if(destDir.endsWith("\\")||destDir.endsWith("/")){
				//直接拼接
				stringBuilder.append(destDir).append(srcFile);			
			}else{
				//添加一个字符标识
				stringBuilder.append(destDir).append("/").append(srcFile);
				
			}
			//定义字符写入流
			BufferedWriter bufferedwriter = new BufferedWriter(new FileWriter(stringBuilder.toString()));
			
			//定义字符数组
			char[] srcDataArray = new char[1024*1024];
			
			//定义字符串读取数据
			String len;
			
			//循环读取
			while((len = bufferReader.readLine())!=null){
				
				//将字符串转化为字符数组
				srcDataArray = len.toCharArray();
				
				//写入
				bufferedwriter.write(srcDataArray);
				
				//换行
				bufferedwriter.newLine();
			}
			//关流
			bufferReader.close();
			bufferedwriter.close();
		}catch(Exception e){
			//TODO Auto - generated catch block
			e.printStackTrace();
		}
	}
	public static void main(String[] args) {
		//创建文件拷贝对象
		Test04 ioUtils = new Test04();
		ioUtils.copyFile2Dir("Student.txt", "name1.txt");
		
	}
}
