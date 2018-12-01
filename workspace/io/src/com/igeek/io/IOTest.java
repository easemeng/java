package com.igeek.io;

import java.io.FileWriter;
import java.io.IOException;

@SuppressWarnings("unused")
public class IOTest {

	public static void main(String[] args) throws Exception {
		
		// IO	��������� �� InputStream OutputStream...
		
		// �Ӽ����Ӳ�̶�ȡ���ݵ�Java����	����	InputStream
		
		// ��Java����������ݵ������	���	OutputStream
		
		// �ַ��� ����Ҫ��ȡ�ı���ص����ݣ� �� �ֽ���
		
		// ����� �� 	ע��	���׳��쳣 �� 	ע�⣺���Windows����ϵͳ	�ļ��ķָ���	������ \\  Ҳ������  /
		// ���Linux����ϵͳ	/
		FileWriter fw = new FileWriter("e:hello.txt",true); // ��� true ��ʾ���Ḳ��ԭ������
		
		fw.write("\r\n");  // windows�µĻ���	\r\n	Linux \n	mac \r
		fw.flush();
		fw.write("...");
		fw.flush(); // ���������ý��ڴ��е����� �� д�뵽�ļ��� �� 
		
		fw.write("...");
		fw.flush(); // ˢ�»������� �� �������ǿ�������ʹ�� �� ע�� �� ���ַ�ʽ����ļ��е�ԭ�����ݸ��滻�� �� 
		
		fw.write("ABCDEFG",2,3);
		
		char [] c = {'��','��','��','��'};
		fw.write(c);
		
		fw.write(c,0,2);
		
		fw.write(97); // 97  97��Ӧ���ַ���		ע�⣺������int���ͷ�����ʱ��ʵ��д�����	�����������Ӧ���ַ�(Unicode)
		
		fw.close(); // �ر��� ��  close �ڵ��õ�ʱ��	 ����ˢ�»������е����� �� ������д�뵽�ļ��� �� �ٹر���

	}

}
