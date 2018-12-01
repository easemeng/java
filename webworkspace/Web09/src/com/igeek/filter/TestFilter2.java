package com.igeek.filter;

import java.io.IOException;
import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServlet;

public class TestFilter2 implements Filter {

    public TestFilter2() {
        
    }

	public void destroy() {
		
		System.out.println("销毁过滤器2 过滤器2被卸载");
		
	}
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
		
		System.out.println("过滤器2被执行");
		
		chain.doFilter(request, response);
		// 后面没有过滤器了 直接访问目标请求 或者目标页面
		
		System.out.println("过滤器2执行完毕");
	}

	public void init(FilterConfig fConfig) throws ServletException {
		
		System.out.println("过滤器2初始化");
		
	}

}
