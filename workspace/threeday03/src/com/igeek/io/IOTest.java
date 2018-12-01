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
			int i = fr.read(c, 0, 10); // ��ʾ��ȡ�������� �浽 c ������ �� offset ��ʼ�±� ��
										// i ��ʾ��ȡ���ٸ��ַ� ��
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
			char[] c = new char[10]; // ����һ������ �� �����洢 ��ȡ�������� �� һ�����鳤�ȵĴ�СΪ1024������

			int i = fr.read(c); // ����ֵ i ��ʾ ��ȡ���������ܳ���
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
			// ��߲��� ��ʾ��Ҫд����ַ��� off ��ʾ��ʼ�±� �� len ����
			char[] c = { 'ü', '��', 'ѩ', '��', '��', '��', '��', '��', '��', '��' };
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
			// ��߲��� ��ʾ��Ҫд����ַ��� off ��ʾ��ʼ�±� �� len ����
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
			fw.write(i); // ����Unicode ���� �� ��ѱ�������Ӧ���ַ� д�뵽ƽ�ļ��� ��
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
			char[] c = { '��', '��', '��', '��' };
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
		// true �� ���ӵ��÷� �� ���� true ��׷������ �� ���� true �Ḳ�� �� �滻ԭ������
		FileWriter fw = null;
		try {
			fw = new FileWriter("e:/b.txt");
			fw.write("&��������&");
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			if (fw != null) {
				try {
					fw.flush(); // ������д�뵽�ļ���
					fw.close(); // �ͷ���Դ �� Java������ռ�� �� ͬʱ�Ͽ�������
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
			int i = 0; // ��������i �������ܶ�ȡ����Unicode ...
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
		 * ����������ָ��λ�õ�Java���� ���������Java����ָ��λ��
		 * 
		 * �ֽ�����8 bit�� �ַ�����16 bit��
		 * 
		 * �ֽ��� �� InputStream���ֽ��������� OutoutStream���ֽ��������
		 * 
		 * �ַ��� �� Reader���ַ��������� Writer���ַ��������
		 */
		FileReader fr = null;
		try {
			File file = new File("d:/a.txt");
			fr = new FileReader(file);
			int i = fr.read(); // read() ������ʾ��ȡһ���ַ� �� �����ķ���ֵ ��
								// ���Ǹ��ַ�����Ӧ��Unicode����
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
