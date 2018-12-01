package com.igeek.shop.web;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import com.igeek.shop.entity.PageBean;
import com.igeek.shop.service.IndexService;
import com.igeek.shop.service.IndexServiceImpl;

public class IndexServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	private IndexService is = new IndexServiceImpl();
	
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String state = request.getParameter("state");
		if(state.equals("pageInit")){
			this.pageInit(request,response);
		}else if(state.equals("page")){
			this.page(request,response);
		}
		
	}

	private void page(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String currentPageNumber = request.getParameter("page");
		int i = Integer.parseInt(currentPageNumber);
		PageBean pageBean = is.getPageBean(i);	// 拿到所有的page中的数据
		request.setAttribute("pageBean", pageBean);
		request.getRequestDispatcher("/product_list.jsp").forward(request, response);
		
	}

	protected void pageInit(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		PageBean pageBean = is.getPageBean(1);
		// 把封装完成的 pageBean 对象 传入到前台
		request.setAttribute("pageBean", pageBean);
		request.getRequestDispatcher("/product_list.jsp").forward(request, response);
		
	}

}
