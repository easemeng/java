package com.igeek.day10.test05;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.LinkedHashSet;
import java.util.Scanner;

/**
 * 分析以下需求，并用代码实现
	1.项目根目录下建立文件： user.txt，文件中存放用户名和登录密码，格式：用户名，密码,如：aaa,123；
	2. user.txt文件中初始存放的用户信息有如下：
		jack,123
		rose,123
		tom,123
	3.要求完成如下功能：
	  程序运行时：控制台提示用户输入注册的用户名和密码；
	   验证键盘录入的用户名跟user.txt中已注册的用户名是否重复：
	   是：控制台提示：用户名已存在
	   否：将键盘录入的用户名及密码写入user.txt文件，并在控制台提示：注册成功；

 */
public class MainApp {
	@SuppressWarnings("resource")
	public static void main(String[] args)throws IOException {
		BufferedReader bf = new BufferedReader(new FileReader("user.txt"));
		String line = null;
		
		LinkedHashSet<String> hash = new LinkedHashSet<>();
		while((line = bf.readLine())!=null){
			String[] spilt = line.split(",");//通过正则表达式根据规则切割
			hash.add(spilt[0]);//切割后的spilt[0]是用户名，存入set集合
		}
		Scanner sc = new Scanner(System.in);
		String inputStr = sc.nextLine();//用户输入字符串
		String spiltInputStr[] = inputStr.split(",");
		if(hash.add(spiltInputStr[0]) == false)//根据HashSet集合不能存储元素，当存入重复的元素时返回false，此种情况为存入了重复元素
		{
			System.out.println("用户名存在");
		}
		else{ //当集合里面没此用户名时，创建字符输入流并且设为续写
			BufferedWriter bw = new BufferedWriter(new FileWriter("user.txt"));					
			bw.newLine();//换行
			bw.write(inputStr);
			System.out.println("注册成功");
			bw.close();
		}
		bf.close();
	}

}
