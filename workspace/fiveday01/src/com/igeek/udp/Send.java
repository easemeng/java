package com.igeek.udp;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

public class Send {

	public static void main(String[] args) throws Exception {
		
		// ���ͷ�
		
		// DatagramSocket ����	��Ҫ��java��ͨ��UDPЭ��ȥ�շ�����  ���봴��DatagramSocket��Ķ���
		// ����ʵ��UDPЭ��Ķ��� 		0-65535
		DatagramSocket ds = new DatagramSocket();
		
		// Ҫ���͵�����
		String data = "�����ɶ";
		
		// ������װ���ɶ�����
		byte[] b = data.getBytes();
		
		InetAddress address = InetAddress.getByName("192.168.18.45");
		
		int port = 63214;
		
		// �������ݰ� ��  DatagramPacket ��������ʾ���ݰ�	DatagramPacket ������ʾ���ݰ�
		// ����   1. ��Ҫ���ݵ�����	2.���ݵ����ݳ���	3.���ݸ�˭ �� ���շ���IP��InetAddress����		4.ָ���Ǹ��˿ں�
		DatagramPacket dp = new DatagramPacket(b,b.length,address,port);
		
		ds.send(dp);
		
		ds.close();

	}

}
