package com.lz.entity;

import org.hibernate.annotations.*;

/**
 * Created by Maven on 2016/2/17.
 */
@javax.persistence.Entity
@javax.persistence.Table(name = "user")
@DynamicInsert
@DynamicUpdate
public class User extends IdEntity {

    private String userName;

    private String passWord;

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassWord() {
        return passWord;
    }

    public void setPassWord(String passWord) {
        this.passWord = passWord;
    }
}
