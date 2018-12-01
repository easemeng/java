package com.igeek.login;

import java.io.IOException;
import java.io.PrintWriter;
import java.net.URLDecoder;
import java.net.URLEncoder;

import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    @Override
	public void init(ServletConfig config) throws ServletException {
		// super.init(config);
    	// String userName = config.getInitParameter("username");
    	// String age = config.getInitParameter("age");
    	// ��õ�ǰServlet�еĳ�ʼ������
    	// System.out.println(userName + age);
    	// ����һ��Servlet�����Ķ���	ͨ�����������Է���ȫ�ֵ����ò���
    	ServletContext servletContext = config.getServletContext();
    	String name = servletContext.getInitParameter("name");
    	String age = servletContext.getInitParameter("age");
    	System.out.println(name + age + "LoginServlet");
    	
	}

	public LoginServlet() {
       
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// System.out.println("doget����ִ����");
		// request ����	��������оͷ�װ�˹�����������ݹ�������������
		
		response.setHeader("content-Type", "text/html;charset=UTF-8");
		// ������Ӧ���� 	ָ�����ص��������� 	Ϊ�ı�/html �ַ���Ϊutf-8
		// request �����оͷ�װ�� �����������Ϣ
		String header = request.getHeader("Accept-Language");
		String connection = request.getHeader("Connection");
		System.out.println(connection);
		System.out.println(header);
		// �������ͷ��������Ϣ
		
		// ��δ���get��������	Tomcat8����Ĭ�ϱ����ʽUTF-8		Tomcat8���µı����� 8859-1
		// ��ȡ���ݹ����Ĳ���
		// 1. ��Tomcat�����ļ��� �޸Ķ˿ںŵ�λ�� �������´��� URIEncoding="UTF-8"
		//   URI ͳһ��Դ������	URL ͳһ��Դ��λ��
		// (�Ƽ�����get����ķ�ʽ)2. get  post	�ռ�ת��
		String loginName = request.getParameter("loginName");
		String password = request.getParameter("password");
		System.out.println(loginName + "\t" + password);
		// String newLoginName = new String(loginName.getBytes("ISO-8859-1"),"UTF-8");
		// String newPassword = new String(password.getBytes("ISO-8859-1"),"UTF-8");
		// System.out.println(newLoginName + "\t" + newPassword);
		// ָ���Ƕ����ݽ��б���	iso-8859-1
		String encode = URLEncoder.encode(loginName,"iso-8859-1");
		String decode = URLDecoder.decode(password,"utf-8");
		System.out.println(decode);
		
		// PrintWriter
		
		PrintWriter out = response.getWriter();
		out.write("���յ���:" + decode);
	}

	// ������get���� ����post���� �������doget����
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		// doGet(request, response);
		// ����post��������룬��ʽһ��ʹ���ռ�ת��	String ת����֮����ַ���=new String(��Ҫת����ַ���.getBytes("ISO-8859-1"),"UTF-8")
		// (�Ƽ��Ĵ���post����ķ�ʽ)����post��������ķ�ʽ�����ڻ�ȡ����֮ǰ�����д����һ�е�λ�ã�����ǰ��������һ������
		// request.setCharacterEncoding("UTF-8"); һ����ڽ�������֮ǰ
		request.setCharacterEncoding("utf-8");
		String header = request.getHeader("Accept-Language");
		String connection = request.getHeader("Connection");
		System.out.println(connection);
		System.out.println(header);
		String loginName = request.getParameter("loginName");
		String password = request.getParameter("password");
		
		System.out.println(loginName + "\t" + password);
		// String newLoginName = new String(loginName.getBytes("ISO-8859-1"),"UTF-8");
		// String newPassword = new String(password.getBytes("ISO-8859-1"),"UTF-8");
		// System.out.println(newLoginName + "\t" + newPassword);
		
	}

}
