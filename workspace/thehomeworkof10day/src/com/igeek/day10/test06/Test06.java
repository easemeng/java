package com.igeek.day10.test06;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;

/**
 * �����������󣬲��ô���ʵ��
	��Ŀ��·�����и�questions.txt�ļ��������£�
		5+5
		150-25
		155*155
		2555/5
	Ҫ�󣺶�ȡ���ݼ��������������д�뵽results.txt�ļ���
		5+5=10
		//....
	˼��:���˵��ȡquestions.txt�ļ�������,���������,��д��questions.txt�ļ�,������д�Ĳ���ʱ���ͬһ���ļ�,Ӧ����β���

 */
public class Test06 {
	public static void main(String[] args) throws Exception {
	    // ��ȡ���ݼ��뵽list��
	    BufferedReader br = new BufferedReader(new FileReader("questions.txt"));
	    String line;
	    ArrayList<String> list = new ArrayList<String>();
	    ArrayList<String> t = new ArrayList<String>();
	    while ((line = br.readLine()) != null) {
	        list.add(line);
	    }
	    br.close();
	    System.out.println(list);

	    // ȡ�������
	    for (int i = 0; i < list.size(); i++) {
	        char[] tmp = list.get(i).toCharArray();
	        for (int j = 0; j < tmp.length; j++) {
	            if (!(tmp[j] >= '0' && tmp[j] <= '9')) {
	                t.add(String.valueOf(tmp[j]));
	                break;
	            }
	        }
	    }
	    //ȡ����������Ա��ʽ��������
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
	    System.out.println("�������");
	}

}
