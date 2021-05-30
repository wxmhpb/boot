package com.bootdo.wuliao.dao;

import com.bootdo.wuliao.domain.LiaocangyuliangbiaoDO;
import com.bootdo.wuliao.domain.WuliaoVO;
import com.bootdo.wuliao.domain.WuliaobaobiaoDO;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
import java.util.Map;

@Mapper
public interface WuliaobaobiaoDao {
    WuliaobaobiaoDO get(Integer id);

    List<WuliaoVO> list();

    int count(Map<String,Object> map);

    int save(WuliaobaobiaoDO Wuliaobaobiao);

    int update(WuliaobaobiaoDO Wuliaobaobiao);

    int remove(Integer ID);

    int batchRemove(Integer[] ids);
}
