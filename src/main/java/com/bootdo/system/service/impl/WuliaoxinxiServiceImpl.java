package com.bootdo.system.service.impl;

import com.bootdo.system.domain.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

import com.bootdo.system.dao.WuliaoxinxiDao;
import com.bootdo.system.service.WuliaoxinxiService;



@Service
public class WuliaoxinxiServiceImpl implements WuliaoxinxiService {
	@Autowired
	private WuliaoxinxiDao wuliaoxinxiDao;
	
	@Override
	public WuliaoxinxiDO get(Integer id){
		return wuliaoxinxiDao.get(id);
	}
	
	@Override
	public List<WuliaoxinxiDO> list(Map<String, Object> map){
		return wuliaoxinxiDao.list(map);
	}
	
	@Override
	public int count(Map<String, Object> map){
		return wuliaoxinxiDao.count(map);
	}
	
	@Override
	public int save(WuliaoxinxiDO wuliaoxinxi){
		return wuliaoxinxiDao.save(wuliaoxinxi);
	}
	
	@Override
	public int update(WuliaoxinxiDO wuliaoxinxi){
		return wuliaoxinxiDao.update(wuliaoxinxi);
	}
	
	@Override
	public int remove(Integer id){
		return wuliaoxinxiDao.remove(id);
	}
	
	@Override
	public int batchRemove(Integer[] ids){
		return wuliaoxinxiDao.batchRemove(ids);
	}


	@Override
	public List<WuliaoxinxiDO> queryList() {
		return wuliaoxinxiDao.queryList();
	}

	}



