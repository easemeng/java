package com.igeek.filter;

import java.io.IOException;
import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


//创建一个类 实现filter接口
public class TestFilter1 implements Filter {

    public TestFilter1() {
        
    }

    // 销毁过滤器 只会执行一次
	public void destroy() {
		
		System.out.println("销毁过滤器1 过滤器1被卸载");
		
	}

	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
		
		HttpServletRequest req = (HttpServletRequest) request;
		HttpServletResponse resp = (HttpServletResponse) response;
		
		System.out.println("过滤器1被执行");
		// 做一些 	权限处理	字符转码(转换中文乱码)
		
		// chain.doFilter() 表示放行当前请求	如果有 下个过滤器 会去找下个过滤器 如果没有下个过滤器 直接放行
		chain.doFilter(request, response);
		
		System.out.println("过滤器1执行完毕");
	}

	public void init(FilterConfig fConfig) throws ServletException {
		
		System.out.println("过滤器1初始化");
		
	}

}
