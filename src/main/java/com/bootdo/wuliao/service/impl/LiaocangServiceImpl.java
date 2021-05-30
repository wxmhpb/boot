package com.bootdo.wuliao.service.impl;

import com.bootdo.wuliao.dao.LiaocangDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

import com.bootdo.wuliao.domain.LiaocangDO;
import com.bootdo.wuliao.service.LiaocangService;



@Service
public class LiaocangServiceImpl implements LiaocangService {
	@Autowired
	private LiaocangDao liaocangDao;
	
	@Override
	public LiaocangDO get(Integer id){
		return liaocangDao.get(id);
	}

	//@Override
//	public List<WuliaoVO> list(){
//		List<WuliaoVO> list = liaocangDao.list();
//		return list;
//	}
	
	@Override
	public int count(Map<String, Object> map){
		return liaocangDao.count(map);
	}
	
	@Override
	public int save(LiaocangDO liaocang){
		return liaocangDao.save(liaocang);
	}
	
	@Override
	public int update(LiaocangDO liaocang){
		return liaocangDao.update(liaocang);
	}
	
	@Override
	public int remove(Integer id){
		return liaocangDao.remove(id);
	}
	
	@Override
	public int batchRemove(Integer[] ids){
		return liaocangDao.batchRemove(ids);
	}

	@Override
	public List<LiaocangDO> list(Map<String, Object> map) {
		return liaocangDao.list(map);
	}

}
