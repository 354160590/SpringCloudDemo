package com.mes.baseserver.common.service.impl;
import com.mes.baseserver.common.dao.CommonDao;
import com.mes.baseserver.common.service.CommonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Map;

@Service("commonService")
@Transactional
public class CommonServiceImpl implements CommonService{
    @Autowired
    private CommonDao commonDao;
    @Override
    public List findListBySql(String sql, Object... obj) {
        return this.commonDao.findListBySql(sql,obj);
    }
    @Override
    public Map findOneBySql(String sql, Object...obj){
        return this.commonDao.findOneBySql(sql,obj);
    }
    @Override
    public int updateBySql(String sql, Object...obj){
        return this.commonDao.updateBySql(sql,obj);
    }
    @Override
    public int[] batchBysqls(String[] sqls){
        return this.commonDao.batchBysqls(sqls);
    }
    @Override
    public int[] batchByList(List list){
        return this.commonDao.batchByList(list);
    }
}
