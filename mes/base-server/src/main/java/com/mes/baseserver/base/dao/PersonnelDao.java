package com.mes.baseserver.base.dao;

import com.mes.baseserver.base.model.LyfBasePersonnel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

public interface PersonnelDao extends JpaRepository<LyfBasePersonnel, Long> {
    List findByPerCodeOrPerName(String perCode, String perName);
    List findByPerId(String perId);
}
