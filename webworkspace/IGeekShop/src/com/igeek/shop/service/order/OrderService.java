package com.igeek.shop.service.order;

import java.util.List;
import java.util.Map;

import com.igeek.shop.entity.Order;

public interface OrderService {

	List<Order> getOrderList();

	List<Map<String, Object>> getOrderItemsList(String oid);

}
