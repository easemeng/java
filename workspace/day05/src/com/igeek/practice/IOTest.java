package com.igeek.practice;

import java.io.FileWriter;

public class IOTest {

	public static void main(String[] args) throws Exception {
		// IO 输入输出流  。 InputStream  OutputStream ...
		
		// 从计算机硬盘读取内容到Java程序   输入  InputStream
		
		// 从Java程序输出内容到计算机  输出   OutputStream
		
		// 字符流  （主要读取文本相关的内容）。 字节流
		
		// 输出流 。 注意  先抛出异常  。  注意：针对windows 操作系统  文件的分隔符可以是 \\ 也可以是 / 
		// 针对Linux操作系统	/
		
		FileWriter fw = new FileWriter("e:/0707.txt",true);
		
		fw.write("\r\n");
		fw.flush();
		
		fw.write("LOVE");
		fw.flush();
		
		fw.write("\r\n");  // windows 下的换行		\r\n		Linux \r		mac \n
		fw.flush();
		
		fw.write("QMY");
		fw.flush();
		
		fw.write("\r\n");
		fw.flush();
		
		fw.write("forever");
		fw.flush();     // 刷新缓冲区后 ， 流对象还是可以正常使用 。 注意，这种方法会把文件中的原有内容给替换掉
	
		fw.write("\r\n");
		fw.flush();
		
		fw.write("ASDFGHJKL", 3, 3);
		
		char[] c = {'你','好','世','界'};
		fw.write(c);
		
		fw.write(c, 2, 2);
		
		fw.write(97);  // 97 97所对应的字符 ？？？		注意：当调用int类型方法的时候  实际写入的是	这个数字所对应的字符(Unicode)
		
		fw.close();  // 关闭流 。  close 在调用的时候  会先刷新缓冲区中的数据 ， 把数据写入到文件中 ， 再关闭流

	}

}
