package com.igeek.io2;

import java.io.File;

public class FileTest {

	public static void main(String[] args) throws Exception {
		File file = new File("d:/eclipse");//eclipse Բȱ��
		/*boolean flag = file.exists();
		System.out.println(flag);*/
		//boolean flag = file.mkdirs();//mkdirs �������Ŀ¼  mkdir ��������Ŀ¼ ��
		//System.out.println(flag);
		//boolean flag=file.createNewFile();//createNewFile ����һ��������ļ� ��.txt
		//System.out.println(flag);
		/*String [] files = file.list();//�г�Ŀ¼�µ��б�
		for (int i = 0; i < files.length; i++) {
			//System.out.println(files[i]);
			File ff = new File("d:\\eclipse",files[i]);
			if(ff.isFile()){
				//֤�����ȷ��һ���ļ���
				System.out.println("�����һ���ļ���");
			}
		}
		
		boolean isDirectory = file.isDirectory();
		System.out.println(isDirectory);
		
		boolean isFile = file.isFile();
		System.out.println(isFile);*/
		file.delete();
	}

}
