package com.igeek.io;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class IOTest5 {
	
	// ʵ���ļ��ĸ��� �� �ӱ��ض�ȡ���� �� �ٽ�����д�뵽ָ���ĵط� ��
	public static void main(String[] args) throws Exception {
		
		FileReader fr = new FileReader("e:hello.txt");
		FileWriter fw = new FileWriter("d:/cang.txt");
		
		int i = 0;
		char [] c = new char [1024];
		
		while((i = fr.read(c)) != -1){
			
			// д���� �� 
			fw.write(c,0,i);
			
		}
		
		// ע�� �� �ر����и�ԭ��	����ʱ������ر� �� 
		fw.close();
		fr.close();

	}

}
