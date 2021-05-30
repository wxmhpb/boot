package com.bootdo.wuliao.service;

import com.bootdo.wuliao.domain.WuliaoDO;

import java.util.List;
import java.util.Map;

/**
 * 
 * 
 * @author ktt
 * @email 1035964900@qq.com
 * @date 2020-12-21 17:09:17
 */
public interface WuliaoService {
	
	WuliaoDO get(Integer id);
	
	List<WuliaoDO> list(Map<String, Object> map);
	
	int count(Map<String, Object> map);
	
	int save(WuliaoDO wuliao);
	
	int update(WuliaoDO wuliao);
	
	int remove(Integer id);
	
	int batchRemove(Integer[] ids);
}
