package com.shx.lawboss.service.impl;

import com.shx.lawboss.dao.entity.User;
import com.shx.lawboss.dao.entity.UserExample;
import com.shx.lawboss.dao.mapper.UserMapper;
import com.shx.lawboss.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("userService")
public class UserServiceImpl implements UserService{
    @Autowired
    private UserMapper userMapper;
    @Override
    public void login(String userName, String password) {

    }

    @Override
    public User getUserByName(String userName) {
        UserExample example = new UserExample();
        UserExample.Criteria criteria = example.createCriteria();
        criteria.andLoginNameEqualTo(userName);
        List<User> users = userMapper.selectByExample(example);
        if (users.size() != 0) {
            return users.get(0);
        } else {
            return null;
        }
    }
}
