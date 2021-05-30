package com.bootdo.wuliao.service;

import com.bootdo.wuliao.domain.Liaocang1DO;
import com.bootdo.wuliao.domain.LiaocangDO;

import java.util.List;
import java.util.Map;

/**
 * 
 * 
 * @author ktt
 * @email 1035964900@qq.com
 * @date 2020-12-21 17:09:17
 */
public interface Liaocang1Service {
	
	Liaocang1DO get(Integer id);
	
	//List<WuliaoVO> list();
	
	int count(Map<String, Object> map);
	
	int save(Liaocang1DO liaocang);
	
	int update(Liaocang1DO liaocang);
	
	int remove(Integer id);
	
	int batchRemove(Integer[] ids);
	List<Liaocang1DO> list1(Map<String,Object> map);
}
