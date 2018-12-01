package com.igeek.udp;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

public class Send {

	public static void main(String[] args) throws Exception {
		
		// 发送方
		
		// DatagramSocket 对象	想要在java中通过UDP协议去收发数据  必须创建DatagramSocket类的对象
		// 创建实现UDP协议的对象 		0-65535
		DatagramSocket ds = new DatagramSocket();
		
		// 要发送的数据
		String data = "中午吃啥";
		
		// 将数据装换成二进制
		byte[] b = data.getBytes();
		
		InetAddress address = InetAddress.getByName("192.168.18.45");
		
		int port = 63214;
		
		// 建立数据包 。  DatagramPacket 对象来表示数据包	DatagramPacket 用来表示数据包
		// 参数   1. 你要传递的数据	2.传递的数据长度	3.传递给谁 ， 接收方的IP，InetAddress对象		4.指定那个端口号
		DatagramPacket dp = new DatagramPacket(b,b.length,address,port);
		
		ds.send(dp);
		
		ds.close();

	}

}
