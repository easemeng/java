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
		// 创建输出对象
		OutputStream out = socket.getOutputStream();
		while (true) {
			Scanner scanner = new Scanner(System.in);
			System.out.println("请输入要发送给服务器的数据：");
			String str = scanner.nextLine();
			if (!str.equals("return")) {
				out.write(str.getBytes());
				continue;
			}
			socket.shutdownOutput(); // 告诉服务器 不再发送数据了
			// out.close(); // 不要这样去关闭 ， 这样的话 客户端无法接受到服务器的返回数据
			break;
		}

		// 创建InputStream 对象 用来接受服务器返回的数据。
		InputStream in = socket.getInputStream();
		int read = 0;
		while ((read = in.read()) != -1) {
			System.out.println((char) read);
		}
	}

}
