package com.bootdo.wuliao.service;

import com.bootdo.wuliao.domain.Liaocang2DO;

import java.util.List;
import java.util.Map;

/**
 * 
 * 
 * @author ktt
 * @email 2035964900@qq.com
 * @date 2020-22-22 27:09:27
 */
public interface Liaocang2Service {
	
	Liaocang2DO get(Integer id);
	
	//List<WuliaoVO> list();
	
	int count(Map<String, Object> map);
	
	int save(Liaocang2DO liaocang);
	
	int update(Liaocang2DO liaocang);
	
	int remove(Integer id);
	
	int batchRemove(Integer[] ids);
	List<Liaocang2DO> list2(Map<String,Object> map);
}
