package com.bootdo.wuliao.service.impl;

import com.bootdo.wuliao.dao.WuliaobaobiaoDao;
import com.bootdo.wuliao.domain.WuliaoVO;
import com.bootdo.wuliao.domain.WuliaobaobiaoDO;
import com.bootdo.wuliao.service.WuliaobaobiaoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service
public class WuliaobaobiaoServiceImpl implements WuliaobaobiaoService {
    @Autowired
    private WuliaobaobiaoDao wuliaobaobiaoDao;
    @Override
    public WuliaobaobiaoDO get(Integer id) {
        return wuliaobaobiaoDao.get(id);
    }

    @Override
    public List<WuliaoVO> list(Map<String, Object> map) {
        return wuliaobaobiaoDao.list();
    }

    @Override
    public int count(Map<String, Object> map) {
        return wuliaobaobiaoDao.count(map);
    }

    @Override
    public int save(WuliaobaobiaoDO wuliaobaobiao) {
        return wuliaobaobiaoDao.save(wuliaobaobiao);
    }

    @Override
    public int update(WuliaobaobiaoDO wuliaobaobiao) {
        return wuliaobaobiaoDao.update(wuliaobaobiao);
    }

    @Override
    public int remove(Integer id) {
        return wuliaobaobiaoDao.remove(id);
    }

    @Override
    public int batchRemove(Integer[] ids) {
        return wuliaobaobiaoDao.batchRemove(ids);
    }
}
