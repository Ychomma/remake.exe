package com.example.mapper;


import com.example.entity.Talent;
import com.example.entity.huanglin;
import com.example.entity.huanglin2;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface TalentMapper1 {
    @Select("select * from talent")
    public List<Talent> find();

    @Select("select name , rarity from talent")
    public List<huanglin> find2();

    @Select("select propertychange from lifeevent")
    public List<huanglin2> find3();

    @Insert("Insert into talent values (#{id},#{name},#{rarity},#{property_change},#{talent_event_id})")
    public int insert(Talent talent);
}

