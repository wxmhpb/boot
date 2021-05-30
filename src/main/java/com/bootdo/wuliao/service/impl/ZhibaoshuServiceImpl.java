package com.bootdo.wuliao.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

import com.bootdo.wuliao.dao.ZhibaoshuDao;
import com.bootdo.wuliao.domain.ZhibaoshuDO;
import com.bootdo.wuliao.service.ZhibaoshuService;



@Service
public class ZhibaoshuServiceImpl implements ZhibaoshuService {
	@Autowired
	private ZhibaoshuDao zhibaoshuDao;
	
	@Override
	public ZhibaoshuDO get(Integer id){
		return zhibaoshuDao.get(id);
	}
	
	@Override
	public List<ZhibaoshuDO> list(Map<String, Object> map){
		return zhibaoshuDao.list(map);
	}
	
	@Override
	public int count(Map<String, Object> map){
		return zhibaoshuDao.count(map);
	}
	
	@Override
	public int save(ZhibaoshuDO zhibaoshu){
		return zhibaoshuDao.save(zhibaoshu);
	}
	
	@Override
	public int update(ZhibaoshuDO zhibaoshu){
		return zhibaoshuDao.update(zhibaoshu);
	}
	
	@Override
	public int remove(Integer id){
		return zhibaoshuDao.remove(id);
	}
	
	@Override
	public int batchRemove(Integer[] ids){
		return zhibaoshuDao.batchRemove(ids);
	}
	
}
