package com.bootdo.system.service;

import com.bootdo.system.domain.*;

import java.util.List;
import java.util.Map;

/**
 * 
 * 
 * @author ktt
 * @email 1035964900@qq.com
 * @date 2020-12-29 17:50:50
 */
public interface WuliaoxinxiService {
	
	WuliaoxinxiDO get(Integer id);
	
	List<WuliaoxinxiDO> list(Map<String, Object> map);
	
	int count(Map<String, Object> map);
	
	int save(WuliaoxinxiDO wuliaoxinxi);
	
	int update(WuliaoxinxiDO wuliaoxinxi);
	
	int remove(Integer id);
	
	int batchRemove(Integer[] ids);

	List<WuliaoxinxiDO> queryList();


}
