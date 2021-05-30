package com.bootdo.wuliao.dao;

import com.bootdo.wuliao.domain.WuliaoDO;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Mapper;

/**
 * 
 * @author ktt
 * @email 1035964900@qq.com
 * @date 2020-12-21 17:09:17
 */
@Mapper
public interface WuliaoDao {

	WuliaoDO get(Integer id);
	
	List<WuliaoDO> list(Map<String,Object> map);
	
	int count(Map<String,Object> map);
	
	int save(WuliaoDO wuliao);
	
	int update(WuliaoDO wuliao);
	
	int remove(Integer ID);
	
	int batchRemove(Integer[] ids);
}
