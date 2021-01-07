package com.longruan.demo1.controller;

import java.util.List;

import com.longruan.demo1.dao.DepartmentDao;
import com.longruan.demo1.entity.Department;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/department")
public class DepartmentController {
    @Autowired
    private DepartmentDao departmentDao;

    @RequestMapping("/list")
    public List<Department> GetAll()
    {
        
        return departmentDao.SelectAll();
    }
}
