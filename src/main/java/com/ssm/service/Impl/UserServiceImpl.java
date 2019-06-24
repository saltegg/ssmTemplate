package com.ssm.service.Impl;

import com.ssm.dao.UserMapper;
import com.ssm.entity.User;
import com.ssm.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;

    @Override
    public User findUserById(Long id) {

        return userMapper.findUserById(id);
    }

    @Override
    public int insertUser(User user) {
        return userMapper.insert(user);
    }
}
