package com.igeek.shop.service.order;

import java.util.List;
import java.util.Map;

import com.igeek.shop.dao.BaseDao;
import com.igeek.shop.entity.Order;

public class OrderServiceImpl implements OrderService {

	private BaseDao<Order> dao = new BaseDao<Order>();
	@Override
	public List<Order> getOrderList() {
		
		String sql = "select * from orders";
		Object[] params = {};
		List<Order> orderList = (List<Order>) dao.getList(sql, params, new Order());
		return orderList;
	}
	@Override
	public List<Map<String, Object>> getOrderItemsList(String oid) {
		
		String sql = "select o.count,o.subtotal,p.pimage,p.pname,p.shop_price from orderitem o,product p where o.pid=p.pid and oid=?";
		Object[] params = {oid};
		List<Map<String, Object>> orderItemsList = (List<Map<String, Object>>) dao.getListMap(sql, params);
		return orderItemsList;
	}
	
	

}
