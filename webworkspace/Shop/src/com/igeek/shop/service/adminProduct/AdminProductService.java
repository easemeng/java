package com.igeek.shop.service.adminProduct;

import java.util.List;

import com.igeek.shop.entity.Category;
import com.igeek.shop.entity.Product;

public interface AdminProductService {

	List<Product> getProductList();

	List<Category> getCategoryList();

	void delete(String pid);

	void addProduct(Product pro);

	Product zapisa(String pid);

	void updateProduct(Product pro);
	
}
