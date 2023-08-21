package com.tge.qq;

import java.io.Serializable;

/**
 * ClassName: User
 * Package: com.tge.qq
 * Description:
 *
 * @Author: tge
 * @Create: 2023/8/18 - 22:38
 * Version:
 */
public class User implements Serializable{
    private static final long serialVersionUID = 1221015556669564663L;
    private String userId;
    private String password;

    public User(String userId, String password) {
        this.userId = userId;
        this.password = password;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
