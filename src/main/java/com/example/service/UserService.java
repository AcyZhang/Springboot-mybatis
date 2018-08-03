package com.example.service;



import com.example.pojo.User;

import java.util.List;

/**
 * Created by AcY on 2018/4/25.
 */
public interface UserService {
        List<User> getUsers();
        //添加(图片上传)
        int dubAdd(User user);
        Integer DelDub(Integer id);
        //
        User getUpDub(Integer id);
}
