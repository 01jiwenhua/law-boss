package com.shx.lawboss.service;

import com.shx.lawboss.dao.entity.User;

public interface UserService {
    void login(String userName, String password);
    User getUserByName(String userName);

}
