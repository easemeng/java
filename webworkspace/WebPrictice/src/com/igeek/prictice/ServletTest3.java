package com.igeek.prictice;

import java.io.IOException;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ServletTest3 extends HttpServlet {


	private static final long serialVersionUID = 1L;

	@Override
	protected void service(HttpServletRequest arg0, HttpServletResponse arg1) throws ServletException, IOException {
		System.out.println("�Զ���service");
	}

	@Override
	public void destroy() {
		System.out.println("���ٹ�����");
	}

	@Override
	public void init(ServletConfig config) throws ServletException {
		System.out.println("��ʼ��");
	}
	
	

}
