package com.igeek.liucheng;

public class SwitchCaseDemo1 {

	public static void main(String[] args) {
		
		
		//选择流程控制语句  switch case
		//从键盘上输入一个1-12之间的额数，判断属于哪个月份
		
		//什么时候用if	什么时候用switch case 呢 。 
		//if 主要用来做区间的判断 。 	switch case 主要用来对指定的常量值做判断
		
		/**
		 * switch(变量){
		 * 			case 常量1:
		 * 					执行的代码;				
		 * 			break;
		 * 			}
		 * 
		 * switch case 中 ， 能够使用哪些数据类型？
		 * 		byte , short , char , int
		 * 		String	JDK 1.7才开始支持String
		 * 		enum 枚举（凡是可以穷举出来的结果我们都叫做枚举。） Java 的关键字 。 JDK 1.5之后才支持。
		 * 
		 * 		JDK 基本都会向下兼容
		 * 
		 *  break,continue 有什么区别？
		 *  break  表示跳出  可以用在switch case结构中，也可以用在循环结构中(for , while ,do while )。
		 *  	break 表示跳出当前循环(如果多层循环嵌套，break 只会跳出一层循环)
		 *  continue 只能用在循环结构中，表示结束本次循环，回到循环头部继续下次循环。
		 *  
		 *  想要从N层循环中直接跳出，可以使用一个关键字 return
		 */
		
		int a = 99;
		switch (a)
		{
		case 1:
			System.out.println("1");
			break;
		case 99:
			System.out.println("99");
			break;
			default:
				System.out.println("算了");
				break;
		
		}
	}

}
