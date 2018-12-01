package com.igeek.tcp2;

import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class NewTest {

	public static void main(String[] args) throws Exception {

		sercers();
		clients();

	}

	@SuppressWarnings("resource")
	public static void sercers() throws Exception {
		ServerSocket ss = new ServerSocket(46789);
		Socket socket = ss.accept();
		InputStream in = socket.getInputStream();
		byte[] b = new byte[1024];
		int length = 0;
		while (((length = in.read(b)) != -1)) {
			String data = new String(b, 0, length);
			System.out.println(data);
		}

		//
		OutputStream out = socket.getOutputStream();
		String content = "bye!bye!";
		out.write(content.getBytes());
	}

	@SuppressWarnings("resource")
	public static void clients() throws Exception {
		Socket socket = new Socket("192.168.18.45", 46788);
		// �����������
		OutputStream out = socket.getOutputStream();
		while (true) {
			Scanner scanner = new Scanner(System.in);
			System.out.println("������Ҫ���͸������������ݣ�");
			String str = scanner.nextLine();
			if (!str.equals("return")) {
				out.write(str.getBytes());
				continue;
			}
			socket.shutdownOutput(); // ���߷����� ���ٷ���������
			// out.close(); // ��Ҫ����ȥ�ر� �� �����Ļ� �ͻ����޷����ܵ��������ķ�������
			break;
		}

		// ����InputStream ���� �������ܷ��������ص����ݡ�
		InputStream in = socket.getInputStream();
		int read = 0;
		while ((read = in.read()) != -1) {
			System.out.println((char) read);
		}
	}

}
