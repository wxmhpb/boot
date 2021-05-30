package com.bootdo.wuliao.dao;

import com.bootdo.wuliao.domain.LiaocangDO;
import com.bootdo.wuliao.domain.WuliaoDO;
import com.bootdo.wuliao.domain.WuliaoVO;
import com.bootdo.wuliao.domain.WuliaopaixuDO;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
import java.util.Map;

@Mapper
public interface WuliaopaixuDao {

    //List<LiaocangDO> list(Map<String,Object> map);

    /**
     * 查询所有
     * @return
     */

    WuliaopaixuDO get(Integer id);
    List<WuliaopaixuDO> list();

    int count(Map<String,Object> map);

}
