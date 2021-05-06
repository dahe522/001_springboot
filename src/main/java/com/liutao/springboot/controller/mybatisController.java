package com.liutao.springboot.controller;

import com.liutao.springboot.bean.Student;
import com.liutao.springboot.mapper.StudentMapper;
import com.liutao.springboot.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class mybatisController {
    @Autowired
    private StudentService studentService;

    @RequestMapping("/select")
    @ResponseBody
    public Student selectStudent(Integer id) {
        Student student = studentService.selectById(id);
        return student;
    }

}
