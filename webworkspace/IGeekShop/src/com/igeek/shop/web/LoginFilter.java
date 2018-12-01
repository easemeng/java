package com.igeek.shop.web;

import java.io.IOException;
import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.igeek.shop.entity.User;
import com.igeek.shop.service.CheckService;
import com.igeek.shop.service.CheckServiceImpl;

public class LoginFilter implements Filter {

    public LoginFilter() {
        // TODO Auto-generated constructor stub
    }

	public void destroy() {
		// TODO Auto-generated method stub
	}

	public void doFilter(ServletRequest req, ServletResponse res, FilterChain chain) throws IOException, ServletException {
		
		// дһ�������� ������ index.jsp �� login.jsp	���жϵ�ǰ����������Ƿ�Я���� cookie.
		// cookie����ʽ	���� username=a	�����㷢�͹����� cookie �е��û��� �鵽��ǰ�û������е����� Ȼ�󽫲�ѯ���Ľ�����뵽session��
		
		HttpServletRequest request = (HttpServletRequest)req;
		HttpServletResponse response = (HttpServletResponse) res;
		
		Cookie[] cookies = request.getCookies();
		
		for (Cookie cookie : cookies) {
			// ֤����cookie
			if(cookie.getName().equals("username")){
				// �õ��û���
				String userName = cookie.getValue();
				CheckService csi = new CheckServiceImpl();
				User user = csi.getUser(userName);
				request.getSession().setAttribute("user", user);
				// response.sendRedirect(request.getContextPath() + "index.jsp");	// ������ת �����ת������ض����������
				// return;	// һ��Ҫ����return ������ܳ��ֶ��ת��
			}
			
		}
		chain.doFilter(request, response); // ���������֮��
		
	}

	public void init(FilterConfig fConfig) throws ServletException {
		// TODO Auto-generated method stub
	}

}
