package com.igeek.io1;

import java.io.FileWriter;

public class IOTest1 {

	public static void main(String[] args) throws Exception {
		//IO  ���������   �� (InputStream   OutputStream)
		//  ����Դ�����java���� �� ����   
		//  ��java������Ҫ���ʵ���Դ �� ��� 
		
		//IO   �ֽ���    XxxxInputStream  XxxxOutputStream  (���Զ�ȡ�����׺ ��)
		//     �ַ���    XxxxReader   XxxxxWriter (ֻ�ܶ�ȡ�ĵ����͡�)
		
		FileWriter fw = new FileWriter("d:/a.txt",true);
		
		fw.write("\r\n");
		fw.write("\n");
		fw.write("\r");
		
		fw.write("abc123");//���ļ���д�����ݡ�
		
		fw.flush();//���ڴ��е����ݣ�д�뵽Ӳ����
		
		fw.write("����123");
		
		fw.flush();
		
		fw.close();
	}

}
