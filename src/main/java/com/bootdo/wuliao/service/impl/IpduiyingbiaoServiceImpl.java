package com.bootdo.wuliao.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

import com.bootdo.wuliao.dao.IpduiyingbiaoDao;
import com.bootdo.wuliao.domain.IpduiyingbiaoDO;
import com.bootdo.wuliao.service.IpduiyingbiaoService;



@Service
public class IpduiyingbiaoServiceImpl implements IpduiyingbiaoService {
	@Autowired
	private IpduiyingbiaoDao ipduiyingbiaoDao;
	
	@Override
	public IpduiyingbiaoDO get(Integer id){
		return ipduiyingbiaoDao.get(id);
	}
	
	@Override
	public List<IpduiyingbiaoDO> list(Map<String, Object> map){
		return ipduiyingbiaoDao.list(map);
	}
	
	@Override
	public int count(Map<String, Object> map){
		return ipduiyingbiaoDao.count(map);
	}
	
	@Override
	public int save(IpduiyingbiaoDO ipduiyingbiao){
		return ipduiyingbiaoDao.save(ipduiyingbiao);
	}
	
	@Override
	public int update(IpduiyingbiaoDO ipduiyingbiao){
		return ipduiyingbiaoDao.update(ipduiyingbiao);
	}
	
	@Override
	public int remove(Integer id){
		return ipduiyingbiaoDao.remove(id);
	}
	
	@Override
	public int batchRemove(Integer[] ids){
		return ipduiyingbiaoDao.batchRemove(ids);
	}
	
}
