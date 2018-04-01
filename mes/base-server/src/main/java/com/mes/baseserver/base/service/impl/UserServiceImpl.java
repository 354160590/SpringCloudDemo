package com.mes.baseserver.base.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.mes.baseserver.base.dao.UserRepository;
import com.mes.baseserver.base.service.UserService;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @ClassName UserServiceImpl
 * @author abel
 * @date 2016年11月10日
 */
@Service("UserService")
@Transactional
public class UserServiceImpl implements UserService {
    @Autowired
    public UserRepository userJpaDao;

}