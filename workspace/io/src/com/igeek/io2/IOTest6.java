package com.igeek.io2;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

public class IOTest6 {

	public static void main(String[] args) throws Exception {
		
		// FileReader �ַ����������Ӷ���	 FileWriter�ַ����������   ֻ�ܶ�ȡ�ĵ�����  ��  .txt  .docx
		// FileInputStream �ֽ����������	FileOutputStream  �ַ����������		ע�� ���ʲô���ܶ�
		
		long startTime = System.currentTimeMillis();
		// FileReader fr = new FileReader("");
		// FileWriter fw = new FileWriter("");
		FileInputStream fr = new FileInputStream("");
		FileOutputStream fw = new FileOutputStream("");
		
		int i = 0;
		byte [] c = new byte [1024];
		while((i = fr.read(c)) != -1){
			fw.write(c, 0, i);
		}
		
		fw.close();
		fr.close();
		long time = System.currentTimeMillis() - startTime;
		System.out.println(time);

	}

}
