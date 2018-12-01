package com.igeek.shop.web;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.google.gson.Gson;
import com.igeek.shop.entity.Category;
import com.igeek.shop.service.ProductRelateService;

/**
 * 
 * @author student
 *	异步请求获取类别信息
 */
public class CategoryListServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		ProductRelateService service = new ProductRelateService();
		List<Category> categoryList = service.findCategoryList();
		// 需要将categoryList转成json
		Gson gson = new Gson();
		// 	.tojson() 方法 转换成json格式
		String json = gson.toJson(categoryList);
		response.setContentType("text/html;charset=utf-8");
		response.getWriter().write(json);
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
