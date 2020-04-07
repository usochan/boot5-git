package com.usochantest44.datatest.controller;


import com.alibaba.fastjson.JSON;
import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.usochantest44.datatest.mapper.usoMapper;
import com.usochantest44.datatest.pojo.uso;
import jdk.nashorn.internal.parser.JSONParser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import tk.mybatis.mapper.entity.Example;

import java.util.List;
import java.util.Map;

@RestController
public class testcontroller {


    @Autowired
    private usoMapper usoMapper;

    @PostMapping("/test2")
    public String test2(@RequestBody Map<String, Object> searchMap, int page, int size) {

        System.out.println(page+""+size);

        PageHelper.startPage(page,size);


        Example example = new Example(uso.class);

        Example.Criteria criteria = example.createCriteria();
        if (searchMap.get("name") != null && !"".equals(searchMap.get("name"))) {
            criteria.andEqualTo("name", searchMap.get("name"));
        }
        if (searchMap.get("uid") != null&&!"".equals(searchMap.get("uid"))) {
            criteria.andEqualTo("uid", searchMap.get("uid"));
        }

        Page<uso> usos = (Page<uso>) usoMapper.selectByExample(example);




        String jsonString = JSON.toJSONString(usos.getResult());

        return jsonString;
    }


}
