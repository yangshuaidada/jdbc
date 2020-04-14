package com.example.jdbc.service;

import com.example.jdbc.entity.Goods;
import com.example.jdbc.mapper.GoodsMapper;
import com.example.jdbc.mapper.TextMapper;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author letsGo
 * @date 2020/4/13 15:27
 **/
@Service
public class GoodService {
    @Autowired(required = false)
    TextMapper textMapper;

    public Goods getById(long id){
        System.out.println("已经提交");
        System.out.println("追加提交");
        return textMapper.getGoodById(id);
    }
}
