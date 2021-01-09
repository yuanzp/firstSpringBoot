package com.longruan.demo1.dao;

import java.util.List;

import com.longruan.demo1.entity.Employee;

import org.springframework.stereotype.Repository;

@Repository
public interface EmployeeDao {
    
    public List<Employee> SelectAll();
    public Employee SelectOne(int id);
    public int Insert(Employee employee);
    public int Delete(int id);
    public int Update(Employee employee); 
}
