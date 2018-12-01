package com.igeek.io1;

import java.io.FileReader;

public class IOTest4_2 {

	@SuppressWarnings("resource")
	public static void main(String[] args) throws Exception {
		FileReader fr = new FileReader("d:/b.txt");
		int r =0;
		char [] c = new char [1024];//1024 1024ÕûÊý±¶.  1KB  1MB  
		while((r=fr.read(c))!=-1){
			String result = new String(c,0,r);
			System.out.println(result);
		}
	}

}
