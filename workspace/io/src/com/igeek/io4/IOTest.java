package com.igeek.io4;

import java.io.FileWriter;
import java.io.IOException;

public class IOTest {

	public static void main(String[] args) throws Exception {
		// IO ���������  InputStream  OutputStream ...
		// �Ӽ����Ӳ�̶�ȡ���ݵ�Java����	����	InputStream
		// ��Java����������ݵ������	���	OutputStream
		// �ַ�������Ҫ��ȡ�ı���ص����ݣ� �ֽ���
		// ����� �� ע��  ���׳��쳣 �� ע�� ���windows ����ϵͳ �ļ��ķָ���  ����ʹ \\  Ҳ������  /
		// ���Linux����ϵͳ	/
		
		FileWriter fw = new FileWriter("d:/hello.txt",true);//���true��ʾ���Ḳ��ԭ�����ݡ�
		
		fw.write("\r\n");//windows �µĻ���    \r\n      linux \n   mac  \r
		fw.flush();
		fw.write("...");
		fw.flush();  // ���������ý��ڴ��е����ݣ�д�뵽�ļ��С�
		
		fw.write("...");
		fw.flush();  // ˢ�»������� �� �������ǿ�������ʹ�� �� ע�� ���ַ�ʽ����ļ��е�ԭ�����ݸ��滻�� �� 
		
		fw.write("ABCDEFG", 2, 3);
		
		char  [] c ={'��','��','��','��'};
		fw.write(c);
		
		fw.write(c, 0, 2);
		
		fw.write(97); // ע��  ������int���ͷ�����ʱ�� �� ʵ��д�����  �����������Ӧ���ַ� �� 
		
		fw.close(); // �ر��� �� close �ڵ��õ�ʱ��  ����ˢ�»������е����� �� ������д�뵽�ļ��� �� �ڹر���

	}

}
