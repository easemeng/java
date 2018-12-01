package com.igeek.shop.web;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.igeek.shop.entity.Category;
import com.igeek.shop.entity.Product;
import com.igeek.shop.service.ProductRelateService;

public class IndexServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		ProductRelateService service = new ProductRelateService();
		
		// 获取最新最热商品
		List<Product> hotProductList = service.findHotProductList();
		List<Product> newProductList = service.findNewProductList();
		List<Category> CategoryList = service.findCategoryList();
		
		// 将数据存放到request域中
		request.setAttribute("hotProductList", hotProductList);
		request.setAttribute("newProductList", newProductList);
		request.setAttribute("CategoryList", CategoryList);
		
		// 服务器跳转
		request.getRequestDispatcher("/index.jsp").forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
