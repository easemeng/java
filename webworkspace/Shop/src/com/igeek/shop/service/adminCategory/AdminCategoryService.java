package com.igeek.shop.service.adminCategory;

import java.util.List;

import com.igeek.shop.entity.Category;

public interface AdminCategoryService {

	List<Category> getCategoryList();

	void addCategory(Category category);

	void delete(String cid);

}
