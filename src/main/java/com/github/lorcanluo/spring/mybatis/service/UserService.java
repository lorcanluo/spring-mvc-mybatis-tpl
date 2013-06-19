package com.github.lorcanluo.spring.mybatis.service;

import com.github.lorcanluo.spring.mybatis.mapper.UserMapper;
import com.github.lorcanluo.spring.mybatis.domain.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    @Autowired
    private UserMapper userMapper;

    public User getUser( int userId){
        return this.userMapper.getUser(userId);
    }
}
