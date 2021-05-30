package com.bootdo.wuliao.dao;

import com.bootdo.wuliao.domain.LiaocangDO;

import java.util.List;
import java.util.Map;

import com.bootdo.wuliao.domain.WuliaoVO;
import org.apache.ibatis.annotations.Mapper;

/**
 *
 * @author ktt
 * @email 1035964900@qq.com
 * @date 2020-12-21 17:09:17
 */
@Mapper
public interface LiaocangDao {

    LiaocangDO get(Integer id);

    List<LiaocangDO> list(Map<String,Object> map);

    /**
     * 查询所有
     * @return
     */
    //List<WuliaoVO> list();
    int count(Map<String,Object> map);

    int save(LiaocangDO liaocang);

    int update(LiaocangDO liaocang);

    int remove(Integer ID);

    int batchRemove(Integer[] ids);
}

