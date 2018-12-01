package com.igeek.udp2;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.util.Scanner;

public class Send {

	@SuppressWarnings("resource")
	public static void main(String[] args) throws Exception {
		
		// 循环发送数据
		DatagramSocket ds = new DatagramSocket();
		// 循环写数据
		while(true){
			Scanner scanner = new Scanner(System.in);
			System.out.println("请输入要发送的内容");
			String dataStr = scanner.nextLine();
			byte[] data = dataStr.getBytes();
			int port = 63214;
			InetAddress address = InetAddress.getByName("192.168.18.45");
			DatagramPacket dp = new DatagramPacket(data, data.length, address, port);
			ds.send(dp);
		}

	}

}
