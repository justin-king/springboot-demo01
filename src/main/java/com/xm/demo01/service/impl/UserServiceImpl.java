package com.xm.demo01.service.impl;

import com.xm.demo01.dao.UserDao;
import com.xm.demo01.model.User;
import com.xm.demo01.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional(readOnly = true)
public class UserServiceImpl implements UserService {

    @Autowired
    private UserDao userDao;

    @Override
    @Transactional
    public void addUser(User user) {
        userDao.insertUser(user);
    }

}
