package com.mes.baseserver.base.controller;

import com.mes.baseserver.base.dao.UserRepository;
import com.mes.baseserver.base.model.UserTestInfobase;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UserController {
    @Autowired
    public UserRepository userJpaDao;
    @RequestMapping("/all")
    public List<UserTestInfobase> all(){
        return userJpaDao.findAll();
    }
}
