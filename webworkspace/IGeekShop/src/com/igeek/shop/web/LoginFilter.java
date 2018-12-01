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
		
		// 写一个过滤器 来拦截 index.jsp 和 login.jsp	先判断当前请求参数中是否携带有 cookie.
		// cookie的形式	就是 username=a	根据你发送过来的 cookie 中的用户名 查到当前用户中所有的数据 然后将查询到的结果放入到session中
		
		HttpServletRequest request = (HttpServletRequest)req;
		HttpServletResponse response = (HttpServletResponse) res;
		
		Cookie[] cookies = request.getCookies();
		
		for (Cookie cookie : cookies) {
			// 证明有cookie
			if(cookie.getName().equals("username")){
				// 拿到用户名
				String userName = cookie.getValue();
				CheckService csi = new CheckServiceImpl();
				User user = csi.getUser(userName);
				request.getSession().setAttribute("user", user);
				// response.sendRedirect(request.getContextPath() + "index.jsp");	// 不再跳转 如果跳转会造成重定向次数过多
				// return;	// 一定要加入return 否则可能出现多次转发
			}
			
		}
		chain.doFilter(request, response); // 当请求放行之后
		
	}

	public void init(FilterConfig fConfig) throws ServletException {
		// TODO Auto-generated method stub
	}

}
