package com.example.jdbc.mapper;

import com.example.jdbc.entity.Goods;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

/**
 * @author letsGo
 * @date 2020/4/13  15:33
 **/
@Mapper
public interface TextMapper {

    @Select("select * from goods g where g.id=#{id}")
    public Goods getGoodById(@Param("id")long id);
}
