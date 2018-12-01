package com.igeek.sessionTest;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


public class SessionTest extends HttpServlet {
	private static final long serialVersionUID = 1L;
 
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// ����servlet ����ֻ�е����� request.getSession()���� ���� request.getSession(true); �Żᴴ��session�������ֱ�ӷ���servlet�ǲ��ᴴ��session�����
		HttpSession session = request.getSession(true);
		System.out.println(session);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		doGet(request, response);
	}

}
