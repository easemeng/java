package com.igeek.proxy;

import java.util.List;

public class WeiXiaoBao {
	
	// 韦小宝
	// 美女接口
	// 双儿
	// 龙儿
	// 阿珂
	// 建宁

	// 调用具体的美女方法   需要找到 玄烨  ... 代理类
	public static void main(String[] args) {
		
		// 设计模式   代理模式  。  Proxy...
		// 静态代理   动态代理（Java反射）
		// 设计模式 ： 实在大量的实践 ， 跟理论中优选的代码结构 ， 编程风格 ， 以及解决问题的思考方式
		// 		       可以完成解耦 ， 最小限度的修改代码实现复杂功能
		
		// MeiNvRuYun longe = new LongErImpl();
		// longe.meet();
		
		// 声明代理对象 ，  需要找的那个具体的对象 ， 只需要告诉代理类就可以了 。 
		
		MeiNvRuYun ke = new AKeImpl();
		MeiNvRuYun longe = new LongErImpl();
		MeiNvRuYun shuang = new ShuangErImpl();
		
		/*MeiNvRuYun jianNing = new JianNingImpl(longe);
		jianNing.meet();*/  // 静态代理模式
		
		// 动态代理模式
		DynamicProxy dp = new DynamicProxy();
		Object prObject = dp.createOroxyInstance(longe);
		MeiNvRuYun my = (MeiNvRuYun) prObject;
		// List list = my.getAll();
		// System.out.println(list);
		// my.delete("1");
		my.meet();
		/**
		 *  辅助业务
		 * 核心业务	辅助业务
		 *  辅助业务
		 *  辅助业务
		 */

	}

}
