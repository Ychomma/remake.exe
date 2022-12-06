package com.example.ruangong.controller;

import com.example.ruangong.entity.Returnvacation;
import com.example.ruangong.entity.Vacation;
import com.example.ruangong.jwt.JwtUtils;
import com.example.ruangong.mapper.vacationmapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

@CrossOrigin
@RestController
@RequestMapping
public class vacationcontroller {
      @Autowired
      private vacationmapper vac;
      @GetMapping("/choices")
      public List<Returnvacation> vacation_event(){
        List<Vacation> ac = vac.find();
        List<Returnvacation> a = new ArrayList<>();
        int flag[] = new int[ac.size()];
        for (int i = 0; i < ac.size(); i++) {
            flag[i] = 0;
        }
        for (; a.size() < 7; ) {
            Returnvacation b = new Returnvacation();
            Random r = new Random();
            int number = r.nextInt(ac.size());
            if (flag[number] == 0) {
                b.setContent(ac.get(number).getContent());
                String[] temp1 = ac.get(number).getProperty_change().split(" ");
                int[] temp2 = new int[temp1.length];
                for(int j=0;j<temp1.length;j++)
                    temp2[j]=Integer.parseInt(temp1[j]);
                b.setPropertyChange(temp2);
                a.add(b);
                flag[number] = 1;
            } else continue;
        }
            return a;
    }
    }

