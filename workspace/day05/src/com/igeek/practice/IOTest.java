package com.igeek.practice;

import java.io.FileWriter;

public class IOTest {

	public static void main(String[] args) throws Exception {
		// IO ���������  �� InputStream  OutputStream ...
		
		// �Ӽ����Ӳ�̶�ȡ���ݵ�Java����   ����  InputStream
		
		// ��Java����������ݵ������  ���   OutputStream
		
		// �ַ���  ����Ҫ��ȡ�ı���ص����ݣ��� �ֽ���
		
		// ����� �� ע��  ���׳��쳣  ��  ע�⣺���windows ����ϵͳ  �ļ��ķָ��������� \\ Ҳ������ / 
		// ���Linux����ϵͳ	/
		
		FileWriter fw = new FileWriter("e:/0707.txt",true);
		
		fw.write("\r\n");
		fw.flush();
		
		fw.write("LOVE");
		fw.flush();
		
		fw.write("\r\n");  // windows �µĻ���		\r\n		Linux \r		mac \n
		fw.flush();
		
		fw.write("QMY");
		fw.flush();
		
		fw.write("\r\n");
		fw.flush();
		
		fw.write("forever");
		fw.flush();     // ˢ�»������� �� �������ǿ�������ʹ�� �� ע�⣬���ַ�������ļ��е�ԭ�����ݸ��滻��
	
		fw.write("\r\n");
		fw.flush();
		
		fw.write("ASDFGHJKL", 3, 3);
		
		char[] c = {'��','��','��','��'};
		fw.write(c);
		
		fw.write(c, 2, 2);
		
		fw.write(97);  // 97 97����Ӧ���ַ� ������		ע�⣺������int���ͷ�����ʱ��  ʵ��д�����	�����������Ӧ���ַ�(Unicode)
		
		fw.close();  // �ر��� ��  close �ڵ��õ�ʱ��  ����ˢ�»������е����� �� ������д�뵽�ļ��� �� �ٹر���

	}

}
