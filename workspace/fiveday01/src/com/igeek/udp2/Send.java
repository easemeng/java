package com.igeek.udp2;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.util.Scanner;

public class Send {

	@SuppressWarnings("resource")
	public static void main(String[] args) throws Exception {
		
		// ѭ����������
		DatagramSocket ds = new DatagramSocket();
		// ѭ��д����
		while(true){
			Scanner scanner = new Scanner(System.in);
			System.out.println("������Ҫ���͵�����");
			String dataStr = scanner.nextLine();
			byte[] data = dataStr.getBytes();
			int port = 63214;
			InetAddress address = InetAddress.getByName("192.168.18.45");
			DatagramPacket dp = new DatagramPacket(data, data.length, address, port);
			ds.send(dp);
		}

	}

}
