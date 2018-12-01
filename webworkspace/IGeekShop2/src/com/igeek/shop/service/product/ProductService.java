package com.igeek.shop.service.product;

import java.util.List;

import com.igeek.shop.entity.Product;

public interface ProductService {

	List<Product> getProductList();

	void delete(String pid);

	void addProduct(Product Product);

	Product updateOne(String pid);

	void updateProduct(Product pro);

}
