package com.igeek.shop.servlet;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.igeek.common.StringUtils;
import com.igeek.shop.entity.Category;
import com.igeek.shop.service.adminCategory.AdminCategoryService;
import com.igeek.shop.service.adminCategory.AdminCategoryServiceImpl;

public class AdminCategoryServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	private AdminCategoryService acs = new AdminCategoryServiceImpl();
	
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String state = request.getParameter("state");
		if(state.equals("getCategoryList")){
			this.getCategoryList(request,response);
		}else if(state.equals("addCategory")){
			this.addCategory(request,response);
		}else if(state.equals("delete")){
			this.delete(request,response);
		}
		
	}

	private void delete(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String cid = request.getParameter("cid");
		acs.delete(cid);
		getCategoryList(request,response);
		
	}

	private void addCategory(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String cname = request.getParameter("cname");
		Category category = new Category();
		category.setCid(StringUtils.getUUID());
		category.setCname(cname);
		acs.addCategory(category);
		getCategoryList(request,response);
		
	}

	protected void getCategoryList(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		List<Category> categoryList = acs.getCategoryList();
		request.setAttribute("categoryList", categoryList);
		request.getRequestDispatcher("/admin/category/list.jsp").forward(request, response);	
	}

}
