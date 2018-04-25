package com.example.service;


import com.example.dao.UserMapper;
import com.example.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class UserServiceImpl implements UserService {

	@Autowired
	private UserMapper userMapper;

	// 需要自己定义Mapper文件中的方法

	public List<User> getUsers() {

	return userMapper.getUsers();

	}


}
