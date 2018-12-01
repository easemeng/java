package com.igeek.lesson2;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class CheckCodeServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		String name = request.getParameter("username");
		String checkCode = request.getParameter("checkCode");
		String sessionCode = (String) request.getSession().getAttribute("CHECK_CODE_KEY");
		// �õ�session�д洢����֤��
/*		System.out.println(name);
		System.out.println(checkCode);
		System.out.println(sessionCode);*/
		if(sessionCode != null && checkCode.equals(sessionCode)){
			// ��session�а���֤���Ƴ�
			request.getSession().removeAttribute("CHECK_CODE_KEY");
			request.getRequestDispatcher("/lesson2/success.jsp").forward(request, response);
		}else{
			request.setAttribute("message", "��֤���������");
			request.getRequestDispatcher("/lesson2/login.jsp").forward(request, response);;
		}
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
