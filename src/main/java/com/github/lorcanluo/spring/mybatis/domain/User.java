package com.github.lorcanluo.spring.mybatis.domain;

import java.io.Serializable;

public class User implements Serializable {
    private static final long serialVersionUID = 8751282105532159742L;

    private int userId;

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }
}
