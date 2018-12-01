package com.igeek.day10;

import java.io.FileWriter;
import java.util.Scanner;

public class Test01 {

	@SuppressWarnings("resource")
	public static void main(String[] args) throws Exception {

		Scanner scanner = new Scanner(System.in);
		FileWriter fw = new FileWriter("Info.txt",true);
		while (true) {
			System.out.println("请输入需要写入的内容：");
			if (scanner.nextLine().equals("886")) {
				fw.close();
				System.exit(0);
			} else {
				fw.write(scanner.nextLine());
				fw.write("\r\n");
				fw.flush();
			}
		/*String a = scanner.nextLine();
		fw.write(a);
		fw.flush();
		if(a.equals("886")){
			fw.close();
			System.exit(0);
		}*/
		}
	}

}
