package com.bootdo.system.dao;

import com.bootdo.system.domain.*;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Mapper;

/**
 * 
 * @author ktt
 * @email 1035964900@qq.com
 * @date 2021-01-04 16:43:23
 */
@Mapper
public interface ChanpinxinxiDao {

	ChanpinxinxiDO get(Integer id);
	
	List<ChanpinxinxiDO> list(Map<String, Object> map);
	
	int count(Map<String, Object> map);
	
	int save(ChanpinxinxiDO chanpinxinxi);
	
	int update(ChanpinxinxiDO chanpinxinxi);
	
	int remove(Integer id);
	
	int batchRemove(Integer[] ids);
	List<GangzhongzuDO> queryList();
	List<LuciDO> queryList2(Integer id);
	List<JihaoDO> queryList3(Integer id);




}
