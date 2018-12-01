package com.igeek.tcp3;

import java.io.FileInputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

public class Client {

	@SuppressWarnings("resource")
	public static void main(String[] args) throws Exception {
		
		Socket socket = new Socket("192.168.18.30", 28888);
		
		// ������������� ��  �������д������
		OutputStream outputStream = socket.getOutputStream();
		
		// ��ʲô�ļ�����
		FileInputStream fis = new FileInputStream("ASCII���������.doc");
		
		// ��ȡ����
		int read = 0;
		while((read = fis.read()) != -1){
			outputStream.write(read);
		}
		
		socket.shutdownOutput();  // ���ٴ������ݡ�
		
		// ���Խ��ܷ������ķ���ֵ
		InputStream in = socket.getInputStream();
		byte[] b = new byte[1024];
		int len = 0;
		while((len = in.read(b)) != -1){
			String returnValue = new String(b,0,len);
			System.out.println(returnValue);
		}
		
		socket.close();

	}

}
