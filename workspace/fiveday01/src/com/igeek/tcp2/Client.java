package com.igeek.tcp2;

import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.util.Scanner;

public class Client {

	// ����  �ͻ��� �� �����  ѭ�����ͺͽ�����Ϣ   ʹ��TCP ��  ֱ���ͻ�������return����  ����˷���bye bye
	@SuppressWarnings("resource")
	public static void main(String[] args) throws Exception {
		
		Socket socket = new Socket("192.168.18.45",999);
		// �����������
		OutputStream out = socket.getOutputStream();
		while(true){
			Scanner scanner = new Scanner(System.in);
			System.out.println("������Ҫ���͸������������ݣ�");
			String str = scanner.nextLine();
			if(!str.equals("return")){
				out.write(str.getBytes());
				continue;
			}
			socket.shutdownOutput();  // ���߷����� ���ٷ���������
			// out.close();  // ��Ҫ����ȥ�ر�  ��  �����Ļ�  �ͻ����޷����ܵ��������ķ�������
			break;
		}
		
		// ����InputStream ����       �������ܷ��������ص����ݡ�
		InputStream in = socket.getInputStream();
		int read = 0;
		while((read = in.read()) != -1){
			System.out.println((char)read);
		}
		
		// Connection Reset...
		socket.close();

	}

}
