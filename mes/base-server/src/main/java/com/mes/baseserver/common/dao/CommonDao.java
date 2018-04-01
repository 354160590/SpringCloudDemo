package com.mes.baseserver.common.dao;

import java.io.Serializable;
import java.util.List;
import java.util.Map;

public interface CommonDao<T,ID> {
    public List findListBySql(String sql,Object...obj);
    public Map findOneBySql(String sql, Object...obj);
    public int updateBySql(String sql, Object...obj);
    public int[] batchBysqls(String[] sqls);
    public int[] batchByList(List list);
}
