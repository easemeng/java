package com.igeek.day05.io;

import java.io.FileReader;
import java.io.FileWriter;

public class IOTest5 {
	
	//ʵ���ļ��ĸ���  �� �ӱ��ض�ȡ���� ���ٽ�����д�뵽ָ���ط� ��
	public static void main(String[] args) throws Exception {

		FileReader fr = new FileReader("d:/hello.txt");
		FileWriter fw = new FileWriter("c:/cangjingku.txt");
		
		int i = 0;
		char [] c = new char [1024];
		
		while((i=fr.read(c))!=-1){
			
			//д���� ��
			fw.write(c, 0, i);
			
		}
		
		//ע��	�ر���ԭ��   ����ʱ������ر� ��
		fw.close();
		fr.close();
		
		
		
		
		FileReader fr2 = new FileReader("d:/hello.txt");
		FileWriter fw2 = new FileWriter("c:/cangjingku.txt");
		
		int i2 = 0;
		char [] c2 = new char [1024];
		
		while((i=fr.read(c))!=-1){
			
			//д���� ��
			fw.write(c, 0, i);
			
		}
		
		//ע��	�ر���ԭ��   ����ʱ������ر� ��
		fw.close();
		fr.close();
		
		
		
		
		FileReader fr3 = new FileReader("d:/hello.txt");
		FileWriter fw3 = new FileWriter("c:/cangjingku.txt");
		
		int i3 = 0;
		char [] c3 = new char [1024];
		
		while((i3=fr3.read(c))!=-1){
			
			//д���� ��
			fw.write(c, 0, i);
			
		}
		
		//ע��	�ر���ԭ��   ����ʱ������ر� ��
		fw.close();
		fr.close();
		
		
		
		
		FileReader fr4 = new FileReader("d:/hello.txt");
		FileWriter fw4 = new FileWriter("c:/cangjingku.txt");
		
		int i4 = 0;
		char [] c4 = new char [1024];
		
		while((i4=fr.read(c))!=-1){
			
			//д���� ��
			fw.write(c, 0, i);
			
		}
		
		//ע��	�ر���ԭ��   ����ʱ������ر� ��
		fw.close();
		fr.close();
		
		
		
		
		FileReader fr5 = new FileReader("d:/hello.txt");
		FileWriter fw5 = new FileWriter("c:/cangjingku.txt");
		
		int i5 = 0;
		char [] c5 = new char [1024];
		
		while((i=fr.read(c))!=-1){
			
			//д���� ��
			fw.write(c, 0, i);
			
		}
		
		//ע��	�ر���ԭ��   ����ʱ������ر� ��
		fw.close();
		fr.close();
	}

}
