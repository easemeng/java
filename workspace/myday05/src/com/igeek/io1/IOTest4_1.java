package com.igeek.io1;

import java.io.FileReader;

public class IOTest4_1 {

	@SuppressWarnings("resource")
	public static void main(String[] args) throws Exception {
		FileReader fr = new FileReader("d:/b.txt");
		int r =0;
		while((r=fr.read())!=-1){
			System.out.println((char)r);
		}
	}

}
