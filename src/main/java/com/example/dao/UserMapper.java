package com.example.dao;



import com.example.pojo.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface UserMapper {
   //默认显示全部信息
   List<User> getUsers();
   //添加
   int dubAdd(User user);
//
   Integer DelDub(Integer id);

   User getUpDub(@Param("id") Integer id);

}
