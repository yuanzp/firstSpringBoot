package com.longruan.demo1.dao;

import java.util.List;

import com.longruan.demo1.entity.Department;

import org.springframework.stereotype.Repository;

@Repository
public interface DepartmentDao {
    public int Insert(Department department);
    public int Delete(long id);
    public int Update(Department department);
    public Department SelectOne(long id);
    public List<Department> SelectAll();
}
