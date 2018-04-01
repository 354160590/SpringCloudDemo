package com.mes.loginserver.controller;
import com.mes.loginserver.entity.Student;
import com.mes.loginserver.service.StudentService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;
import java.util.List;

@Controller
@RequestMapping("/stu")
public class StudentController {

    private static final Logger logger = LoggerFactory.getLogger(StudentController.class);
    @Autowired
    private StudentService studentService;

    @RequestMapping("/list1")
    @ResponseBody
    public Student getStus() {
        logger.info("从数据库读取Student集合");
//        List<Student> a=studentService.getList();
//        a.forEach(i -> i.setBirthday(new Date()));
        Student student = new Student();
        student.setBirthday(new Date());
        student.setName("ccc");
        return student;
    }
}