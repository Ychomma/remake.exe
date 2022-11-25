package com.example.controller;

import com.example.entity.huanglin;
import com.example.entity.huanglin2;
import com.example.mapper.TalentMapper1;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class talent_lifeeventController {

    @Autowired
    private TalentMapper1 talentMapper1;

    @GetMapping("/tl")
    public List query1() {
        List<huanglin> list = talentMapper1.find2();
        List<huanglin2> list1 = talentMapper1.find3();
        for (int i = 0; i < list.size(); i++) {
            huanglin huanglin = list.get(i);
            huanglin2 huanglin2 = list1.get(i);
            huanglin.setPropertychange(huanglin2.getpropertychange());
        }
        System.out.println(list);
        System.out.println(list.size());
        return list;
    }


}
