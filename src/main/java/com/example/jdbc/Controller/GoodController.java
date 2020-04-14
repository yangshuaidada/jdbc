package com.example.jdbc.Controller;

import com.example.jdbc.entity.Goods;
import com.example.jdbc.mapper.GoodsMapper;
import com.example.jdbc.service.GoodService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author letsGo
 * @date 2020/4/13 14:29
 **/
@RestController
public class GoodController {
    /*@Autowired
    GoodService goodService;*/
    @Autowired
    GoodsMapper goodsMapper;

    @GetMapping("getGood")
    public String getGood(){
        List<Goods> goodsList = goodsMapper.getGoodById();
        for (Goods good:goodsList){
            System.out.println(good.toString());
        }
        return  "Success";
    }

    @GetMapping("delete/{id}")
    public String deleteGood(@PathVariable("id") long id){
        int a = goodsMapper.deleteGood(id);
        System.out.println(a);
        return "delete success";
    }
}
