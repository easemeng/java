package com.igeek.day12.recursion;

import java.io.File;

public class TestMain4 {

	public static void main(String[] args) {
		
		// �ݹ��ӡÿ���ļ��� �� 
		// ����һ�� File ���� �� 
		File file = new File("./");
		printFile(file);

	}
	
	public static void printFile(File file){
		File[] listFiles = file.listFiles();
		// �õ���ǰ·�������е��ļ����� �� ���Ա���ѭ�� �� 
		for(File file2 : listFiles){
			if(file2.isFile()){
				// getAbsolutePath()   ���ش˳���·�����ľ���·�����ַ����� 
				System.out.println(file2.getAbsolutePath());
			}else{
				System.out.println(file2.getAbsolutePath());
				printFile(file2);
			}
		}
	}

}
