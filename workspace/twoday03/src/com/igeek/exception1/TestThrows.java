package com.igeek.exception1;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;


/**
 * 
 * �쳣���������ַ�ʽ��
 * 	1.��
 *  2.����
 * 
 * @author student
 *
 */
public class TestThrows {
	
	public static void main(String[] args){
		
		// ע�⣺ �ڴ����쳣��ʱ�� �� �� �� 
		// ����֮�� �� ˭��˭����
		
		test();
		
	}
	
	@SuppressWarnings({ "unused", "resource" })
	public static void test() {
		// try һ��ֻ�������ܲ����쳣�Ĵ��� ��
		int a = 0;
		try {
			a = 10;
			FileWriter fw = new FileWriter("e:/a.txt");
			File file = new File("e:/aaa");
		} catch (FileNotFoundException e) {
			e.printStackTrace();// �����...
		} catch (IOException e) {
			e.printStackTrace();// �����..
		}
		System.out.println(a);
	}

}