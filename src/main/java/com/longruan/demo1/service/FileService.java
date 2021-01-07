package com.longruan.demo1.service;

import java.util.ArrayList;
import java.util.List;

import com.longruan.demo1.entity.File;

import org.springframework.stereotype.Service;
@Service
public class FileService {
    
    public List<File> GetList()
    {
        ArrayList<File> list=new ArrayList<File>();
        File file=new File();
        file.setFilename("file1");
        list.add(file);

        return list;
    }
}
