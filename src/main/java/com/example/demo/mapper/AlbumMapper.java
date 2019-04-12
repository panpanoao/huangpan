package com.example.demo.mapper;

import com.example.demo.model.Album;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface AlbumMapper {

    @Select("select * from album order by album_time desc")
     List<Album> findAll();
}
