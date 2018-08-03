package com.example.service;


import com.alibaba.dubbo.config.annotation.Service;
import com.example.dao.UserMapper;
import com.example.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;


import java.util.List;


@Service
@Component
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;

    // 需要自己定义Mapper文件中的方法

    @Override
    public User getUpDub(Integer id) {
        return userMapper.getUpDub(id);
    }

    @Override
    public Integer DelDub(Integer id) {
        return userMapper.DelDub(id);
    }

    public List<User> getUsers() {

        return userMapper.getUsers();

    }

    @Override
    public int dubAdd(User user) {
        return userMapper.dubAdd(user);
    }
}
