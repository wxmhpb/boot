package com.bootdo.wuliao.service;

import com.bootdo.wuliao.domain.WuliaoDO;
import com.bootdo.wuliao.domain.WuliaopaixuDO;

import java.util.List;
import java.util.Map;

public interface WuliaopaixuService {
    WuliaopaixuDO get(Integer id);
    List<WuliaopaixuDO> list(Map<String, Object> map);

    int count(Map<String, Object> map);
}
