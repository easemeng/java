package com.igeek.day05.io;

import java.io.FileWriter;

public class IOTest {

	public static void main(String[] args) throws Exception {
		//IO  ���������  ��InputStream  OutputStream ...
		
		//�Ӽ����Ӳ�̶�ȡ���ݵ�java����    ����  InputStream
		
		//��java����������ݵ������    ���  OutputStream 
		
		//�ַ��� (��Ҫ��ȡ�ı���ص�����)���ֽ���
		
		//����� ��  ע��  ���׳��쳣  ��  ע�⣺���windows ����ϵͳ �ļ��ķָ���  ����ʹ \\  Ҳ������  /
		// ��� Linux����ϵͳ   /
		FileWriter fw = new FileWriter("d:/hello.txt",true);//����true��ʾ���Ḳ��ԭ�����ݡ�
		
		fw.write("\r\n");//windows �µĻ���    \r\n      linux \n   mac  \r
		fw.flush();
		fw.write("...");
		fw.flush();//���������ý��ڴ��е����ݣ�д�뵽�ļ��С�
		
		fw.write("...");
		fw.flush();//ˢ�»���ȥ���������ǿ�������ʹ�� ��ע�⣬���ַ�ʽ����ļ��е�ԭ�����ݸ��滻����
		
		
		fw.write("ABCDEFG", 2, 3);
		
		char  [] c ={'��','��','��','��'};
		fw.write(c);
		
		fw.write(c, 0, 2);
		
		fw.write(97); // 97 97��Ӧ���ַ� ������   ע�⣺������int���ͷ�����ʱ��ʵ��д�����   �����������Ӧ���ַ�(Unicode)
		
		fw.close();//�ر��� ��  close �ڵ��õ�ʱ��  ����ˢ�»������е����� ��������д�뵽�ļ��У��ٹر�����
		
		
		
		
		
		//IO  ���������  ��InputStream  OutputStream ...
		
		//�Ӽ����Ӳ�̶�ȡ���ݵ�java����    ����  InputStream
		
		//��java����������ݵ������    ���  OutputStream 
		
		//�ַ��� (��Ҫ��ȡ�ı���ص�����)���ֽ���
		
		//����� ��  ע��  ���׳��쳣  ��  ע�⣺���windows ����ϵͳ �ļ��ķָ���  ����ʹ \\  Ҳ������  /
		// ��� Linux����ϵͳ   /
		FileWriter fw2 = new FileWriter("d:/hello.txt",true);//����true��ʾ���Ḳ��ԭ�����ݡ�
		
		fw.write("\r\n");//windows �µĻ���    \r\n      linux \n   mac  \r
		fw.flush();
		fw.write("...");
		fw.flush();//���������ý��ڴ��е����ݣ�д�뵽�ļ��С�
		
		fw.write("...");
		fw.flush();//ˢ�»���ȥ���������ǿ�������ʹ�� ��ע�⣬���ַ�ʽ����ļ��е�ԭ�����ݸ��滻����
		
		
		fw.write("ABCDEFG", 2, 3);
		
		char  [] c2 ={'��','��','��','��'};
		fw.write(c);
		
		fw.write(c, 0, 2);
		
		fw.write(97); // 97 97��Ӧ���ַ� ������   ע�⣺������int���ͷ�����ʱ��ʵ��д�����   �����������Ӧ���ַ�(Unicode)
		
		fw.close();//�ر��� ��  close �ڵ��õ�ʱ��  ����ˢ�»������е����� ��������д�뵽�ļ��У��ٹر�����
		
		
		
		
		//IO  ���������  ��InputStream  OutputStream ...
		
		//�Ӽ����Ӳ�̶�ȡ���ݵ�java����    ����  InputStream
		
		//��java����������ݵ������    ���  OutputStream 
		
		//�ַ��� (��Ҫ��ȡ�ı���ص�����)���ֽ���
		
		//����� ��  ע��  ���׳��쳣  ��  ע�⣺���windows ����ϵͳ �ļ��ķָ���  ����ʹ \\  Ҳ������  /
		// ��� Linux����ϵͳ   /
		FileWriter fw3 = new FileWriter("d:/hello.txt",true);//����true��ʾ���Ḳ��ԭ�����ݡ�
		
		fw.write("\r\n");//windows �µĻ���    \r\n      linux \n   mac  \r
		fw.flush();
		fw.write("...");
		fw.flush();//���������ý��ڴ��е����ݣ�д�뵽�ļ��С�
		
		fw.write("...");
		fw.flush();//ˢ�»���ȥ���������ǿ�������ʹ�� ��ע�⣬���ַ�ʽ����ļ��е�ԭ�����ݸ��滻����
		
		
		fw.write("ABCDEFG", 2, 3);
		
		char  [] c3 ={'��','��','��','��'};
		fw.write(c);
		
		fw.write(c, 0, 2);
		
		fw.write(97); // 97 97��Ӧ���ַ� ������   ע�⣺������int���ͷ�����ʱ��ʵ��д�����   �����������Ӧ���ַ�(Unicode)
		
		fw.close();//�ر��� ��  close �ڵ��õ�ʱ��  ����ˢ�»������е����� ��������д�뵽�ļ��У��ٹر�����
		
		
		
		
		//IO  ���������  ��InputStream  OutputStream ...
		
		//�Ӽ����Ӳ�̶�ȡ���ݵ�java����    ����  InputStream
		
		//��java����������ݵ������    ���  OutputStream 
		
		//�ַ��� (��Ҫ��ȡ�ı���ص�����)���ֽ���
		
		//����� ��  ע��  ���׳��쳣  ��  ע�⣺���windows ����ϵͳ �ļ��ķָ���  ����ʹ \\  Ҳ������  /
		// ��� Linux����ϵͳ   /
		FileWriter fw4 = new FileWriter("d:/hello.txt",true);//����true��ʾ���Ḳ��ԭ�����ݡ�
		
		fw.write("\r\n");//windows �µĻ���    \r\n      linux \n   mac  \r
		fw.flush();
		fw.write("...");
		fw.flush();//���������ý��ڴ��е����ݣ�д�뵽�ļ��С�
		
		fw.write("...");
		fw.flush();//ˢ�»���ȥ���������ǿ�������ʹ�� ��ע�⣬���ַ�ʽ����ļ��е�ԭ�����ݸ��滻����
		
		
		fw.write("ABCDEFG", 2, 3);
		
		char  [] c4 ={'��','��','��','��'};
		fw.write(c);
		
		fw.write(c, 0, 2);
		
		fw.write(97); // 97 97��Ӧ���ַ� ������   ע�⣺������int���ͷ�����ʱ��ʵ��д�����   �����������Ӧ���ַ�(Unicode)
		
		fw.close();//�ر��� ��  close �ڵ��õ�ʱ��  ����ˢ�»������е����� ��������д�뵽�ļ��У��ٹر�����
		
		
		
		
		//IO  ���������  ��InputStream  OutputStream ...
		
		//�Ӽ����Ӳ�̶�ȡ���ݵ�java����    ����  InputStream
		
		//��java����������ݵ������    ���  OutputStream 
		
		//�ַ��� (��Ҫ��ȡ�ı���ص�����)���ֽ���
		
		//����� ��  ע��  ���׳��쳣  ��  ע�⣺���windows ����ϵͳ �ļ��ķָ���  ����ʹ \\  Ҳ������  /
		// ��� Linux����ϵͳ   /
		FileWriter fw5 = new FileWriter("d:/hello.txt",true);//����true��ʾ���Ḳ��ԭ�����ݡ�
		
		fw.write("\r\n");//windows �µĻ���    \r\n      linux \n   mac  \r
		fw.flush();
		fw.write("...");
		fw.flush();//���������ý��ڴ��е����ݣ�д�뵽�ļ��С�
		
		fw.write("...");
		fw.flush();//ˢ�»���ȥ���������ǿ�������ʹ�� ��ע�⣬���ַ�ʽ����ļ��е�ԭ�����ݸ��滻����
		
		
		fw.write("ABCDEFG", 2, 3);
		
		char  [] c5 ={'��','��','��','��'};
		fw.write(c);
		
		fw.write(c, 0, 2);
		
		fw.write(97); // 97 97��Ӧ���ַ� ������   ע�⣺������int���ͷ�����ʱ��ʵ��д�����   �����������Ӧ���ַ�(Unicode)
		
		fw.close();//�ر��� ��  close �ڵ��õ�ʱ��  ����ˢ�»������е����� ��������д�뵽�ļ��У��ٹر�����
	}

}