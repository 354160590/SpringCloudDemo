package com.mes.baseserver.common.dao.impl;

import com.mes.baseserver.common.dao.CommonDao;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;
import java.util.Map;
/**
 * @ClassName: CommonDaoImpl
 * @Description: 公用类
 * @Author: lyf
 * @CreateDate: 2018/4/1 17:59
 */
@Repository
public class CommonDaoImpl implements CommonDao {
    private static final Logger logger = Logger.getLogger(CommonDaoImpl.class);
    @Autowired
    private JdbcTemplate jdbcTemplate;
    @Override
    public List findListBySql(String sql, Object... obj) {
        return this.jdbcTemplate.queryForList(sql,obj);
    }
    @Override
    public Map findOneBySql(String sql, Object...obj){
        return this.jdbcTemplate.queryForMap(sql,obj);
    }
    @Override
    public int updateBySql(String sql, Object...obj){
        return this.jdbcTemplate.update(sql,obj);
    }
    @Override
    public int[] batchBysqls(String[] sqls){
        return this.jdbcTemplate.batchUpdate(sqls);
    }
    @Override
    public int[] batchByList(List list){
        String[] sqls=(String[])list.toArray(new String[list.size()]);
        return this.jdbcTemplate.batchUpdate(sqls);
    }

}
