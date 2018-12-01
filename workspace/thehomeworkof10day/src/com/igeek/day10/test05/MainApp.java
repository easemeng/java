package com.igeek.day10.test05;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.LinkedHashSet;
import java.util.Scanner;

/**
 * �����������󣬲��ô���ʵ��
	1.��Ŀ��Ŀ¼�½����ļ��� user.txt���ļ��д���û����͵�¼���룬��ʽ���û���������,�磺aaa,123��
	2. user.txt�ļ��г�ʼ��ŵ��û���Ϣ�����£�
		jack,123
		rose,123
		tom,123
	3.Ҫ��������¹��ܣ�
	  ��������ʱ������̨��ʾ�û�����ע����û��������룻
	   ��֤����¼����û�����user.txt����ע����û����Ƿ��ظ���
	   �ǣ�����̨��ʾ���û����Ѵ���
	   �񣺽�����¼����û���������д��user.txt�ļ������ڿ���̨��ʾ��ע��ɹ���

 */
public class MainApp {
	@SuppressWarnings("resource")
	public static void main(String[] args)throws IOException {
		BufferedReader bf = new BufferedReader(new FileReader("user.txt"));
		String line = null;
		
		LinkedHashSet<String> hash = new LinkedHashSet<>();
		while((line = bf.readLine())!=null){
			String[] spilt = line.split(",");//ͨ��������ʽ���ݹ����и�
			hash.add(spilt[0]);//�и���spilt[0]���û���������set����
		}
		Scanner sc = new Scanner(System.in);
		String inputStr = sc.nextLine();//�û������ַ���
		String spiltInputStr[] = inputStr.split(",");
		if(hash.add(spiltInputStr[0]) == false)//����HashSet���ϲ��ܴ洢Ԫ�أ��������ظ���Ԫ��ʱ����false���������Ϊ�������ظ�Ԫ��
		{
			System.out.println("�û�������");
		}
		else{ //����������û���û���ʱ�������ַ�������������Ϊ��д
			BufferedWriter bw = new BufferedWriter(new FileWriter("user.txt"));					
			bw.newLine();//����
			bw.write(inputStr);
			System.out.println("ע��ɹ�");
			bw.close();
		}
		bf.close();
	}

}
