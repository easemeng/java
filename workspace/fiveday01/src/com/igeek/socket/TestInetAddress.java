package com.igeek.socket;

import java.net.InetAddress;

public class TestInetAddress {

	public static void main(String[] args) throws Exception {
		
		// InetAddress ��  ��ʾIP
		// InetAddress localHost = InetAddress.getLocalHost();
		// ֱ�Ӵ�ӡ����  ��  �������ǰ��Ҫ��õ������� ����  �Լ�  IP ��ַ
		// System.out.println(localHost);
		// stu-199
		// String hostName = localHost.getHostName();
		// String hostAddress = localHost.getHostAddress();
		
		// DNS   Host...   		// http://www.baidu.com
		
		// ��ȡ����������IP����
		InetAddress inetAddress = InetAddress.getByName("stu-199");
		System.out.println(inetAddress);
		
		InetAddress inetAddress2 = InetAddress.getByName("www.baidu.com");
		System.out.println(inetAddress2);

	}

}
