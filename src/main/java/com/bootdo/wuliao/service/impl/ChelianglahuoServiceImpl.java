package com.bootdo.wuliao.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

import com.bootdo.wuliao.dao.ChelianglahuoDao;
import com.bootdo.wuliao.domain.ChelianglahuoDO;
import com.bootdo.wuliao.service.ChelianglahuoService;



@Service
public class ChelianglahuoServiceImpl implements ChelianglahuoService {
	@Autowired
	private ChelianglahuoDao chelianglahuoDao;
	
	@Override
	public ChelianglahuoDO get(Integer id){
		return chelianglahuoDao.get(id);
	}
	
	@Override
	public List<ChelianglahuoDO> list(Map<String, Object> map){
		return chelianglahuoDao.list(map);
	}
	
	@Override
	public int count(Map<String, Object> map){
		return chelianglahuoDao.count(map);
	}
	
	@Override
	public int save(ChelianglahuoDO chelianglahuo){
		return chelianglahuoDao.save(chelianglahuo);
	}
	
	@Override
	public int update(ChelianglahuoDO chelianglahuo){
		return chelianglahuoDao.update(chelianglahuo);
	}
	
	@Override
	public int remove(Integer id){
		return chelianglahuoDao.remove(id);
	}
	
	@Override
	public int batchRemove(Integer[] ids){
		return chelianglahuoDao.batchRemove(ids);
	}
	
}
