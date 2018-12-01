package com.igeek.file1;

import java.io.File;

public class FileTest2 {

	public static void main(String[] args) throws Exception {
		
		File file = new File("a");
		System.out.println(file.delete());

	}

}
