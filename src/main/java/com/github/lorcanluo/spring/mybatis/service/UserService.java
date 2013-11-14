package com.github.lorcanluo.spring.mybatis.service;

import com.github.lorcanluo.spring.mybatis.domain.User;
import com.github.lorcanluo.spring.mybatis.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    @Autowired
    private UserMapper userMapper;

    public User getUser(int userId) {
        return userMapper.getUser(userId);
    }
}
