package com.igeek.socket;

import java.net.InetAddress;

public class TestInetAddress {

	public static void main(String[] args) throws Exception {
		
		// InetAddress 类  表示IP
		// InetAddress localHost = InetAddress.getLocalHost();
		// 直接打印对象  ，  会输出当前你要获得的主机的 名称  以及  IP 地址
		// System.out.println(localHost);
		// stu-199
		// String hostName = localHost.getHostName();
		// String hostAddress = localHost.getHostAddress();
		
		// DNS   Host...   		// http://www.baidu.com
		
		// 获取其他主机的IP对象
		InetAddress inetAddress = InetAddress.getByName("stu-199");
		System.out.println(inetAddress);
		
		InetAddress inetAddress2 = InetAddress.getByName("www.baidu.com");
		System.out.println(inetAddress2);

	}

}
