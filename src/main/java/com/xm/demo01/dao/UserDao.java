package com.xm.demo01.dao;

import com.xm.demo01.model.User;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

@Repository
@Mapper
public interface UserDao {

    void insertUser(User user);

}
