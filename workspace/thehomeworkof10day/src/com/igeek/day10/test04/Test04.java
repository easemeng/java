package com.igeek.day10.test04;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;

/*
 * �����������󣬲��ô���ʵ��
	����һ��������IOUtils�������·�����������������(���²���ֻ��Դ��ı��ļ�(.txt�ļ�))��
	1.copyFile2Dir(String srcFile,String destDir)
	    ����String srcFile:Ҫ���Ƶ�Դ�ļ�
		����String destDir:���Ʋ��������ļ��Ĵ洢·��(Ŀ��·��)
		Ҫ�󣺽�srcFile�ļ����Ƶ�destDirĿ���ļ�����(���ܸı�Դ�ļ�������)
	2.copyDir2Dir(String srcDir,String destDir)
		����File srcDir:Ҫ���Ƶ�Դ�ļ���
		����File destDir:���Ʋ��������ļ��Ĵ洢·��(Ŀ��·��)
		Ҫ�󣺽�srcDir�ļ����е������ļ�(���������ļ���)���Ƶ�destDirĿ���ļ�����(���ܸı�Դ�ļ�������)

 */
public class Test04 {
	public void copyFile2Dir(String srcFile,String destDir ) {
		try{
			//�����ַ���ȡ��
			BufferedReader bufferReader = new BufferedReader(new FileReader(srcFile));
			
			//����StringBuilder��ƴ��д���ַ
			StringBuilder stringBuilder = new StringBuilder();
			
			//�жϸ����ַ�����ַ�Ƿ����ļ�/||\\��ʶ��
			if(destDir.endsWith("\\")||destDir.endsWith("/")){
				//ֱ��ƴ��
				stringBuilder.append(destDir).append(srcFile);			
			}else{
				//���һ���ַ���ʶ
				stringBuilder.append(destDir).append("/").append(srcFile);
				
			}
			//�����ַ�д����
			BufferedWriter bufferedwriter = new BufferedWriter(new FileWriter(stringBuilder.toString()));
			
			//�����ַ�����
			char[] srcDataArray = new char[1024*1024];
			
			//�����ַ�����ȡ����
			String len;
			
			//ѭ����ȡ
			while((len = bufferReader.readLine())!=null){
				
				//���ַ���ת��Ϊ�ַ�����
				srcDataArray = len.toCharArray();
				
				//д��
				bufferedwriter.write(srcDataArray);
				
				//����
				bufferedwriter.newLine();
			}
			//����
			bufferReader.close();
			bufferedwriter.close();
		}catch(Exception e){
			//TODO Auto - generated catch block
			e.printStackTrace();
		}
	}
	public static void main(String[] args) {
		//�����ļ���������
		Test04 ioUtils = new Test04();
		ioUtils.copyFile2Dir("Student.txt", "name1.txt");
		
	}
}
