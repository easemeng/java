package com.igeek.day04.sb;

public class StringBuilderTest3 {

	public static void main(String[] args) {
		
		long startTime = System.currentTimeMillis();
		StringBuilder sb = new StringBuilder("");
		for(int i = 0;i<50000;i++){
			sb.append(i);
		}
		long resultTime = System.currentTimeMillis()-startTime;
		System.out.println(resultTime);
		//5 5200
		
		StringBuffer sb2 =new StringBuffer("");
		
		//StringBuilder 线程不安全的 。  单线程的情况下。 执行效率要比StringBuffer高一些。
		//StringBuffer 线程安全的。  多线程的情况下使用 。
				
		//程序    
		//进程
		//线程 可以同时 清理垃圾，同时杀毒，同时硬盘检查。
		
		
		
		
		long startTime2 = System.currentTimeMillis();
		StringBuilder sb3 = new StringBuilder("");
		for(int i = 0;i<50000;i++){
			sb3.append(i);
		}
		long resultTime2 = System.currentTimeMillis()-startTime2;
		System.out.println(resultTime2);
		
		StringBuffer sb4 =new StringBuffer("");
		
		//StringBuilder 线程不安全的 。  单线程的情况下。 执行效率要比StringBuffer高一些。
		//StringBuffer 线程安全的。  多线程的情况下使用 。
				
		//程序    
		//进程
		//线程 可以同时 清理垃圾，同时杀毒，同时硬盘检查。
		
		
		
		
		long startTime3= System.currentTimeMillis();
		StringBuilder sb0 = new StringBuilder("");
		for(int i = 0;i<50000;i++){
			sb0.append(i);
		}
		long resultTime3 = System.currentTimeMillis()-startTime3;
		System.out.println(resultTime3);
		
		StringBuffer sb00 =new StringBuffer("");
		
		//StringBuilder 线程不安全的 。  单线程的情况下。 执行效率要比StringBuffer高一些。
		//StringBuffer 线程安全的。  多线程的情况下使用 。
				
		//程序    
		//进程
		//线程 可以同时 清理垃圾，同时杀毒，同时硬盘检查。
		
		
		
		
		long startTime4 = System.currentTimeMillis();
		StringBuilder sb55 = new StringBuilder("");
		for(int i = 0;i<50000;i++){
			sb55.append(i);
		}
		long resultTime4 = System.currentTimeMillis()-startTime4;
		System.out.println(resultTime4);
		
		StringBuffer sb66 =new StringBuffer("");
		
		//StringBuilder 线程不安全的 。  单线程的情况下。 执行效率要比StringBuffer高一些。
		//StringBuffer 线程安全的。  多线程的情况下使用 。
				
		//程序    
		//进程
		//线程 可以同时 清理垃圾，同时杀毒，同时硬盘检查。
		
		
		
		
		long startTime5 = System.currentTimeMillis();
		StringBuilder sb88 = new StringBuilder("");
		for(int i = 0;i<50000;i++){
			sb.append(i);
		}
		long resultTime5 = System.currentTimeMillis()-startTime5;
		System.out.println(resultTime5);
		
		StringBuffer sb99 =new StringBuffer("");
		
		//StringBuilder 线程不安全的 。  单线程的情况下。 执行效率要比StringBuffer高一些。
		//StringBuffer 线程安全的。  多线程的情况下使用 。
				
		//程序    
		//进程
		//线程 可以同时 清理垃圾，同时杀毒，同时硬盘检查。
	}

}
