package com.mes.baseserver.base.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import com.alibaba.fastjson.annotation.JSONField;
import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
public class UserTestInfobase {
    @Id
    @GeneratedValue
    private Long id;
    private String name;
    private String password;
    private String passwordName;
    private Date brithday;

    public UserTestInfobase() {
    }

    public UserTestInfobase(String name, String password, String passwordName, Date brithday) {
        this.name = name;
        this.password = password;
        this.brithday = brithday;
        this.passwordName = passwordName;
    }

    public String getPasswordName() {
        return passwordName;
    }

    public void setPasswordName(String passwordName) {
        this.passwordName = passwordName;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Date getBrithday() {
        return brithday;
    }

    public void setBrithday(Date brithday) {
        this.brithday = brithday;
    }
}