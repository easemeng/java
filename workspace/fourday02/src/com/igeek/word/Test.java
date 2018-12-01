package com.igeek.word;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class Test {

	// 无法直接读取，word文档里的内容 。 其实word文档是一个zip包
	// POI
	// 请使用下面曲线救国的方式
	
	public static void main(String[] args) {
		
		List<String> list = new LinkedList<String>();

		File file = new File("test1.txt");
		File file2 = new File("test2.txt");
		FileReader fr = null;
		FileWriter fw = null;
		BufferedReader br = null;
		BufferedWriter bw = null;
		
		try {
			fr = new FileReader(file);
			fw = new FileWriter(file2);
			br = new BufferedReader(fr);
			bw = new BufferedWriter(fw);
			
			String str = null;
			while((str = br.readLine()) != null){
				list.add(str);
			}
			
			Collections.shuffle(list);
			Collections.shuffle(list);
			Collections.shuffle(list);
			
			for (String string : list) {
				
				bw.write(string);
				bw.newLine();
				
			}
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			if(bw != null){
				try {
					bw.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			if(br != null){
				try {
					br.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
	}

}
