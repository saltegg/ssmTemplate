package com.ssm.dao;

import com.ssm.entity.User;

import javax.jws.soap.SOAPBinding;

public interface UserMapper {

    User findUserById(Long id);

    int insert(User user);

    int deleteUserById(Long id);

    int updateUserById(User user);

}
