package com.bootdo.system.service;

import com.bootdo.system.domain.*;

import java.util.List;
import java.util.Map;

/**
 * 
 * 
 * @author ktt
 * @email 1035964900@qq.com
 * @date 2021-01-04 16:43:23
 */
public interface ChanpinxinxiService {
	
	ChanpinxinxiDO get(Integer id);
	
	List<ChanpinxinxiDO> list(Map<String, Object> map);
	
	int count(Map<String, Object> map);
	
	int save(ChanpinxinxiDO chanpinxinxi);
	
	int update(ChanpinxinxiDO chanpinxinxi);
	
	int remove(Integer id);
	
	int batchRemove(Integer[] ids);
	List<GangzhongzuDO> queryList();
	List<JihaoDO> queryList1(Integer id);
	List<LuciDO> queryList2(Integer id);



}
