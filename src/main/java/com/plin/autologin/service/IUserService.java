package com.plin.autologin.service;

import com.plin.autologin.pojo.User;

public interface IUserService {
	public User login(String username,String password);

}
