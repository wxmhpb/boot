package com.bootdo.wuliao.service;

import com.bootdo.wuliao.domain.WuliaoVO;
import com.bootdo.wuliao.domain.WuliaobaobiaoDO;
import com.bootdo.wuliao.vo.ProductTotal;

import java.util.List;
import java.util.Map;

public interface WuliaobaobiaoService {
    List<ProductTotal> preQuery();

    WuliaobaobiaoDO get(Integer id);

    List<WuliaoVO> list(Map<String, Object> map);

    int count(Map<String, Object> map);

    int save(WuliaobaobiaoDO wuliaobaobiao);

    int update(WuliaobaobiaoDO wuliaobaobiao);

    int remove(Integer id);

    int batchRemove(Integer[] ids);
}
