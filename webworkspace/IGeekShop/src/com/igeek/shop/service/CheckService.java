package com.igeek.shop.service;

import com.igeek.shop.entity.User;

public interface CheckService {

	boolean checkCode(String sessionCode, String checkCode);

	boolean checkUsername(String username);

	User getUser(String username);

}
