package com.bootdo.wuliao.service;

import com.bootdo.wuliao.domain.GongyidanDO;

import java.util.List;
import java.util.Map;

/**
 * 
 * 
 * @author ktt
 * @email 1035964900@qq.com
 * @date 2020-12-21 17:09:17
 */
public interface GongyidanService {
	
	GongyidanDO get(Integer id);
	
	List<GongyidanDO> list(Map<String, Object> map);
	
	int count(Map<String, Object> map);
	
	int save(GongyidanDO gongyidan);
	
	int update(GongyidanDO gongyidan);
	
	int remove(Integer id);
	
	int batchRemove(Integer[] ids);
}
