package com.bootdo.wuliao.service.impl;

import com.bootdo.wuliao.dao.Liaocang2Dao;
import com.bootdo.wuliao.domain.Liaocang2DO;
import com.bootdo.wuliao.service.Liaocang2Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;


@Service
public class Liaocang2ServiceImpl implements Liaocang2Service {
	@Autowired
	private Liaocang2Dao liaocang2Dao;
	
	@Override
	public Liaocang2DO get(Integer id){
		return liaocang2Dao.get(id);
	}

	//@Override
//	public List<WuliaoVO> list(){
//		List<WuliaoVO> list = liaocangDao.list();
//		return list;
//	}
	
	@Override
	public int count(Map<String, Object> map){
		return liaocang2Dao.count(map);
	}
	
	@Override
	public int save(Liaocang2DO liaocang){
		return liaocang2Dao.save(liaocang);
	}
	
	@Override
	public int update(Liaocang2DO liaocang){
		return liaocang2Dao.update(liaocang);
	}
	
	@Override
	public int remove(Integer id){
		return liaocang2Dao.remove(id);
	}
	
	@Override
	public int batchRemove(Integer[] ids){
		return liaocang2Dao.batchRemove(ids);
	}


	@Override
	public List<Liaocang2DO> list2(Map<String, Object> map) {
		return liaocang2Dao.list2(map);
	}
}
