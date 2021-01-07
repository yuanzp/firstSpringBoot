package com.longruan.demo1;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.List;

import com.longruan.demo1.dao.DepartmentDao;
import com.longruan.demo1.entity.Department;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class DepartmentDaoTest {
    @Autowired
    private DepartmentDao departmentDao;

    @Test
    void TestSelectAll()
    {
        List<Department> list=departmentDao.SelectAll();

        assertEquals(0, list.size());
    }

}
