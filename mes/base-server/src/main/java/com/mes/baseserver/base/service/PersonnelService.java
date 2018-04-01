package com.mes.baseserver.base.service;

import com.mes.baseserver.base.model.LyfBasePersonnel;
import com.mes.baseserver.common.service.CommonService;

import java.util.List;

public interface PersonnelService extends CommonService {
    public List findAllPersonnel();
    public String savePersonnel(LyfBasePersonnel per);
    public LyfBasePersonnel findLyfBasePersonnelById(String id);
    public List findByPerCodeOrPerName(String param);
    public String deleteByPerId(String[] ids);
}
