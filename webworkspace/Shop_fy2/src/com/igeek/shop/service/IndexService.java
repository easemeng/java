package com.igeek.shop.service;

import java.util.List;

import com.igeek.shop.entity.Category;
import com.igeek.shop.entity.PageBean;

public interface IndexService {

	PageBean getPageBean(int currentPageNumber);

	List<Category> getCategoryList();

	long getProductNumberByCid(String cid);

	PageBean getPageBeanByCategory(int currentPageNumber, int pageSize, long productNumberByCid, String cid);

}
