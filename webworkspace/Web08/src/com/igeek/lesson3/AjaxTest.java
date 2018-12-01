package com.igeek.lesson3;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class AjaxTest extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		request.setCharacterEncoding("utf-8");
		String username = request.getParameter("username");
		System.out.println(username);
		response.setContentType("text/html;charset=utf-8");
		// ȡ��ͬԴ���Եķ������� �����ǵĽӿڿ��Ա�������ʵ�
		response.setHeader("Access-Control-Allow-Origin", "*");
		if(username.equals("tom")){
			request.setAttribute("msg", "�û����Ѵ���");
			request.getRequestDispatcher("/lesson3/ajax.jsp").forward(request, response);
		}else{
			// ���������������Ӧ������
			response.getWriter().write("ע��ɹ�");
			// response.getWriter().write("{\"msg\":\"ע��ɹ�!\"}");
		}
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		doGet(request, response);
	}

}
