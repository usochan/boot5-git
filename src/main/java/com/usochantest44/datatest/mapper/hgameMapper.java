package com.usochantest44.datatest.mapper;

import com.usochantest44.datatest.pojo.HgameNode;
import com.usochantest44.datatest.pojo.hgame;
import com.usochantest44.datatest.pojo.uso;
import org.springframework.stereotype.Repository;
import tk.mybatis.mapper.common.Mapper;

@Repository
public interface hgameMapper extends Mapper<hgame> {


    public hgame findkeyByName(Integer id);


    public HgameNode selectUsochan(int hid);
}
