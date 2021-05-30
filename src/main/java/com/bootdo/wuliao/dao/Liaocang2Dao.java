package com.bootdo.wuliao.dao;

import com.bootdo.wuliao.domain.Liaocang2DO;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
import java.util.Map;

/**
 *
 * @author ktt
 * @email 2035964900@qq.com
 * @date 2020-22-22 27:09:27
 */
@Mapper
public interface Liaocang2Dao {

    Liaocang2DO get(Integer id);

    List<Liaocang2DO> list2(Map<String,Object> map);

    /**
     * 查询所有
     * @return
     */
    //List<WuliaoVO> list();


    int count(Map<String,Object> map);

    int save(Liaocang2DO liaocang);

    int update(Liaocang2DO liaocang);

    int remove(Integer ID);

    int batchRemove(Integer[] ids);
}

