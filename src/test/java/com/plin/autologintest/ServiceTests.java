package com.plin.autologintest;

import java.util.List;

import javax.transaction.Transactional;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.plin.autologin.AutologinSpringbootApplication;
import com.plin.autologin.mapper.UserMapper;
import com.plin.autologin.pojo.User;
import com.plin.autologin.pojo.UserExample;
import com.plin.autologin.pojo.UserExample.Criteria;


@RunWith(SpringRunner.class)
@SpringBootTest(classes=AutologinSpringbootApplication.class)
public class ServiceTests {
		@Autowired
		private UserMapper userMapper;

		@Test
		public void contextLoads() {
		}

		
		@Test
		@Transactional
		public void testUserMapper() {
//			User user = userMapper.selectByPrimaryKey(1);
//			System.out.println(user);
			String username = "aaa";
			String password = "123";
			UserExample example = new UserExample();
			Criteria criteria = example.createCriteria();
			if(username!=null) {
				criteria.andUsernameEqualTo(username);
				List<User> list = userMapper.selectByExample(example);
				if (list!=null) {
					for (User user : list) {
						if(user.getPassword().equals(password)) {
							System.out.println(user);
						}				
					}
				}
			}
		}

}
