package com.igeek.day10.test03;

import java.io.FileReader;
import java.util.ArrayList;

public class MainApp1 {

	@SuppressWarnings({ "resource", "unchecked", "rawtypes" })
	public static void main(String[] args) throws Exception {
		
		ArrayList list = new ArrayList<String>();
		FileReader fr = new FileReader("name.txt");
		
		char[] ch = new char[1024];
		int i = 0;
		while((i = fr.read(ch)) != -1){
			String result = new String(ch,0,i);
			String[] result1 = result.split(",");
			list.add(result1);			
		}
		
		for(int j = 0;j < list.size();j++){
			System.out.println(list.get(j));
		}
	}

}
