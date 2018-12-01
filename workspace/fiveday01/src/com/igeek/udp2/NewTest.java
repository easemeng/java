package com.igeek.udp2;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.util.Scanner;

public class NewTest {

	public static void main(String[] args) throws Exception {
		
		receives();
		
	}
	
	@SuppressWarnings("resource")
	public static void receives() throws Exception{
		
		DatagramSocket ds = new DatagramSocket(63214);
		// 循环写数据
		while(true){
			byte[] b = new byte[1024];
			DatagramPacket dp = new DatagramPacket(b,b.length);
			ds.receive(dp);
			InetAddress address = dp.getAddress();
			
			String hostName = address.getHostName();
			String hostAddress = address.getHostAddress();
			
			byte[] data = dp.getData();
			int length = dp.getLength();
			
			String str = new String(data,0,length);
			System.out.println("接受到的数据是：" + str + " 发送方的IP是：" + hostAddress + " 主机名称是" + hostName);
			sends();
		}
	}
	
	@SuppressWarnings("resource")
	public static void sends() throws Exception{
		DatagramSocket ds = new DatagramSocket();
		// 循环写数据
		while(true){
			Scanner scanner = new Scanner(System.in);
			System.out.println("请输入要发送的内容");
			String dataStr = scanner.nextLine();
			byte[] data = dataStr.getBytes();
			int port = 63215;
			InetAddress address = InetAddress.getByName("192.168.18.45");
			DatagramPacket dp = new DatagramPacket(data, data.length, address, port);
			ds.send(dp);
			break;
		}
	}

}
