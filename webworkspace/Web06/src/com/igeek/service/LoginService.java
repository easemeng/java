package com.igeek.service;

import java.util.List;

import com.igeek.dao.BaseDao;
import com.igeek.domain.Product;
import com.igeek.domain.User;

// ������дSQL��� ��ɸ��ӵ��߼�ҵ��	dao �� servlet ������
// servlet��(web��) ==> service�� ==> dao��
// MVC ���ģʽ	�ܹ����	Model ģ��	view ��ͼ		controller ������
public class LoginService {

	private static BaseDao<User> dao = new BaseDao<User>();
	private static BaseDao<Product> daoProduct = new BaseDao<Product>();
	
	// ����˺�������� �÷�������true ���򷵻�false
	public User checkLogin(String loginName,String password){
		
		// Ĭ���˺������Ǵ����
		String sql = "select * from user where username = ? and password = ?";
		Object[] params = {loginName,password};
		// select * from user where username = xxxx and password = xxxx;
		// ???BaseDao �еĲ�ѯ����
		User user = (User) dao.getUserByOne(sql, params, new User());
		if(user != null){
			// ��ʾ��ѯ���û� �Ѳ�ѯ�����û����� ���س�ȥ (��ѯ�����û����ݷ�װ��user������)
			return user;
		}
		// û�в�ѯ������ ����һ��null
		return null;
	}
	
	// ��װһ������	���������þ��� ��ѯ Product ���е�5������
	public List<Product> getProductList(int index){
		
		String sql = "select * from product limit ?,5";
		Object[] params= {index};
		Object objectList = daoProduct.getList(sql, params, new Product());
		List<Product> productList = (List<Product>) objectList;
		return productList;
	}
}
