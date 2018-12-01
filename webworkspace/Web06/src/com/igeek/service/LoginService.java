package com.igeek.service;

import java.util.List;

import com.igeek.dao.BaseDao;
import com.igeek.domain.Product;
import com.igeek.domain.User;

// 负责书写SQL语句 完成复杂的逻辑业务	dao 跟 servlet 的桥梁
// servlet层(web层) ==> service层 ==> dao层
// MVC 设计模式	架构风格	Model 模型	view 视图		controller 控制器
public class LoginService {

	private static BaseDao<User> dao = new BaseDao<User>();
	private static BaseDao<Product> daoProduct = new BaseDao<Product>();
	
	// 如果账号密码存在 该方法返回true 否则返回false
	public User checkLogin(String loginName,String password){
		
		// 默认账号密码是错误的
		String sql = "select * from user where username = ? and password = ?";
		Object[] params = {loginName,password};
		// select * from user where username = xxxx and password = xxxx;
		// ???BaseDao 中的查询方法
		User user = (User) dao.getUserByOne(sql, params, new User());
		if(user != null){
			// 表示查询到用户 把查询到的用户数据 返回出去 (查询到的用户数据封装到user对象中)
			return user;
		}
		// 没有查询到数据 就是一个null
		return null;
	}
	
	// 封装一个方法	方法的作用就是 查询 Product 表中的5条数据
	public List<Product> getProductList(int index){
		
		String sql = "select * from product limit ?,5";
		Object[] params= {index};
		Object objectList = daoProduct.getList(sql, params, new Product());
		List<Product> productList = (List<Product>) objectList;
		return productList;
	}
}
