package com.igeek.day12.io;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;

import org.junit.Test;

public class IOTest3 {

	@Test
	public void test2() throws Exception {
		FileReader fr = new FileReader("e:/b.txt");
		// FileWriter fw = new FileWriter("e:/buffer(1).txt");
		// ���뻺����
		BufferedReader br = new BufferedReader(fr);
		// ���������
		// BufferedWriter bw = new BufferedWriter(fw);

		String gm = br.readLine();  // readLine()  ��һ������
		String hd = br.readLine();
		System.out.println(gm);
		System.out.println(hd);
		//
		br.close();
		fr.close();
	}

	@Test
	public void test() throws Exception {
		// ����������Ҫ����ԭʼ�������� ��
		// �ַ�������
		// FileReader fr = new FileReader("e:/b.txt");
		FileWriter fw = new FileWriter("e:/buffer(1).txt");
		// ���뻺����
		// BufferedReader br = new BufferedReader(fr);
		// ���������
		BufferedWriter bw = new BufferedWriter(fw);
		bw.write("����");
		bw.newLine();
		bw.write("����");
		// bw.flush();

		// �ӿ��д�ٶ� �� ���������˻��з��� ������

		bw.close();
		fw.close();
	}

}
