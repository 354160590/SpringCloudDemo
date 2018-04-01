package com.mes.baseserver.common.service;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Map;

@Service("commonService")
@Transactional
public interface CommonService {
    public List findListBySql(String sql, Object...obj);
    public Map findOneBySql(String sql, Object...obj);
    public int updateBySql(String sql, Object...obj);
    public int[] batchBysqls(String[] sqls);
    public int[] batchByList(List list);
}
