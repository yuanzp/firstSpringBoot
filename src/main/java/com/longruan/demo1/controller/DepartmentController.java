package com.longruan.demo1.controller;

import java.util.List;

import com.longruan.demo1.dao.DepartmentDao;
import com.longruan.demo1.entity.Department;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class DepartmentController {
    @Autowired
    private DepartmentDao departmentDao;

    @GetMapping("/department")
    public List<Department> GetAll()
    {        
        return departmentDao.SelectAll();
    }

    @GetMapping("/department/{id}")
    public Department GetById(@PathVariable(value = "id") int id)
    {
        Department department=departmentDao.SelectOne(id);
        return department;
    }

    @PostMapping("/department")    
    public Boolean Add(@RequestBody Department department)
    {
        int result=departmentDao.Insert(department);
        return result>0;
    }

    @PutMapping("/department")
    public Boolean Edit(@RequestBody Department department)
    {
        return departmentDao.Update(department)>0;
    }

    @DeleteMapping("/department/{id}")
    public Boolean Remove(@PathVariable(value = "id") int id)
    {
        int result=departmentDao.Delete(id);
        return result>0;
    }
}
