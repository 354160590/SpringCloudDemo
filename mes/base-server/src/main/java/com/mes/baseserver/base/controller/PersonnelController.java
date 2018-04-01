package com.mes.baseserver.base.controller;

import com.mes.baseserver.base.dao.UserRepository;
import com.mes.baseserver.base.model.LyfBasePersonnel;
import com.mes.baseserver.base.model.UserTestInfobase;
import com.mes.baseserver.base.service.PersonnelService;
import com.mes.baseserver.utils.ExtMsg;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/personnelController")
public class PersonnelController {
    @Autowired
    public PersonnelService personnelService;
    @RequestMapping("/all")
    public List<UserTestInfobase> all(){
        return personnelService.findAllPersonnel();
    }
    @RequestMapping("/findByPerCodeOrPerName")
    public List findByPerCodeOrPerName(String param){
        return this.personnelService.findByPerCodeOrPerName(param);
    }
    @RequestMapping("/savePersonnel")
    public Object savePersonnel(LyfBasePersonnel per,String pId){
        ExtMsg em=new ExtMsg();
        String flag=this.personnelService.savePersonnel(per);
        if (flag!=null&&!"".equals(flag)) {
            em.setMsg("S");
        }
        else{
            em.setMsg("E");
        }
        return em;
    }
    @RequestMapping("/findLyfBasePersonnelById")
    public Object findLyfBasePersonnelById(String id){
        ExtMsg em=new ExtMsg();
        LyfBasePersonnel per= this.personnelService.findLyfBasePersonnelById(id);
        em.setData(per);
        return em;
    }
    @RequestMapping("/deleteByPerId")
    public Object deleteByPerId(String[] ids){
        ExtMsg em=new ExtMsg();
        em.setMsg(this.personnelService.deleteByPerId(ids));
        return em;
    }
}
