package com.igeek.day12.io2;

import java.io.FileOutputStream;

import org.junit.Test;

public class IOTest2 {
	
	@Test
	public void test3() throws Exception{
		FileOutputStream fos = new FileOutputStream("e:/test1.txt");
		byte [] b = {-76, -13, -61, -64, -67, -83, -70, -2};
		fos.write(b, 2, 4);  // �� b ������ �� д�����ݵ� text1.txt �ļ��� �� ���������±�Ϊ2��λ�ÿ�ʼд��д4λ
		fos.flush();
		fos.close();
	}
	
	// �ֽ������
	@Test
	public void test2() throws Exception{
		FileOutputStream fos = new FileOutputStream("e:/test1.txt");
		byte [] b = {-76, -13, -61, -64, -67, -83, -70, -2};
		fos.write(b);
		fos.flush();
		fos.close();
	}
	
	// �ֽ������
	@Test
	public void test() throws Exception{
		FileOutputStream fos = new FileOutputStream("e:/test1.txt");
		fos.write(97);  // д��Unicode ����  ��  ��д�������������Ӧ���ַ�
		fos.flush();
		fos.close();
	}

}
