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
		
		System.out.println("���ٹ�����2 ������2��ж��");
		
	}
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
		
		System.out.println("������2��ִ��");
		
		chain.doFilter(request, response);
		// ����û�й������� ֱ�ӷ���Ŀ������ ����Ŀ��ҳ��
		
		System.out.println("������2ִ�����");
	}

	public void init(FilterConfig fConfig) throws ServletException {
		
		System.out.println("������2��ʼ��");
		
	}

}
