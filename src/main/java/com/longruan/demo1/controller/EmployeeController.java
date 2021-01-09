package com.longruan.demo1.controller;

import java.util.List;

import com.longruan.demo1.dao.EmployeeDao;
import com.longruan.demo1.entity.Employee;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmployeeController {
    @Autowired
    private EmployeeDao employeeDao;

    @GetMapping("/employee")
    public List<Employee> GetAll()
    {
        return employeeDao.SelectAll();
    }

    @GetMapping("/employee/{id}")
    public Employee GetById(@PathVariable(value="id") int id)
    {
        return employeeDao.SelectOne(id);
    }
    @PostMapping("/employee")   
    public Boolean Add(@RequestBody Employee employee)
    {
        return employeeDao.Insert(employee)>0;
    }

    @PutMapping("/employee")
    public Boolean Edit(@RequestBody Employee employee)
    {
        return employeeDao.Update(employee)>0;
    }

    @DeleteMapping("/employee/{id}")
    public Boolean Remove(@PathVariable(value="id") int id)
    {
        return employeeDao.Delete(id)>0;
    }
}
