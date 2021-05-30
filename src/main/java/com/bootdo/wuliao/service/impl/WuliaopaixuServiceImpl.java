package com.bootdo.wuliao.service.impl;

import com.bootdo.wuliao.dao.WuliaopaixuDao;
import com.bootdo.wuliao.domain.WuliaopaixuDO;
import com.bootdo.wuliao.service.WuliaopaixuService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service
public class WuliaopaixuServiceImpl  implements WuliaopaixuService {
    @Autowired
    private WuliaopaixuDao wuliaopaixuDao;
    @Override
    public List<WuliaopaixuDO> list(Map<String, Object> map) {
        return wuliaopaixuDao.list();
    }

    @Override
    public int count(Map<String, Object> map) {
        return wuliaopaixuDao.count(map);
    }

    @Override
    public WuliaopaixuDO get(Integer id) {
        return wuliaopaixuDao.get(id);
    }
}
