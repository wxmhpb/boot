package com.bootdo.wuliao.dao;

import com.bootdo.wuliao.domain.HuayanshiDO;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Mapper;

/**
 * 
 * @author ktt
 * @email 1035964900@qq.com
 * @date 2021-01-12 13:10:03
 */
@Mapper
public interface HuayanshiDao {

	HuayanshiDO get(Integer id);
	
	List<HuayanshiDO> list(Map<String, Object> map);
	
	int count(Map<String, Object> map);
	
	int save(HuayanshiDO huayanshi);
	
	int update(HuayanshiDO huayanshi);
	
	int remove(Integer id);
	
	int batchRemove(Integer[] ids);
}
