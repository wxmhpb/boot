package com.bootdo.wuliao.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

import com.bootdo.wuliao.dao.HuayanshiDao;
import com.bootdo.wuliao.domain.HuayanshiDO;
import com.bootdo.wuliao.service.HuayanshiService;



@Service
public class HuayanshiServiceImpl implements HuayanshiService {
	@Autowired
	private HuayanshiDao huayanshiDao;
	
	@Override
	public HuayanshiDO get(Integer id){
		return huayanshiDao.get(id);
	}
	
	@Override
	public List<HuayanshiDO> list(Map<String, Object> map){
		return huayanshiDao.list(map);
	}
	
	@Override
	public int count(Map<String, Object> map){
		return huayanshiDao.count(map);
	}
	
	@Override
	public int save(HuayanshiDO huayanshi){
		return huayanshiDao.save(huayanshi);
	}
	
	@Override
	public int update(HuayanshiDO huayanshi){
		return huayanshiDao.update(huayanshi);
	}
	
	@Override
	public int remove(Integer id){
		return huayanshiDao.remove(id);
	}
	
	@Override
	public int batchRemove(Integer[] ids){
		return huayanshiDao.batchRemove(ids);
	}
	
}
