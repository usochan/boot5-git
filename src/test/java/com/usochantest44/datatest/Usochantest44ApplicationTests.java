package com.usochantest44.datatest;

import com.usochantest44.datatest.mapper.hgameMapper;
import com.usochantest44.datatest.mapper.usoMapper;
import com.usochantest44.datatest.pojo.HgameNode;
import com.usochantest44.datatest.pojo.hgame;
import com.usochantest44.datatest.pojo.uso;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import tk.mybatis.mapper.entity.Example;

import java.util.List;

@SpringBootTest
@RunWith(SpringRunner.class)
class Usochantest44ApplicationTests {

    @Autowired
    usoMapper usoMapper;

    @Autowired
    hgameMapper hgameMapper;


    @Test
    void contextLoads() {

        Example example = new Example(uso.class);
        Example.Criteria criteria = example.createCriteria();
        uso u2 = new uso();
        u2.setName("谎言");
        criteria.andEqualTo("name", u2.getName());
        List<uso> usos = usoMapper.selectByExample(example);
        System.out.println(usos.get(0).toString());
    }

    @Test
    public void test1(){

        HgameNode hgameNode = hgameMapper.selectUsochan(1);

        System.out.println(hgameNode.toString());
    }


}
