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


//����һ���� ʵ��filter�ӿ�
public class TestFilter1 implements Filter {

    public TestFilter1() {
        
    }

    // ���ٹ����� ֻ��ִ��һ��
	public void destroy() {
		
		System.out.println("���ٹ�����1 ������1��ж��");
		
	}

	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
		
		HttpServletRequest req = (HttpServletRequest) request;
		HttpServletResponse resp = (HttpServletResponse) response;
		
		System.out.println("������1��ִ��");
		// ��һЩ 	Ȩ�޴���	�ַ�ת��(ת����������)
		
		// chain.doFilter() ��ʾ���е�ǰ����	����� �¸������� ��ȥ���¸������� ���û���¸������� ֱ�ӷ���
		chain.doFilter(request, response);
		
		System.out.println("������1ִ�����");
	}

	public void init(FilterConfig fConfig) throws ServletException {
		
		System.out.println("������1��ʼ��");
		
	}

}
