package com.bootdo.wuliao.service;

import com.bootdo.wuliao.domain.LiaocangyuliangbiaoDO;
import com.bootdo.wuliao.domain.WuliaoVO;

import java.util.List;
import java.util.Map;

/**
 * 
 * 
 * @author ktt
 * @email 1035964900@qq.com
 * @date 2020-12-21 17:09:17
 */
public interface LiaocangyuliangbiaoService {
	
	LiaocangyuliangbiaoDO get(Integer id);
	
	List<LiaocangyuliangbiaoDO> list(Map<String, Object> map);
	
	int count(Map<String, Object> map);
	
	int save(LiaocangyuliangbiaoDO liaocangyuliangbiao);
	
	int update(LiaocangyuliangbiaoDO liaocangyuliangbiao);
	
	int remove(Integer id);
	
	int batchRemove(Integer[] ids);
}
