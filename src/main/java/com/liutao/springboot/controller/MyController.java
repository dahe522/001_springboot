package com.liutao.springboot.controller;

import com.liutao.springboot.bean.Student;
import com.liutao.springboot.config.a;
import com.liutao.springboot.mapper.StudentMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

import java.util.HashMap;
import java.util.Map;

@Controller
public class MyController {
    @Autowired
    private a abc;
    @Autowired
    private StudentMapper studentMapper;

    @RequestMapping("/spring")
    @ResponseBody
    public String Hello() {
        String s = "张三";
        return abc.getName();
    }

    @RequestMapping("/add")
    public int add() {
        Student stu = new Student();
        stu.setName("lihuili");
        stu.setAge(12);
        int insert = studentMapper.insert(stu);

        return insert;

    }

    @RequestMapping("/detail/{id}/{age}")
    @ResponseBody
    public Object student(@PathVariable("id") Integer id,
                          @PathVariable("age") Integer age) {
        Map<String, Object> map = new HashMap<>();
        map.put("id", id);
        map.put("age", age);
        return map;
    }

}
