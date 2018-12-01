package com.igeek.shop.service.product;

import java.util.List;

import com.igeek.shop.dao.BaseDao;
import com.igeek.shop.entity.Product;

public class ProductServiceImpl implements ProductService {

	private BaseDao dao = new BaseDao();
	
	@Override
	public List<Product> getProductList() {
		
		String sql = "select * from product";
		Object[] params = {};
		List<Product> productList = (List<Product>) dao.getList(sql, params, new Product());
		return productList;
	}

	@Override
	public void delete(String pid) {
		
		String sql = "delete from product where pid=?";
		Object[] params = {pid};
		dao.update(sql, params);
		
	}

	@Override
	public void addProduct(Product product) {
		
		String sql = "insert into product value(?,?,?,?,?,?,?,?,?,?)";
		Object[] params = { product.getPid(), product.getPname(), product.getMarket_price(), product.getShop_price(),
				product.getPimage(), product.getPdate(), product.getIs_hot(), product.getPdesc(), product.getPflag(),
				product.getCid() };
		dao.update(sql, params);	
		
	}

	@Override
	public Product updateOne(String pid) {
		
		String sql = "select * from product where pid=?";
		Object[] params = {pid};
		Product product = (Product) dao.getOne(sql, params, new Product());
		return product;
	}

	@Override
	public void updateProduct(Product pro) {
		
		String sql = "update product set pname=?,market_price=?,shop_price=?,pimage=?,"
				+ "pdate=?,is_hot=?,pdesc=?,pflag=?,cid=? where pid=?";
		Object[] params = {pro.getPname(),pro.getMarket_price(),pro.getShop_price(),
				pro.getPimage(),pro.getPdate(),pro.getIs_hot(),pro.getPdesc(),
				pro.getPflag(),pro.getCid(),pro.getPid()};
		dao.update(sql, params);
		
	}

}
