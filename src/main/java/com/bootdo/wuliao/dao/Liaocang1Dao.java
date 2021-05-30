package com.bootdo.wuliao.dao;

import com.bootdo.wuliao.domain.Liaocang1DO;
import com.bootdo.wuliao.domain.LiaocangDO;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
import java.util.Map;

/**
 *
 * @author ktt
 * @email 1035964900@qq.com
 * @date 2020-12-21 17:09:17
 */
@Mapper
public interface Liaocang1Dao {

    Liaocang1DO get(Integer id);

    List<Liaocang1DO> list1(Map<String,Object> map);

    /**
     * 查询所有
     * @return
     */
    //List<WuliaoVO> list();


    int count(Map<String,Object> map);

    int save(Liaocang1DO liaocang);

    int update(Liaocang1DO liaocang);

    int remove(Integer ID);

    int batchRemove(Integer[] ids);
}

