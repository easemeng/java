package com.igeek.io1;

import java.io.FileWriter;

public class IOTest2 {

	public static void main(String[] args) throws Exception {
		//true ��ʾ   ׷�����ݡ�
		FileWriter fw = new FileWriter("d:/b.txt",true);
		
		//����һ��char [] 
		//char [] c = {'��','��','��'};
		//fw.write(c);
		
		//fw.write(65); // 65 ������unicode���룬��ʵд����Ǳ�������Ӧ���ַ���
		
		//fw.write(c, 1, 2);
		
		fw.write("�����Ǻ�",0, 2);
		fw.write("\r\n");
		
		
		
		fw.close();//
	}

}
