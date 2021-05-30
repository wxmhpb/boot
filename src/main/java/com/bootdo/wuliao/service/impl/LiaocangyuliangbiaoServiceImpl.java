package com.bootdo.wuliao.service.impl;

import com.bootdo.wuliao.domain.WuliaoVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

import com.bootdo.wuliao.dao.LiaocangyuliangbiaoDao;
import com.bootdo.wuliao.domain.LiaocangyuliangbiaoDO;
import com.bootdo.wuliao.service.LiaocangyuliangbiaoService;



@Service
public class LiaocangyuliangbiaoServiceImpl implements LiaocangyuliangbiaoService {
	@Autowired
	private LiaocangyuliangbiaoDao liaocangyuliangbiaoDao;
	
	@Override
	public LiaocangyuliangbiaoDO get(Integer id){
		return liaocangyuliangbiaoDao.get(id);
	}
	
	@Override
	public List<LiaocangyuliangbiaoDO> list(Map<String, Object> map){
		return liaocangyuliangbiaoDao.list(map);
	}
	
	@Override
	public int count(Map<String, Object> map){
		return liaocangyuliangbiaoDao.count(map);
	}
	
	@Override
	public int save(LiaocangyuliangbiaoDO liaocangyuliangbiao){
		return liaocangyuliangbiaoDao.save(liaocangyuliangbiao);
	}
	
	@Override
	public int update(LiaocangyuliangbiaoDO liaocangyuliangbiao){
		return liaocangyuliangbiaoDao.update(liaocangyuliangbiao);
	}
	
	@Override
	public int remove(Integer id){
		return liaocangyuliangbiaoDao.remove(id);
	}
	
	@Override
	public int batchRemove(Integer[] ids){
		return liaocangyuliangbiaoDao.batchRemove(ids);
	}
	
}
