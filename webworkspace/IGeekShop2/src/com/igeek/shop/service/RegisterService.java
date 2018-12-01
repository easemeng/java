package com.igeek.shop.service;

import com.igeek.shop.dao.RegisterDao;
import com.igeek.shop.entity.User;

public class RegisterService {
	
	private RegisterDao dao = new RegisterDao();
	
	public boolean rigest(User user){
		// ҵ���߼�
		int row = 0;
		// Dao�㷵�ص������ݿ�Ӱ������
		row = RegisterDao.rigest(user);
		
		return row>0?true:false;
	
	}

	public boolean active(String activeCode) {
		// �����û�״̬
		try {
			dao.active(activeCode);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return false;
		}
		return true;
		
	}

	public boolean checkUsername(String username) {
		
		// ����dao�����ж��Ƿ����
		Long count = 0L;
		try {
			count = dao.checkUsername(username);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return count>0?true:false;
	}
	
	public boolean checkCode(String sessionCode,String checkCode){
		
		boolean fg = false;
		
		if(sessionCode != null && checkCode.equals(sessionCode)){
			fg = true;
		}else{
			fg = false;
		}
		
		return fg;
		
	}

}
