package com.igeek.io1;

import java.io.FileReader;
import java.io.FileWriter;

public class IOTest5_2 {

	public static void main(String[] args) throws Exception {
		//�����������������
				FileReader fr = new FileReader("haha.txt");
				FileWriter fw = new FileWriter("hehe2.txt");
				
				int c = 0;
				char [] char1 = new char [1024];
				while((c=fr.read(char1))!=-1){
					fw.write(char1, 0, c);
					fw.flush();
				}
				
				//����ʹ�����ر�
				fw.close();
				fr.close();
	}

}
