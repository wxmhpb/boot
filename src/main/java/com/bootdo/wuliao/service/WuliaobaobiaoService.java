package com.bootdo.wuliao.service;

import com.bootdo.wuliao.domain.LiaocangyuliangbiaoDO;
import com.bootdo.wuliao.domain.WuliaoVO;
import com.bootdo.wuliao.domain.WuliaobaobiaoDO;

import java.util.List;
import java.util.Map;

public interface WuliaobaobiaoService {
    WuliaobaobiaoDO get(Integer id);

    List<WuliaoVO> list(Map<String, Object> map);

    int count(Map<String, Object> map);

    int save(WuliaobaobiaoDO wuliaobaobiao);

    int update(WuliaobaobiaoDO wuliaobaobiao);

    int remove(Integer id);

    int batchRemove(Integer[] ids);
}
