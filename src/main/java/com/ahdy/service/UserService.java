package com.ahdy.service;


import com.ahdy.domain.User;

import java.util.List;

public interface UserService{


    int deleteByPrimaryKey(Integer id);

    User insert(User user);


    User selectByPrimaryKey(Integer id);


    User updateByPrimaryKey(User user);

    List<User> queryAllUser();

}
