package com.bootdo.wuliao.dao;

import com.bootdo.wuliao.domain.GongyidanDO;

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
public interface GongyidanDao {

	GongyidanDO get(Integer id);
	
	List<GongyidanDO> list(Map<String,Object> map);
	
	int count(Map<String,Object> map);
	
	int save(GongyidanDO gongyidan);
	
	int update(GongyidanDO gongyidan);
	
	int remove(Integer ID);
	
	int batchRemove(Integer[] ids);
}
