package com.igeek.io2;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.junit.Test;

public class IOTest3 {
	
	@Test
	public void test4(){
		
		FileInputStream fis = null;
		FileOutputStream fos = null;
		BufferedInputStream bis = null;
		BufferedOutputStream bos = null;
		
		try {
			fis = new FileInputStream("f:/Java�����﷨1.pptx");
			fos = new FileOutputStream("e:/Java�����﷨1.pptx");
			bis = new BufferedInputStream(fis);
			bos = new BufferedOutputStream(fos);
			byte [] b = new byte[1024];
			int a = 0;
			while((a = bis.read(b)) != -1){
				bos.write(b, 0, a);
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}finally{
			if(bos != null){
				try {
					bos.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
			if(bis != null){
				try {
					bis.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
			if(fos != null){
				try {
					fos.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
			if(fis != null){
				try {
					fis.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
	}
	
	// �Ƽ�ʹ������д�� �� 
	@Test
	public void test3() throws Exception{
		FileInputStream fis = new FileInputStream("e:\\b.txt");
		FileOutputStream fos = new FileOutputStream("e:/q(3).txt");
		
		byte [] b = new byte[1027 * 5];  // 5kb  0
		int i = -1;
		// 7
		while((i = fis.read(b)) != -1){
			fos.write(b, 0, i);  //
		}
		
		fos.close();
		fis.close();
	}
	
	@Test
	public void test2() throws Exception {
		FileInputStream fis = new FileInputStream("e:\\b.txt");
		FileOutputStream fos = new FileOutputStream("e:/q(2).txt");
		
		byte [] b = new byte[1024 * 5];  // 5kb  0
		int i = -1;
		while((i = fis.read(b)) != -1){
			// ���Ƽ�ʹ�� �� ��������ж���Ŀո�ȫ��д�뵽�ļ��� �� 
			fos.write(b);
		}
		fis.close();
		fos.close();
	}

	@Test
	public void test() throws Exception {
		// �ַ��� �� ֻ����ı����͵��ļ����в���
		// �ֽ��� �� ���еĶ����� ��
		FileInputStream fis = new FileInputStream("e:\\b.txt");
		FileOutputStream fos = new FileOutputStream("e:/q.txt");
		
		int i = 0;
		while((i = fis.read()) != -1){
			fos.write(i);
		}
		fis.close();
		fos.close();
	}

}
