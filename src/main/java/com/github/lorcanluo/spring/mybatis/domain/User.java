package com.github.lorcanluo.spring.mybatis.domain;

import java.io.Serializable;

public class User implements Serializable {
    private static final long serialVersionUID = 8751282105532159742L;

    private int id;

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
