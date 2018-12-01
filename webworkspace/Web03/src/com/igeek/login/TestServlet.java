package com.igeek.login;

import java.io.IOException;
import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * 
 * Servlet������������׶�(Ҳ��˵�������׶�  ���غ�ж�ز���Ҫ��Ԥ)
 * 		����
 * 		��ʼ����init()		�÷�������Servlet�����ز�ʵ�����Ժ�ִ�� ֻ��ִ��һ��
 * 		����service()	-->	doGet()   doPost()
 * 		���٣�destroy()	�÷�������Servlet��ϵͳ����ʱִ��	ֻ��ִ��һ��
 * 		ж��
 *
 */

public class TestServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public TestServlet() {
       
    	System.out.println("���ÿղι�����");
    }

	public void init(ServletConfig config) throws ServletException {
		System.out.println("��ʼ������");
		
		String userName = config.getInitParameter("username");
		String age = config.getInitParameter("age");
		// ��õ�ǰServlet�еĳ�ʼ������
		System.out.println(userName+age);
		ServletContext servletContext = config.getServletContext();
		String name = servletContext.getInitParameter("name");
		String age2 = servletContext.getInitParameter("age");
		System.out.println(name + age2 + "TestServlet ���Է��ʵ�ǰ��ȫ������");
	}

	public void destroy() {
		System.out.println("���ٷ���");
	}

	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("����   ����");
	}

}
