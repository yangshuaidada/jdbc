package com.example.jdbc.mapper;

import com.example.jdbc.entity.Goods;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.springframework.context.annotation.Bean;

import java.util.List;

/**
 * @author letsGo
 * @date 2020/4/13 14:13
 **/

@Mapper
public interface GoodsMapper {

    @Select("select * from goods ")
    public List<Goods> getGoodById();

    @Delete("delete from goods where id = #{id}")
    public int deleteGood(long id);
}
