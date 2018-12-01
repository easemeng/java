package com.igeek.io;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;

import org.junit.Test;

public class IOTest {

	@Test
	public void reader2() {
		FileReader fr = null;
		try {
			File file = new File("e:/b.txt");
			fr = new FileReader(file);
			char[] c = new char[10];
			int i = fr.read(c, 0, 10); // 表示读取到的数据 存到 c 数组中 。 offset 起始下标 。
										// i 表示读取多少个字符 。
			System.out.println(i);
			System.out.println(Arrays.toString(c));
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if (fr != null) {
				try {
					fr.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
	}

	@Test
	public void reader1() {
		FileReader fr = null;
		try {
			File file = new File("e:/b.txt");
			fr = new FileReader(file);
			char[] c = new char[10]; // 声明一个数组 ， 用来存储 读取到的数据 。 一般数组长度的大小为1024的整数

			int i = fr.read(c); // 返回值 i 表示 读取到的数据总长度
			System.out.println(i);
			System.out.println(Arrays.toString(c));
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if (fr != null) {
				try {
					fr.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
	}

	@Test
	public void test7() {
		FileWriter fw = null;
		try {
			fw = new FileWriter("e:/b.txt");
			// 左边参数 表示需要写入的字符串 off 表示起始下标 。 len 长度
			char[] c = { '眉', '间', '雪', '大', '美', '江', '湖', '白', '骨', '哀' };
			fw.write(c, 3, 4);
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			if (fw != null) {
				try {
					fw.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
	}

	@Test
	public void test6() {
		FileWriter fw = null;
		try {
			fw = new FileWriter("e:/b.txt");
			// 左边参数 表示需要写入的字符串 off 表示起始下标 。 len 长度
			fw.write("OMGSKTRNGIGEDG", 6, 3);
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			if (fw != null) {
				try {
					fw.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
	}

	@Test
	public void test5() {
		FileWriter fw = null;
		try {
			fw = new FileWriter("e:/b.txt");
			int i = 97;
			fw.write(i); // 传入Unicode 编码 ， 会把编码所对应的字符 写入到平文件中 。
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			if (fw != null) {
				try {
					fw.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
	}

	@Test
	public void test4() {
		FileWriter fw = null;
		try {
			fw = new FileWriter("e:/b.txt");
			char[] c = { '大', '美', '江', '湖' };
			fw.write(c);
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			if (fw != null) {
				try {
					fw.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
	}

	@Test
	public void test3() {
		// true 跟 不加的用法 。 加了 true 会追加内容 。 不加 true 会覆盖 ， 替换原有内容
		FileWriter fw = null;
		try {
			fw = new FileWriter("e:/b.txt");
			fw.write("&大美江湖&");
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			if (fw != null) {
				try {
					fw.flush(); // 将数据写入到文件中
					fw.close(); // 释放资源 ， Java程序不再占用 。 同时断开流对象
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
	}

	@Test
	public void test2() {

		FileReader fr = null;
		try {
			File file = new File("d:/a.txt");
			fr = new FileReader(file);
			int i = 0; // 声明变量i 用来接受读取到的Unicode ...
			while ((i = fr.read()) != -1) {
				System.out.println((char) i);
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if (fr != null) {
				try {
					fr.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}

	}

	@Test
	public void test1() {

		/**
		 * 输入流：从指定位置到Java程序 输出流：从Java程序到指定位置
		 * 
		 * 字节流（8 bit） 字符流（16 bit）
		 * 
		 * 字节流 ： InputStream（字节输入流） OutoutStream（字节输出流）
		 * 
		 * 字符流 ： Reader（字符输入流） Writer（字符输出流）
		 */
		FileReader fr = null;
		try {
			File file = new File("d:/a.txt");
			fr = new FileReader(file);
			int i = fr.read(); // read() 方法表示读取一个字符 。 方法的返回值 ，
								// 就是该字符所对应的Unicode编码
			System.out.println(i);
			int i2 = fr.read();
			System.out.println(i2);
			int i3 = fr.read();
			System.out.println(i3);
			int i4 = fr.read();
			System.out.println(i4);
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if (fr != null) {
				try {
					fr.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}

	}

}
