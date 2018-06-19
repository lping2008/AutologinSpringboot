package com.plin.autologin.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.plin.autologin.mapper.UserMapper;
import com.plin.autologin.pojo.User;
import com.plin.autologin.pojo.UserExample;
import com.plin.autologin.pojo.UserExample.Criteria;



@Service
public class UserServiceImpl implements IUserService{
	@Autowired
	private UserMapper userMapper;

	@Override
	public User login(String username,String password) {
		UserExample example = new UserExample();
		Criteria criteria = example.createCriteria();
		if(username!=null) {
			criteria.andUsernameEqualTo(username);
			List<User> list = userMapper.selectByExample(example );
			if (list!=null) {
				for (User user : list) {
					if(user.getPassword().equals(password)) {
						return user;				
					}				
				}
			}
		}
		return null;
	}
}
