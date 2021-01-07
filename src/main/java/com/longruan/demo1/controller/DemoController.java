package com.longruan.demo1.controller;

import java.util.List;

import com.longruan.demo1.entity.File;
import com.longruan.demo1.service.FileService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/demo")
public class DemoController {

    @Autowired
    private FileService fileService;

    public DemoController()
    {
        fileService=new    FileService();
    }
    @RequestMapping("/list")
    public List<File> GetAll()
    {
        return fileService.GetList();
    }
    
}
