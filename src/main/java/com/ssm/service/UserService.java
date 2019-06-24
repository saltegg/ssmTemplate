package com.ssm.service;

import com.ssm.entity.User;

public interface UserService {
    User findUserById(Long id);
    int insertUser(User user);
}
