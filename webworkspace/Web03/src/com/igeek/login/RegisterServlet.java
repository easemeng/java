package com.igeek.login;

import java.io.IOException;
import java.util.Arrays;
import java.util.Date;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.eclipse.jdt.internal.compiler.impl.ITypeRequestor;


public class RegisterServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
	
	
    @Override
	public void destroy() {
		// super.destroy();
    	System.out.println("RegisterServlet中的destroy方法");
	}

	@Override
	public void init(ServletConfig config) throws ServletException {
		// super.init(config);
		System.out.println("RegisterServlet中的init方法");
	}

	public RegisterServlet() {
        
    }

	/*
	 * 不管是 get 请求 还是  post 请求 都会调用service方法
	 */
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		request.setCharacterEncoding("UTF-8");
		// 根据表单的name属性值来获得value值 	.getParameter(String name)
		/*
		String loginName = request.getParameter("loginName");
		// getParameterValues(String name)	当你要获取的元素有很多的时候   返回一个字符串数组
		String[] fruit = request.getParameterValues("fruit");
		String password = request.getParameter("password");
		
		String sex = request.getParameter("sex");
		
		String[] sel = request.getParameterValues("sel");
		
		String textArea = request.getParameter("textarea");
		
		// getParameter
		System.out.println(sex);
		
		System.out.println(loginName);
		// 注意： 数组不能直接操作 需要你去遍历	或者调用数组工具类中的方法去操作
		System.out.println(Arrays.toString(sel));
		System.out.println(Arrays.toString(fruit));
		*/
		
		// 拿到的是你传递表单的所有数据的键值对儿的集合
		/*
		Map<String,String[]> parameterMap = request.getParameterMap();
		// 遍历Map
		Set<String> keyset = parameterMap.keySet();
		Iterator it = keyset.iterator();
		while(it.hasNext()){
			String key = (String) it.next();
			String[] values = parameterMap.get(key);
			System.out.println("key的值：" + key + "\tvalue的值：" + Arrays.toString(values));
		}
		*/
		
		// 通过枚举的方式获得所有的输入内容	不太常用
		// 了解就可以
		/*
		Enumeration<String> parameterNames = request.getParameterNames();
		while(parameterNames.hasMoreElements()){
			// 拿到表单中的每一个name属性值
			String name = parameterNames.nextElement();
			String[] values = request.getParameterValues(name);
			System.out.println(name + "\t" +Arrays.toString(values));
		}
		*/
		
		Date date = new Date();
		date.toLocaleString();
		request.getRequestDispatcher("/WEB-INF/success.html").forward(request, response);
	}

}
