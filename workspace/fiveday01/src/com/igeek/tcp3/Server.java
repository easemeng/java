package com.igeek.tcp3;

import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {

	@SuppressWarnings("resource")
	public static void main(String[] args) throws Exception {

		// ���������ܿͻ��˷��͹������ļ� ���洢
		ServerSocket ss = new ServerSocket(28888);
		// �������ݣ�  Ȼ��洢����
		Socket socket = ss.accept();
		InputStream inputStream = socket.getInputStream();
		FileOutputStream fos = new FileOutputStream("ASCII���������(Copy).doc");
		int read = 0;
		while((read = inputStream.read()) != -1){
			fos.write(read);
		}
		
		// ��������   ������  �Ƿ�ɹ�
		OutputStream outputStream = socket.getOutputStream();
		outputStream.write("�ϴ��ɹ�".getBytes());
		
		ss.close();

	}

}
