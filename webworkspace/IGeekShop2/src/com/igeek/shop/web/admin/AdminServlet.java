package com.igeek.shop.web.admin;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.igeek.common.utils.StringUtils;
import com.igeek.shop.entity.Category;
import com.igeek.shop.service.admin.AdminService;

public class AdminServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	private AdminService service = new AdminService();
	
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		request.setCharacterEncoding("utf-8");
		
		String state = request.getParameter("state");
		if(state.equals("getCategory")){
			this.getCategory(request,response);
		}else if(state.equals("add")){
			this.addCategory(request,response);
		}else if(state.equals("update")){
			this.updateCategory(request,response);
		}else if(state.equals("updateOne")){
			this.updateOne(request,response);
		}else if(state.equals("delete")){
			this.delete(request,response);
		}
	}

	private void delete(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String cid = request.getParameter("cid");
		service.deleteCategory(cid);
		getCategory(request,response);
		
	}

	private void updateOne(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String cid = request.getParameter("cid");
		Category category = service.updateOne(cid);
		request.setAttribute("category", category);
		request.getRequestDispatcher("/admin/category/edit.jsp").forward(request, response);
		
	}

	private void updateCategory(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String cname=request.getParameter("cname");
		String cid=request.getParameter("hId");
		service.updateCategory(cname, cid);
		getCategory(request,response);
		
	}

	private void addCategory(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		Category category = new Category();
		category.setCid(StringUtils.getUUID());
		category.setCname(request.getParameter("cname"));
		service.addCategory(category);
		getCategory(request,response);
		
	}

	private void getCategory(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		List<Category> CategoryList = service.getCategorys();
		request.setAttribute("CategoryList", CategoryList);
		request.getRequestDispatcher("/admin/category/list.jsp").forward(request, response);
		
	}
	
	

}
