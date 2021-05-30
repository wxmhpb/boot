package com.bootdo.wuliao.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

import com.bootdo.wuliao.dao.GongyidanDao;
import com.bootdo.wuliao.domain.GongyidanDO;
import com.bootdo.wuliao.service.GongyidanService;



@Service
public class GongyidanServiceImpl implements GongyidanService {
	@Autowired
	private GongyidanDao gongyidanDao;
	
	@Override
	public GongyidanDO get(Integer id){
		return gongyidanDao.get(id);
	}
	
	@Override
	public List<GongyidanDO> list(Map<String, Object> map){
		return gongyidanDao.list(map);
	}
	
	@Override
	public int count(Map<String, Object> map){
		return gongyidanDao.count(map);
	}
	
	@Override
	public int save(GongyidanDO gongyidan){
		return gongyidanDao.save(gongyidan);
	}
	
	@Override
	public int update(GongyidanDO gongyidan){
		return gongyidanDao.update(gongyidan);
	}
	
	@Override
	public int remove(Integer id){
		return gongyidanDao.remove(id);
	}
	
	@Override
	public int batchRemove(Integer[] ids){
		return gongyidanDao.batchRemove(ids);
	}
	
}
