package com.igeek.day10.test06;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;

/**
 * 分析以下需求，并用代码实现
	项目根路径下有个questions.txt文件内容如下：
		5+5
		150-25
		155*155
		2555/5
	要求：读取内容计算出结果，将结果写入到results.txt文件中
		5+5=10
		//....
	思考:如果说读取questions.txt文件的内容,算出计算结果,再写入questions.txt文件,即读和写的操作时针对同一个文件,应该如何操作

 */
public class Test06 {
	public static void main(String[] args) throws Exception {
	    // 读取数据加入到list中
	    BufferedReader br = new BufferedReader(new FileReader("questions.txt"));
	    String line;
	    ArrayList<String> list = new ArrayList<String>();
	    ArrayList<String> t = new ArrayList<String>();
	    while ((line = br.readLine()) != null) {
	        list.add(line);
	    }
	    br.close();
	    System.out.println(list);

	    // 取出运算符
	    for (int i = 0; i < list.size(); i++) {
	        char[] tmp = list.get(i).toCharArray();
	        for (int j = 0; j < tmp.length; j++) {
	            if (!(tmp[j] >= '0' && tmp[j] <= '9')) {
	                t.add(String.valueOf(tmp[j]));
	                break;
	            }
	        }
	    }
	    //取出运算符，对表达式进行运算
	    for (int i = 0; i < list.size(); i++) {
	        String operator = t.get(i);
	        String[] num = list.get(i).split("\\" + operator);
	        int num1 = Integer.parseInt(num[0]);
	        int num2 = Integer.parseInt(num[1]);
	        int result;
	        String bString;
	        switch (operator) {
	        case "+":
	            result = num1+num2;
	            bString=num1+operator+num2+"="+result;
	            list.set(i, bString);
	            break;
	        case "-":
	            result = num1-num2;
	            bString=num1+operator+num2+"="+result;
	            list.set(i, bString); 
	            break;
	        case "*":
	            result = num1*num2;
	            bString=num1+operator+num2+"="+result;
	            list.set(i, bString);
	            break;
	        case "/":
	            result = num1/num2;
	            bString=num1+operator+num2+"="+result;
	            list.set(i, bString);
	            break;
	        default:
	            break;
	        }
	    }
	    System.out.println("-----------");
	    System.out.println(list);
	    BufferedWriter bw= new BufferedWriter(new FileWriter("results.txt"));
	    for(int i=0;i<list.size();i++){
	        bw.write(list.get(i));
	        bw.newLine();
	        bw.flush();
	    }
	    bw.close();
	    System.out.println("答题完成");
	}

}
