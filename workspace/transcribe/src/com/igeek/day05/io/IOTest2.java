package com.igeek.day05.io;

import java.io.FileReader;

public class IOTest2 {

	public static void main(String[] args) throws Exception {

		//�� ��ָ��·����ʱ��   ���Ե�ǰ��������Ŀ�ĸ�·��Ϊ׼
		FileReader fr = new FileReader("hello4.txt");
		
		/*int i = fr.read();//h
		System.out.println(i);//h  unicode ���롣104
		System.out.println((char)i);
		
		int i2 = fr.read();//e
		System.out.println(i2);
		System.out.println((char)i2);
		
		int i3 = fr.read(); //��read ����ֵΪ-1 ֤��û�����ݡ�
		System.out.println(i3);*/
		
		int ch = 0;//����һ������int �������ܶ�ȡ������������Ӧ��Unicode���롣
		while((ch=fr.read())!=-1){
			System.out.println((char)ch);
		}
		
		
		
		
		//�� ��ָ��·����ʱ��   ���Ե�ǰ��������Ŀ�ĸ�·��Ϊ׼
		FileReader fr2 = new FileReader("hello4.txt");
		
		/*int i = fr.read();//h
		System.out.println(i);//h  unicode ���롣104
		System.out.println((char)i);
		
		int i2 = fr.read();//e
		System.out.println(i2);
		System.out.println((char)i2);
		
		int i3 = fr.read(); //��read ����ֵΪ-1 ֤��û�����ݡ�
		System.out.println(i3);*/
		
		int ch2 = 0;//����һ������int �������ܶ�ȡ������������Ӧ��Unicode���롣
		while((ch2=fr2.read())!=-1){
			System.out.println((char)ch2);
		}
		
		
		
		
		//�� ��ָ��·����ʱ��   ���Ե�ǰ��������Ŀ�ĸ�·��Ϊ׼
		FileReader fr3 = new FileReader("hello4.txt");
		
		/*int i = fr.read();//h
		System.out.println(i);//h  unicode ���롣104
		System.out.println((char)i);
		
		int i2 = fr.read();//e
		System.out.println(i2);
		System.out.println((char)i2);
		
		int i3 = fr.read(); //��read ����ֵΪ-1 ֤��û�����ݡ�
		System.out.println(i3);*/
		
		int ch3 = 0;//����һ������int �������ܶ�ȡ������������Ӧ��Unicode���롣
		while((ch3=fr.read())!=-1){
			System.out.println((char)ch3);
		}
		
		
		
		
		//�� ��ָ��·����ʱ��   ���Ե�ǰ��������Ŀ�ĸ�·��Ϊ׼
		FileReader fr4 = new FileReader("hello4.txt");
		
		/*int i = fr.read();//h
		System.out.println(i);//h  unicode ���롣104
		System.out.println((char)i);
		
		int i2 = fr.read();//e
		System.out.println(i2);
		System.out.println((char)i2);
		
		int i3 = fr.read(); //��read ����ֵΪ-1 ֤��û�����ݡ�
		System.out.println(i3);*/
		
		int ch4 = 0;//����һ������int �������ܶ�ȡ������������Ӧ��Unicode���롣
		while((ch4=fr.read())!=-1){
			System.out.println((char)ch4);
		}
		
		
		
		
		//�� ��ָ��·����ʱ��   ���Ե�ǰ��������Ŀ�ĸ�·��Ϊ׼
		FileReader fr5 = new FileReader("hello4.txt");
		
		/*int i = fr.read();//h
		System.out.println(i);//h  unicode ���롣104
		System.out.println((char)i);
		
		int i2 = fr.read();//e
		System.out.println(i2);
		System.out.println((char)i2);
		
		int i3 = fr.read(); //��read ����ֵΪ-1 ֤��û�����ݡ�
		System.out.println(i3);*/
		
		int ch5 = 0;//����һ������int �������ܶ�ȡ������������Ӧ��Unicode���롣
		while((ch5=fr.read())!=-1){
			System.out.println((char)ch5);
		}
	}

}
