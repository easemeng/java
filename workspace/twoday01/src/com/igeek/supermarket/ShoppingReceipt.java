package com.igeek.supermarket;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.ArrayList;
import java.util.Scanner;

public class ShoppingReceipt {
	// static ArrayList<GoodsItem> data = new ArrayList<GoodsItem>();
	@SuppressWarnings({ "resource", "unused" })
	public static void main(String[] args) throws Exception {
		
		FileInputStream fis = new FileInputStream("supermarket.txt");
		FileOutputStream fos = new FileOutputStream("supermarket.txt");
		BufferedInputStream bis = new BufferedInputStream(fis);
		BufferedOutputStream bos = new BufferedOutputStream(fos);
		
		ArrayList<GoodsItem> data = new ArrayList<GoodsItem>();
		System.out.println("欢迎进入超市管理系统");
		intiData(data);
		while (true) {
			System.out.println("请输入您要进行的操作:1 输入购买数量   2 打印小票   3 退出系统");

			Scanner scanner = new Scanner(System.in);
			int a = scanner.nextInt();

			switch (a) {
			case 1:
				enterNumber(data);
				break;
			case 2:
				System.out.println("打印购物小票");
				printReceipt(data);
				break;
			case 3:
				System.out.println("谢谢惠顾，期待您的下次光临");
				System.exit(0);
				break;
			default:
				System.out.println("输入有误，请重新输入");
				break;
			}
		}

	}

	private static void intiData(ArrayList<GoodsItem> data) {  //初始化data数据
		GoodsItem sls = new GoodsItem("少林寺核桃", " 090115", 15.5, 0, " 袋", 0.0);
		GoodsItem shk = new GoodsItem("尚康粗粮饼干", " 090027", 14.5, 0, " 盒", 0.0);
		GoodsItem coc = new GoodsItem("畅享酸奶", " 090303", 15.5, 0, " 盒", 0.0);

		data.add(sls);
		data.add(shk);
		data.add(coc);
	}

	@SuppressWarnings("resource")
	private static void enterNumber(ArrayList<GoodsItem> data) {
		// 输入商品数量更新data数据    数量  金额
		for (int i = 0; i < data.size(); i++) {
			Scanner sc = new Scanner(System.in);
			System.out.println("请输入您要购买的" + data.get(i).getName() + "数量（单价¥" + data.get(i).getPrice() + "/"
					+ data.get(i).getUnti() + "）");
			int itemNum = sc.nextInt();
			double itemMon = itemNum * data.get(i).getPrice();

			data.get(i).setNumber(itemNum);
			data.get(i).setMoney(itemMon);
		}
	}

	private static void printReceipt(ArrayList<GoodsItem> data) {
		// 打印小票
		System.out.println("    欢迎光临");
		System.out.println("品名\t售价\t数量\t单位\t金额");
		System.out.println("-------------------------------------------");
		// 定义商品件数
		int totalNum = 0;
		int totalMon = 0;  // 商品总价
		int count = 0;  // 商品种类
		for (int i = 0; i < data.size(); i++) {
			if (data.get(i).getNumber() != 0) {
				System.out.println(data.get(i).getName() + "\t" + data.get(i).getPrice() + "\t"
						+ data.get(i).getNumber() + "\t" + data.get(i).getUnti() + "\t" + data.get(i).getMoney());
				totalNum += data.get(i).getNumber();
				totalMon += data.get(i).getMoney();
				count++;
			}
		}

		System.out.println("-------------------------------------------");

		System.out.println("共" + count + "项商品");
		System.out.println("共" + totalNum + "件商品");
		System.out.println("共" + totalMon + "元");

	}

}
