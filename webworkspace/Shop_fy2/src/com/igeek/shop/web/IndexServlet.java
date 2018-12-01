package com.igeek.shop.web;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.google.gson.Gson;
import com.igeek.shop.entity.Category;
import com.igeek.shop.entity.PageBean;
import com.igeek.shop.service.IndexService;
import com.igeek.shop.service.IndexServiceImpl;

public class IndexServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	private IndexService is = new IndexServiceImpl();
	
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		String state = request.getParameter("state");
		if(state.equals("pageInit")){
			//this.pageInit(request,response);
		}else if(state.equals("initnav")) {
			this.initnav(request,response);
		}else if(state.equals("categorypage")) {
			this.categorypage(request,response);
		}
		
	}

	private void categorypage(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String page = request.getParameter("page");
		int i = Integer.parseInt(page);
		
		String cid = request.getParameter("cid");
		long productNumberByCid = is.getProductNumberByCid(cid);
		PageBean pageBean = is.getPageBeanByCategory(i,12,productNumberByCid,cid);
		request.setAttribute("pageBean", pageBean);
		request.getRequestDispatcher("/product_list.jsp").forward(request, response);
		
	}

	private void initnav(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		List<Category> categoryList = is.getCategoryList();
		
		Gson gson = new Gson();
		String json = gson.toJson(categoryList);
		response.setContentType("text/html;charset=utf-8");
		response.getWriter().write(json);
		
	}

	protected void pageInit(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		PageBean pageBean = is.getPageBean(1);
		//把封装完成的pageBean对象 传入到前台。
		request.setAttribute("pageBean", pageBean);
		request.getRequestDispatcher("/product_list.jsp").forward(request, response);
		
	}

}
