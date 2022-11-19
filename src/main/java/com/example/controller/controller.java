package com.example.controller;


import com.example.entity.Talent;
import com.example.mapper.TalentMapper1;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class controller {
    @Autowired
    private TalentMapper1 talentMapper;

    @GetMapping("/user")
    public List query() {
        List<Talent> list = talentMapper.find();
        System.out.println(list);
        return list;
    }

    @PostMapping("/insert")
    public String insert(Talent talent) {
        int i = talentMapper.insert(talent);
        if (i > 0) {
            return "插入成功";
        } else {
            return "插入失败";
        }
    }
}
