package com.bootdo.wuliao.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

import com.bootdo.wuliao.dao.CheliangxinxiDao;
import com.bootdo.wuliao.domain.CheliangxinxiDO;
import com.bootdo.wuliao.service.CheliangxinxiService;



@Service
public class CheliangxinxiServiceImpl implements CheliangxinxiService {
	@Autowired
	private CheliangxinxiDao cheliangxinxiDao;
	
	@Override
	public CheliangxinxiDO get(Integer id){
		return cheliangxinxiDao.get(id);
	}
	
	@Override
	public List<CheliangxinxiDO> list(Map<String, Object> map){
		return cheliangxinxiDao.list(map);
	}
	
	@Override
	public int count(Map<String, Object> map){
		return cheliangxinxiDao.count(map);
	}
	
	@Override
	public int save(CheliangxinxiDO cheliangxinxi){
		return cheliangxinxiDao.save(cheliangxinxi);
	}
	
	@Override
	public int update(CheliangxinxiDO cheliangxinxi){
		return cheliangxinxiDao.update(cheliangxinxi);
	}
	
	@Override
	public int remove(Integer id){
		return cheliangxinxiDao.remove(id);
	}
	
	@Override
	public int batchRemove(Integer[] ids){
		return cheliangxinxiDao.batchRemove(ids);
	}
	
}
