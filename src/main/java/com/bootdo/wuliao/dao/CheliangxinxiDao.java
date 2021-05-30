package com.bootdo.wuliao.dao;

import com.bootdo.wuliao.domain.CheliangxinxiDO;

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
public interface CheliangxinxiDao {

	CheliangxinxiDO get(Integer id);
	
	List<CheliangxinxiDO> list(Map<String,Object> map);
	
	int count(Map<String,Object> map);
	
	int save(CheliangxinxiDO cheliangxinxi);
	
	int update(CheliangxinxiDO cheliangxinxi);
	
	int remove(Integer ID);
	
	int batchRemove(Integer[] ids);
}
