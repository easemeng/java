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
			// �ж��Ƿ���һ��Ŀ¼ ��
			if (file.isDirectory()) {
				//file src/come 
				//�������Ŀ¼  ����Ӧ����Ŀ¼��desc/come/igeek 
				//File newFile = new File(newPath,file.getName());//desc/come
				//�������·�� ��
				newFile.mkdirs();
				//src\com  oldPath  �ϵ�·�� ��    newFile�����µ�·����
				//src/come  ,  desc/come
				//src/come/igeek  desc/come/igeek/test1.
				copy(oldPath,newFile);
			} else {
				//���ʱ�� ��Ҫ�����ļ���  ����ԭʼ·�� File �����ʾ ����·����Ҳ��File��������ʾ ��
				//File newFile = new File(newPath,file.getName());
				copyFile(oldPath,newFile);
			}
		}
	}
	
	public static void copyFile(File oldPath, File newPath){
		
		try {
			//�ֽ��� ��
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
	 * //�ж��Ƿ���һ��Ŀ¼ �� 
	 * if(file.isDirectory()){ 
	 * 	//�õ��µ��ļ������ļ�����ĵ�ַ = newPath + file.getName(); 
	 * 	File newFile = new File(newPath,file.getName());
	 * 	System.out.println(newFile); //Ȼ�󴴽���Ŀ¼�� 
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
