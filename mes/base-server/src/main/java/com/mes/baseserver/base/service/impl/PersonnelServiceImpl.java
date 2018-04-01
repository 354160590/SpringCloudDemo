package com.mes.baseserver.base.service.impl;

import com.mes.baseserver.base.dao.PersonnelDao;
import com.mes.baseserver.base.model.LyfBasePersonnel;
import com.mes.baseserver.base.service.PersonnelService;
import com.mes.baseserver.common.service.impl.CommonServiceImpl;
import com.mes.baseserver.utils.FotmatUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service("personnelService")
@Transactional
public class PersonnelServiceImpl extends CommonServiceImpl implements PersonnelService{
    @Autowired
    public PersonnelDao personnelDao;
    public List findAllPersonnel(){
            return personnelDao.findAll();
    }
    public List findByPerCodeOrPerName(String param){
       return this.personnelDao.findByPerCodeOrPerName(param,param);
    }
    public String savePersonnel(LyfBasePersonnel per){
        LyfBasePersonnel per1=this.personnelDao.save(per);
        return per1.getPerId();
    }
    public LyfBasePersonnel findLyfBasePersonnelById(String id){
        List<LyfBasePersonnel> list=this.personnelDao.findByPerId(id);
        LyfBasePersonnel per=new LyfBasePersonnel();
        if(list!=null&&list.size()>0){
            per=(LyfBasePersonnel) list.get(0);
        }
        return per;
    }
    public String deleteByPerId(String[] ids){
        String msg="S";
        if(ids!=null&&ids.length>0){
//            String perIds=StringUtils.join(ids, ",");
            String perIds= FotmatUtil.ArrayToString(ids);
            String sql="delete lyf_base_personnel a where a.per_id in ("+perIds+")";
            int a=this.updateBySql(sql);
            if(a==0){
                msg="删除失败！";
            }
        }else{
            msg="未查询到该数据！";
        }

        return msg;
    }

}
