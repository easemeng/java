package com.igeek.tcp;

import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {

	@SuppressWarnings("resource")
	public static void main(String[] args) throws Exception {
		
		// �˿ں�   Ӧ���ɷ������ָ��
		// �����   ��Ҫ����һ��ServerSocket ����
		ServerSocket ss = new ServerSocket(5555);
		// ���ܿͻ��˷��͹��������� ��  ����Ҫ�õ�һ��Socket����
		Socket s = ss.accept();  // ���÷���˵Ľ��ܷ��� ��  �õ�һ��Socket����
		InputStream inputStream = s.getInputStream();
		int read = inputStream.read();
		System.out.println(read);
		System.out.println((char)read);
		
		// �����   �����Ի�д����
		OutputStream serverOutput = s.getOutputStream();
		serverOutput.write(98);

	}

}
