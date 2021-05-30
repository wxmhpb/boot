package com.bootdo.wuliao.dao;

import com.bootdo.wuliao.domain.ZhibaoshuDO;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Mapper;

/**
 * 
 * @author ktt
 * @email 1035964900@qq.com
 * @date 2021-01-12 13:08:58
 */
@Mapper
public interface ZhibaoshuDao {

	ZhibaoshuDO get(Integer id);
	
	List<ZhibaoshuDO> list(Map<String, Object> map);
	
	int count(Map<String, Object> map);
	
	int save(ZhibaoshuDO zhibaoshu);
	
	int update(ZhibaoshuDO zhibaoshu);
	
	int remove(Integer id);
	
	int batchRemove(Integer[] ids);
}
