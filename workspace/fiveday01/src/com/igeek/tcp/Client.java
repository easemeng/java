package com.igeek.tcp;

import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

// �ͻ���
public class Client {

	public static void main(String[] args) throws Exception {
		
		// �ͻ���   �����
		
		// TCPЭ�顣    UDPЭ����Ҫ���� DatagramSocket ����
		// TCP Э��ֱ���� Socket ����
		Socket s = new Socket("192.168.18.45", 5555);
		// ConnectException �����쳣
		// ����IO����������
		// ʹ��IO�����ֽ�������
		OutputStream outputStream = s.getOutputStream();
		outputStream.write(97);
		// ��������������   �������ܷ������������������������
		InputStream clientStream = s.getInputStream();
		int read = clientStream.read();
		System.out.println(read);
		System.out.println((char)read);
		s.close();

	}

}
