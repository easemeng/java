package com.igeek.io1;

import java.io.FileReader;

public class IOTest3 {

	@SuppressWarnings("resource")
	public static void main(String[] args) throws Exception {
		//�ļ������� ��  ����Դ������   ��ȡ��java���� ��
		FileReader fr = new FileReader("d:/b.txt");
		//b.txt ��ʾ����Ŀ�ĸ�·���²��� ����d:/b.txt ��ʾ�������Ӳ���в��ҡ�
		
		int i = fr.read();//ÿ��������read������ʾ��ȡһ���ַ� ��  
		//read()�����ķ���ֵ  ��������ַ���unicode���롣
		
		//System.out.println(i);
		
		System.out.println((char)i);
		
		int i2 = fr.read();
		//System.out.println(i2);
		System.out.println((char)i2);
		
		int i3 = fr.read();
		//System.out.println(i3);
		System.out.println((char)i3);
		
		//��read()����-1��ʱ�򣬱�ʾû�ж�ȡ���κ����ݡ�
		char [] c = new char [5];//"\u0000"   " " 
		//fr.read(c); //����read(char [] cbuf) ������ʱ������ĳ����Ƕ��ٸ� ������д���ٸ��ַ���
		// ������read()������ʱ�򣬻�����ϴζ�ȡ��λ�ã������������
		
		fr.read(c, 0, 3);// ��һ������ c  ��ʾҪ�����ݵ����� ��   �ڶ�������  ��ʾ������ĵڼ����±꿪ʼ��   ���������� ��ʾҪд����ٸ���
		
		for (char sb : c) {
			System.out.println(sb);
		}
	}

}
