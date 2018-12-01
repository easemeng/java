package com.igeek.shop.web.order;

import java.io.IOException;
import java.util.List;
import java.util.Map;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.google.gson.Gson;
import com.igeek.shop.entity.Order;
import com.igeek.shop.service.order.OrderService;
import com.igeek.shop.service.order.OrderServiceImpl;

public class OrderServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	private OrderService os = new OrderServiceImpl();
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		request.setCharacterEncoding("utf-8");
		String state = request.getParameter("state");
		if(state.equals("getOrders")){
			this.getOrders(request,response);
		}else if(state.equals("getOrderItems")){
			this.getOrderItems(request,response);
		}
		
	}

	private void getOrderItems(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String oid = request.getParameter("oid");
		
		List<Map<String,Object>> orderItemsList = os.getOrderItemsList(oid);
		
		Gson gson = new Gson();
		String json = gson.toJson(orderItemsList);
		
		response.setContentType("text/html;charset=utf-8");
		response.getWriter().write(json);
		
	}

	protected void getOrders(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		List<Order> orderList = os.getOrderList();
		request.setAttribute("orderList", orderList);
		request.getRequestDispatcher("/admin/order/list.jsp").forward(request, response);
		
	}

}
