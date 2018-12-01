package com.igeek.lesson1;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class TokenServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public TokenServlet() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		request.setCharacterEncoding("utf-8");
		
		HttpSession session = request.getSession();
		String hiddenToken = request.getParameter("token");
		String sessionToken = (String) session.getAttribute("token");
		
		String res = (String) request.getParameter("username");
		System.out.println(res);
		System.out.println(hiddenToken + "�������е�");
		System.out.println(sessionToken + "session�е�");
		// �����ε�¼֮�� �������е�token����ı� 	session�е�token�ı���
		
		if(sessionToken != null && sessionToken.equals(hiddenToken)){
			session.removeAttribute("token");
			request.getRequestDispatcher("/lesson1/success.jsp").forward(request, response);;
		}else{
			request.getRequestDispatcher("/lesson1/login.jsp").forward(request, response);;
		}
		
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
