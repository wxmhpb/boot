package com.bootdo.wuliao.service.impl;

import com.bootdo.wuliao.dao.Liaocang1Dao;
import com.bootdo.wuliao.dao.LiaocangDao;
import com.bootdo.wuliao.domain.Liaocang1DO;
import com.bootdo.wuliao.domain.LiaocangDO;
import com.bootdo.wuliao.service.Liaocang1Service;
import com.bootdo.wuliao.service.LiaocangService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;


@Service
public class Liaocang1ServiceImpl implements Liaocang1Service {
	@Autowired
	private Liaocang1Dao liaocang1Dao;
	
	@Override
	public Liaocang1DO get(Integer id){
		return liaocang1Dao.get(id);
	}

	//@Override
//	public List<WuliaoVO> list(){
//		List<WuliaoVO> list = liaocangDao.list();
//		return list;
//	}
	
	@Override
	public int count(Map<String, Object> map){
		return liaocang1Dao.count(map);
	}
	
	@Override
	public int save(Liaocang1DO liaocang){
		return liaocang1Dao.save(liaocang);
	}
	
	@Override
	public int update(Liaocang1DO liaocang){
		return liaocang1Dao.update(liaocang);
	}
	
	@Override
	public int remove(Integer id){
		return liaocang1Dao.remove(id);
	}
	
	@Override
	public int batchRemove(Integer[] ids){
		return liaocang1Dao.batchRemove(ids);
	}


	@Override
	public List<Liaocang1DO> list1(Map<String, Object> map) {
		return liaocang1Dao.list1(map);
	}
}
