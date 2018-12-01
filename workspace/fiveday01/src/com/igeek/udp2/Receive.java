package com.igeek.udp2;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

public class Receive {

	@SuppressWarnings("resource")
	public static void main(String[] args) throws Exception {
		
		DatagramSocket ds = new DatagramSocket(63214);
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
		}

	}

}
