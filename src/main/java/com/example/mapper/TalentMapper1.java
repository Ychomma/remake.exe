package com.example.mapper;


import com.example.entity.Talent;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface TalentMapper1 {
    @Select("select * from Talent")
    public List<Talent> find();

    @Insert("Insert into talent values (#{id},#{name},#{rarity},#{property_change},#{talent_event_id})")
    public int insert(Talent talent);
}
