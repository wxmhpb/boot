package com.bootdo.system.service.impl;

import com.bootdo.system.domain.GangzhongzuDO;
import com.bootdo.system.domain.JihaoDO;
import com.bootdo.system.domain.LuciDO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

import com.bootdo.system.dao.ChanpinxinxiDao;
import com.bootdo.system.domain.ChanpinxinxiDO;
import com.bootdo.system.service.ChanpinxinxiService;



@Service
public class ChanpinxinxiServiceImpl implements ChanpinxinxiService {
	@Autowired
	private ChanpinxinxiDao chanpinxinxiDao;
	
	@Override
	public ChanpinxinxiDO get(Integer id){
		return chanpinxinxiDao.get(id);
	}
	
	@Override
	public List<ChanpinxinxiDO> list(Map<String, Object> map){
		return chanpinxinxiDao.list(map);
	}
	
	@Override
	public int count(Map<String, Object> map){
		return chanpinxinxiDao.count(map);
	}
	
	@Override
	public int save(ChanpinxinxiDO chanpinxinxi){
		return chanpinxinxiDao.save(chanpinxinxi);
	}
	
	@Override
	public int update(ChanpinxinxiDO chanpinxinxi){
		return chanpinxinxiDao.update(chanpinxinxi);
	}
	
	@Override
	public int remove(Integer id){
		return chanpinxinxiDao.remove(id);
	}
	
	@Override
	public int batchRemove(Integer[] ids){
		return chanpinxinxiDao.batchRemove(ids);
	}

	@Override
	public List<GangzhongzuDO> queryList() {
		return chanpinxinxiDao.queryList();
	}


	@Override
	public List<LuciDO> queryList2(Integer id) {
		return chanpinxinxiDao.queryList2(id);
	}

	@Override
	public List<JihaoDO> queryList3(Integer id) {
		return chanpinxinxiDao.queryList3(id);
	}
}
