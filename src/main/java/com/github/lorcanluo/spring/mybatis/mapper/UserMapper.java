package com.github.lorcanluo.spring.mybatis.mapper;

import com.github.lorcanluo.spring.mybatis.domain.User;

public interface UserMapper {
    User getUser(int userId);
}
