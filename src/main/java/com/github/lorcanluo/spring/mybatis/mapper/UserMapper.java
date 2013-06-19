package com.github.lorcanluo.spring.mybatis.mapper;

import com.github.lorcanluo.spring.mybatis.domain.User;

public interface UserMapper {
    //    @Select("SELECT * FROM userTable WHERE userId = #{userId}")
//    User getUser(@Param("userId") int userId);
    User getUser(int userId);
}
