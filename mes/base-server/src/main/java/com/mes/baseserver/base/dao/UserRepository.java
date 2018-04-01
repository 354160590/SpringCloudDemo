package com.mes.baseserver.base.dao;


import com.mes.baseserver.base.model.UserTestInfobase;
import org.springframework.data.jpa.repository.JpaRepository;
public interface UserRepository extends JpaRepository<UserTestInfobase, Long> {

}