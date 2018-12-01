package com.igeek.udp;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

public class Receive {

	@SuppressWarnings("resource")
	public static void main(String[] args) throws Exception {
		
		// ���ܷ�
		// ��Ҫ���ܴ��ݹ���������  ָ��������һ���˿ں�  ������������
		DatagramSocket ds = new DatagramSocket(63214);   // Port ...  �˿ڳ�ͻ
		// �����յ�����	�����洢���ܵ�������
		byte[] b = new byte[1024];
		// �������ݰ����� �� ���������ܵ������ݴ��
		DatagramPacket dp = new DatagramPacket(b, b.length);
		// dp ������������   ���ͷ� ���͹��������ݰ�����
		ds.receive(dp);
		// �����õ����ͷ���IP(InetAddress)����
		InetAddress address = dp.getAddress();
		// ��÷��ͷ�����Ϣ ��  ���ͷ���IP �� �����������õ�
		String hostName = address.getHostName();
		String hostAddress = address.getHostAddress();
		
		// ��ʵ���͹���������  ����dp�����н��з�װ  ��
		byte[] data = dp.getData();  // ���ܵ����͹����Ķ���������
		int length = dp.getLength();
		
		// ����  ���ֽ�����  ת�����ַ���
		String str = new String(data,0,length);
		System.out.println("���ܵ��������ǣ�" + str + " ���ͷ���IP�ǣ�" + hostAddress + " ����������" + hostName);
		
	}

}
