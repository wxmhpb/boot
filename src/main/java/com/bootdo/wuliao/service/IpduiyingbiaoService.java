package com.bootdo.wuliao.service;

import com.bootdo.wuliao.domain.IpduiyingbiaoDO;

import java.util.List;
import java.util.Map;

/**
 * 
 * 
 * @author ktt
 * @email 1035964900@qq.com
 * @date 2020-12-21 17:09:17
 */
public interface IpduiyingbiaoService {
	
	IpduiyingbiaoDO get(Integer id);
	
	List<IpduiyingbiaoDO> list(Map<String, Object> map);
	
	int count(Map<String, Object> map);
	
	int save(IpduiyingbiaoDO ipduiyingbiao);
	
	int update(IpduiyingbiaoDO ipduiyingbiao);
	
	int remove(Integer id);
	
	int batchRemove(Integer[] ids);
}
