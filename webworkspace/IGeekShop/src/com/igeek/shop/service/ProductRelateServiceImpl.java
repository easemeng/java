package com.igeek.shop.service;

import java.util.List;
import java.util.Map;

import org.apache.commons.dbutils.handlers.MapListHandler;

import com.igeek.shop.dao.BaseDao;
import com.igeek.shop.entity.Category;
import com.igeek.shop.entity.Order;
import com.igeek.shop.entity.OrderItem;
import com.igeek.shop.entity.PageBean;
import com.igeek.shop.entity.Product;

public class ProductRelateServiceImpl implements ProductRelateService {
	
	private BaseDao dao = new BaseDao();
	
	@Override
	public List<Product> findHotProductList(){
		
		String sql = "select * from product where is_hot = ? limit ?,?";
		Object[] params = {1,0,9};
		List<Product> hotProductList = (List<Product>) dao.getList(sql, params, new Product());
		return hotProductList;
		
	}
	
	@Override
	public List<Product> findNewProductList(){
		
		String sql = "select * from product order by pdate desc limit ?,?";
		Object[] params = {0,9};
		List<Product> newProductList = (List<Product>) dao.getList(sql, params, new Product());
		return newProductList;
		
	}
	
	@Override
	public List<Category> findCategoryList(){
		
		String sql = "select * from category";
		Object[] params = {};
		List<Category> categoryList = (List<Category>) dao.getList(sql, params, new Category());
		return categoryList;
		
	}

	@Override
	public Long getProductNumberByCid(String cid) {
		
		String sql = "select count(*) from product where cid=?";
		Object[] params = {cid};
		long totalPageDataNumber = dao.getTotalDataNumber(sql, params);
		return totalPageDataNumber;
	}

	@Override
	public PageBean getPageBeanByCategory(int currentPageNumber, int PageSize, long totalPageDataNumber, String cid) {
		
		PageBean pageBean = new PageBean(currentPageNumber,PageSize,(int)totalPageDataNumber);
		String sql = "select * from product where cid=? limit ?,?";
		Object[] params = {cid,pageBean.getStartIndex(),pageBean.getPageSize()};
		List<Product> productList = (List<Product>) dao.getList(sql, params, new Product());
		pageBean.setData(productList);
		pageBean.setCid(cid);
		return pageBean;
	}

	@Override
	public Product getOneProduct(String pid) {
		
		String sql = "select * from product where pid=?";
		Object[] params = {pid};
		Product product = (Product) dao.getOne(sql, params, new Product());
		return product;
	}

	@Override
	public Category getOneCategory(String cid) {
		
		String sql = "select * from category where cid=?";
		Object[] params = {cid};
		Category category = (Category) dao.getOne(sql, params, new Category());
		return category;
	}

	@Override
	public void submitOrders(Order order) {
		
		String sql = "insert into orders values(?,?,?,?,?,?,?,?)";
		Object[] params = { order.getOid(), order.getOrdertime(), order.getTotal(), 
						order.getState(),order.getAddress(), order.getName(), 
						order.getTelephone(), order.getUser().getUid() };
		dao.update(sql, params);
	}
	
	@Override
	public void submitOrderItems(OrderItem orderItem) {
		
		String sql = "insert into orderitem values(?,?,?,?,?)";
		Object[] params = { orderItem.getItemid(), orderItem.getCount(), orderItem.getSubtotal(),
				orderItem.getProduct().getPid(), orderItem.getOrder().getOid() };
		dao.update(sql, params);
		
	}


	@Override
	public void confirmOrder(Order order) {
		
		String sql = "update orders set address=?,name=?,telephone=? where oid=?";
		Object[] params = {order.getAddress(),order.getName(),order.getTelephone(),order.getOid()};
		dao.update(sql, params);
		
	}

	@Override
	public List<Order> findOrders(String uid) {
		
		String sql = "select * from orders where uid=? and state=? order by ordertime desc";
		Object[] params = {uid,0};
		List<Order> orderList = (List<Order>) dao.getList(sql, params, new Order());
		return orderList;
	}

	@Override
	public List<Map<String, Object>> findOrderItem(String oid) {
		
		String sql = "select i.count,i.subtotal,p.pimage,p.pname,p.shop_price from orderitem i,product p where i.pid=p.pid and i.oid=?";
		Object[] params = {oid};
		List<Map<String, Object>> orderitemMap =  (List<Map<String, Object>>) dao.getListMap(sql, params);
		return orderitemMap;
	}

	@Override
	public void delOrderItem(String oid) {
		
		String sql = "delete from orderitem where oid=?";
		Object[] params = {oid};
		dao.update(sql, params);
		
	}

	@Override
	public void delOrder(String oid) {
		
		String sql = "delete from orders where oid=?";
		Object[] params = {oid};
		dao.update(sql, params);
		
	}

	@Override
	public Order findOneOrders(String oid) {
		
		String sql = "select * from orders where oid=?";
		Object[] params = {oid};
		Order order = (Order) dao.getOne(sql, params, new Order());
		return order;
	}

	@Override
	public List<Order> findPaymentOrders(String uid) {
		
		String sql = "select * from orders where uid=? and state=? order by ordertime desc";
		Object[] params = {uid,1};
		List<Order> orderList = (List<Order>) dao.getList(sql, params, new Order());
		return orderList;
	}

	@Override
	public void updateOrderState(String r6_Order) {
		
		String sql = "update orders set state=? where oid=?";
		Object[] params = {1,r6_Order};
		dao.update(sql, params);
		
	}
	
}
