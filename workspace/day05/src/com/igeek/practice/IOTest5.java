package com.igeek.practice;

import java.io.FileReader;
import java.io.FileWriter;

public class IOTest5 {
	
	// ʵ���ļ��ĸ���  �� �ӱ��ض�ȡ���� �� �ٽ�����д�뵽ָ���ĵط� �� 

	public static void main(String[] args) throws Exception {
		
		FileReader fr = new FileReader("e:0707.txt");
		FileWriter fw = new FileWriter("e:0303.txt");
		
		int i = 0;
		char[] c = new char[1024];
		
		while((i = fr.read(c)) != -1){
			
			// д���� �� 
			fw.write(c,0,i);
		}
		
		// ע�� �� �ر����и�ԭ��	 ����ʹ�õ����ر�
		fw.close();
		fr.close();

	}

}
