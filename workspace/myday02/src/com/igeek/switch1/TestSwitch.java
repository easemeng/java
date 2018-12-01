package com.igeek.switch1;

import java.util.Scanner;

public class TestSwitch {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		
		//选择流程控制语句 。
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入你的选择:");
		byte c = sc.nextByte();
		//皇后要赐死   1.风筝线 。  2.鹤顶红。  3.折磨致死。  4.跪下认错。
		switch(c){
			//如果没有break 代码会产生穿透执行的现象。
			case 1://case 表示常量值 。
				System.out.println("风筝线自尽。");
			//break;
			case 2:
				System.out.println("含笑半步癫。。。");
			//break;//跳出  。结束当前的switch  case语句 。
			case 3:
				System.out.println("被太监折磨致死。。。");
			//break;
			case 4:
				System.out.println("跪下认错。。。");
			//break;
			default://10
				System.out.println("我自己动手，咬舌自尽。...");
			//break;
		}
		
		//  switch case 主要用来做固定的选择  。只要满足数据类型是  byte short  int char 即可 。如果是enum 枚举 需要JDK 1.5 如果使用String 需要JDK 1.7
	
		//推荐使用 switch case 执行效率稍高。
		//if 擅长区间的判断 。
	}

}
