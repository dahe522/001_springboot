package com.liutao.springboot.service;

import com.liutao.springboot.bean.Student;
import org.springframework.beans.factory.annotation.Autowired;

public interface StudentService {
    Student selectById(Integer id);
}
