package com.zhangwenit.rabbitmq.dto;

import java.io.Serializable;

/**
 * @Description
 * @Author ZWen
 * @Date 2019/9/15 5:29 PM
 * @Version 1.0
 **/
public class User implements Serializable {
    static final long serialVersionUID = 42L;

    private String name;

    private String pwd;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPwd() {
        return pwd;
    }

    public void setPwd(String pwd) {
        this.pwd = pwd;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", pwd='" + pwd + '\'' +
                '}';
    }
}