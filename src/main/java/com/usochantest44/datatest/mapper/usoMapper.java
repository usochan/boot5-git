package com.usochantest44.datatest.mapper;


import com.usochantest44.datatest.pojo.uso;
import org.springframework.stereotype.Repository;
import tk.mybatis.mapper.common.Mapper;

@Repository
public interface usoMapper extends Mapper<uso> {

    public uso findkeyByName(String name);

}
