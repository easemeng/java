package com.igeek.shop.service;

import java.util.List;
import java.util.Map;

import com.igeek.shop.entity.Category;
import com.igeek.shop.entity.Order;
import com.igeek.shop.entity.OrderItem;
import com.igeek.shop.entity.PageBean;
import com.igeek.shop.entity.Product;

public interface ProductRelateService {
	
	List<Product> findHotProductList();
	
	List<Product> findNewProductList();
	
	List<Category> findCategoryList();

	Long getProductNumberByCid(String cid);

	PageBean getPageBeanByCategory(int currentPageNumber, int PageSize, long totalPageDataNumber, String cid);

	Product getOneProduct(String pid);

	Category getOneCategory(String cid);

	void submitOrders(Order order);
	
	void submitOrderItems(OrderItem orderItem);

	void confirmOrder(Order order);

	List<Order> findOrders(String uid);

	List<Map<String, Object>> findOrderItem(String oid);

	void delOrderItem(String oid);

	void delOrder(String oid);

	Order findOneOrders(String oid);

	List<Order> findPaymentOrders(String uid);

	void updateOrderState(String r6_Order);
}
