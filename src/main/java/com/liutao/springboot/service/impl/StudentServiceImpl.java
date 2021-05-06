package com.liutao.springboot.service.impl;

import com.liutao.springboot.bean.Student;
import com.liutao.springboot.mapper.StudentMapper;
import com.liutao.springboot.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StudentServiceImpl implements StudentService {
    @Autowired
    private StudentMapper studentMapper;

    @Override
    public Student selectById(Integer id) {
        Student student = studentMapper.selectByPrimaryKey(id);
        return student;
    }
}
