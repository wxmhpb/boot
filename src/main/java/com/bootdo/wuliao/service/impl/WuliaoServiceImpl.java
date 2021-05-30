package com.bootdo.wuliao.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

import com.bootdo.wuliao.dao.WuliaoDao;
import com.bootdo.wuliao.domain.WuliaoDO;
import com.bootdo.wuliao.service.WuliaoService;



@Service
public class WuliaoServiceImpl implements WuliaoService {
	@Autowired
	private WuliaoDao wuliaoDao;
	
	@Override
	public WuliaoDO get(Integer id){
		return wuliaoDao.get(id);
	}
	
	@Override
	public List<WuliaoDO> list(Map<String, Object> map){

		return wuliaoDao.list(map);

	}
	
	@Override
	public int count(Map<String, Object> map){
		return wuliaoDao.count(map);
	}
	
	@Override
	public int save(WuliaoDO wuliao){
		return wuliaoDao.save(wuliao);
	}
	
	@Override
	public int update(WuliaoDO wuliao){
		return wuliaoDao.update(wuliao);
	}
	
	@Override
	public int remove(Integer id){
		return wuliaoDao.remove(id);
	}
	
	@Override
	public int batchRemove(Integer[] ids){
		return wuliaoDao.batchRemove(ids);
	}
	
}
