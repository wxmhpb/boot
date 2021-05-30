package com.bootdo.wuliao.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

import com.bootdo.wuliao.dao.ShengchanjihuaDao;
import com.bootdo.wuliao.domain.ShengchanjihuaDO;
import com.bootdo.wuliao.service.ShengchanjihuaService;



@Service
public class ShengchanjihuaServiceImpl implements ShengchanjihuaService {
	@Autowired
	private ShengchanjihuaDao shengchanjihuaDao;
	
	@Override
	public ShengchanjihuaDO get(Integer id){
		return shengchanjihuaDao.get(id);
	}
	
	@Override
	public List<ShengchanjihuaDO> list(Map<String, Object> map){
		return shengchanjihuaDao.list(map);
	}
	
	@Override
	public int count(Map<String, Object> map){
		return shengchanjihuaDao.count(map);
	}
	
	@Override
	public int save(ShengchanjihuaDO shengchanjihua){
		return shengchanjihuaDao.save(shengchanjihua);
	}
	
	@Override
	public int update(ShengchanjihuaDO shengchanjihua){
		return shengchanjihuaDao.update(shengchanjihua);
	}
	
	@Override
	public int remove(Integer id){
		return shengchanjihuaDao.remove(id);
	}
	
	@Override
	public int batchRemove(Integer[] ids){
		return shengchanjihuaDao.batchRemove(ids);
	}

	@Override
	public List<ShengchanjihuaDO> queryList() {
		return shengchanjihuaDao.queryList();
	}

	@Override
	public List<ShengchanjihuaDO> queryList1() {
		return shengchanjihuaDao.queryList1();
	}
}
