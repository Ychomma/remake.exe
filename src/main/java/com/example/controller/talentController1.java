package com.example.controller;


import com.example.entity.Talent;
import org.springframework.web.bind.annotation.*;

@RestController
public class talentController1 {
    @GetMapping("/talent/{id}")
    public String getTalentById(@PathVariable int id) {
        System.out.println(id);
        return "根据ID获取天赋";
    }

    @PostMapping("/talent")
    public String save(Talent talent) {
        return "添加天赋";
    }

    @PutMapping("/talent")
    public String update(Talent talent) {
        return "更新天赋";
    }

    @DeleteMapping("/talent/{id}")
    public String deleteById(@PathVariable int id) {
        return "根据ID删除天赋";
    }

}

















