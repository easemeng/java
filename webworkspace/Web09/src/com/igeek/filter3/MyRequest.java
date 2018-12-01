package com.igeek.filter3;

import java.io.UnsupportedEncodingException;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletRequestWrapper;

// HttpServletRequestWrapper	装饰了三层	搞定
public class MyRequest extends HttpServletRequestWrapper {

	private HttpServletRequest request;
	// 定义一个标记 控制编码的次数 只执行一次
	private boolean flag = false;	// 转码的时候只需要转换一次 false表示还没有转码
	
	public MyRequest(HttpServletRequest request) {
		super(request);
		this.request = request;
	}

	@Override
	public String getParameter(String name) {
		// 即使还是会调用getParameterMap 进行整体转码
		String[] values = this.getParameterValues(name);
		if(values != null){
			// 根据name拿到的都是单个的值
			return values[0];
		}
		// 否则再去调用父类中的方法
		return super.getParameter(name);
	}

	@Override
	public Map<String, String[]> getParameterMap() {
		
		// 获取请求方式，根据不同方式处理乱码
		String method = request.getMethod();	// 获得请求方式	post get
		
		if(method.equalsIgnoreCase("post")){
			try {
				request.setCharacterEncoding("utf-8");
				// 返回重新编码之后的map对象	ok
				return request.getParameterMap();
			} catch (UnsupportedEncodingException e) {
				e.printStackTrace();
				return request.getParameterMap();
			}
		}else if(method.equalsIgnoreCase("get")){
			// get
			// 将所有的请求参数获取出来	然后一个一个的处理乱码
			Map<String, String[]> map = request.getParameterMap();
			// 如何控制编码 让它只执行一次
			// flag 默认是false 所以往下执行
			// flag 第二次执行 true 直接结束 不再执行
			if(flag){
				return map;
			}
			// 遍历map集合获取数据
			if(map != null){
				// keySet(); 从前台传递过来的所有name属性	组成的Set集合
				for(String key : map.keySet()){
					// 根据key 拿到对应的 value name="mm,yy,zz" age="18"
					String[] values = map.get(key);
					if(values != null){
						// 
						for(int i = 0; i < values.length; i++ ){
							
							try {
								String string = new String(values[i].getBytes("iso-8859-1"),"utf-8");
								values[i] = string;
							} catch (UnsupportedEncodingException e) {
								e.printStackTrace();
								// 如果出异常，希望后边，还没有循环到的数据，继续处理乱码
								// 结束当前循环，开启下一次循环
								continue;
							}
						}
					}
				}
			}
			// true 已经转码完成
			flag = true;
			// 转完码之后的map给他返回
			return map;
		}else{
			return super.getParameterMap();
		}
	}

	@Override
	public String[] getParameterValues(String name) {
		// 先调用上一个方法 整体转码
		Map<String,String[]> map = this.getParameterMap();
		if(map != null){
			// 根据传入的name 将转码之后的 map 中的value[] 取出来
			String[] values = map.get(name);
			// 返回转码之后的值
			return values;
		}
		// 如果说不满足上述条件	还去调用父类中的方法
		return super.getParameterValues(name);
	}
	
	

}
