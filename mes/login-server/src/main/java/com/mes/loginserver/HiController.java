package com.mes.loginserver;

import com.mes.loginserver.controller.StudentController;
import com.mes.loginserver.entity.Student;
import com.mes.loginserver.service.StudentService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class HiController {
    @Autowired
    SchedualServiceHi schedualServiceHi;
    @RequestMapping(value = "/hi",method = RequestMethod.GET)
    public String sayHi(@RequestParam String name){
        System.out.println("from feign");
        return schedualServiceHi.sayHiFromClientOne(name);
    }
    private static final Logger logger = LoggerFactory.getLogger(StudentController.class);

    private StudentService studentService;

    @RequestMapping("/list")
    public List<Student> getStus() {
        logger.info("从数据库读取Student集合");
        return studentService.getList();
    }
}
