package com.igeek.io2;

import java.io.FileInputStream;
import java.util.Arrays;

import org.junit.Test;

public class IOTest {
	
	// transient ���ݵ� ��  ������ؼ������ε����� �� ���ܱ����л�
	// �ֽ��� ��  8 bit		InputStream  �ֽ�������  	OutputStream  �ֽ������
	
	@Test
	public void test3() throws Exception{
		// �ļ��ֽ�������
		FileInputStream fis = new FileInputStream("e:/b.txt");
		byte [] b = new byte[1024];
		int i = fis.read(b, 0, 1024);
		System.out.println(i);
		System.out.println(Arrays.toString(b));
		fis.close();
		
		// byte  -128   127
	}
	
	@Test
	public void test2() throws Exception{
		// �ļ��ֽ�������
		FileInputStream fis = new FileInputStream("e:/b.txt");
		byte [] b = new byte[5];
		int i = fis.read(b);  // i ��ʾ��ȡ��������ĳ���
		System.out.println(i);
		System.out.println(Arrays.toString(b));
		fis.close();
		
		// byte  -128   127
	}
	
	@Test
	public void test() throws Exception{
		// �ļ��ֽ�������
		FileInputStream fis = new FileInputStream("e:/b.txt");
		int i = fis.read();  // ��ȡһ���ַ��� Unicode ����
		System.out.println((char)i);
		int i2 = fis.read();
		System.out.println((char)i2);
		fis.close();
	}

}
