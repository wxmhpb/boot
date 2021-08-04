package com.bootdo.wuliao.service.impl;

import com.bootdo.wuliao.dao.TbZuidizhiDao;
import com.bootdo.wuliao.domain.TbZuidizhiDo;
import com.bootdo.wuliao.service.TbZuidizhiService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;




@Service
public class TbZuidizhiServiceImpl  implements TbZuidizhiService {

    @Autowired
    private TbZuidizhiDao tbZuidizhiDao;

    @Override
    public TbZuidizhiDo get(Integer id){

        return tbZuidizhiDao.get(id); }

    @Override
    public List<TbZuidizhiDo> list(Map<String, Object> map){
        return tbZuidizhiDao.list(map);
    }

    @Override
    public List<TbZuidizhiDo> queryBy() {
        return this.list(new HashMap<>());
    }

    @Override
    public int count(Map<String, Object> map){
        return tbZuidizhiDao.count(map);
    }

    @Override
    public int save(TbZuidizhiDo tbZuidizhi){
        return tbZuidizhiDao.save(tbZuidizhi);
    }

    @Override
    public int update(TbZuidizhiDo tbZuidizhi){
        return tbZuidizhiDao.update(tbZuidizhi);
    }

    @Override
    public int remove(Integer id){
        return tbZuidizhiDao.remove(id);
    }

    @Override
    public int batchRemove(Integer[] ids){
        return tbZuidizhiDao.batchRemove(ids);
    }




}