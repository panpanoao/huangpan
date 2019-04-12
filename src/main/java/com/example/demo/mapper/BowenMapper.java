package com.example.demo.mapper;

import com.example.demo.model.Bowen;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface BowenMapper {

    @Select("select * from bowen order by create_time desc")
    List<Bowen> findAll();
}
