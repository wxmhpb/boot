package com.bootdo.wuliao.dao;

import com.bootdo.system.domain.WuliaoxinxiDO;
import com.bootdo.wuliao.domain.ShengchanjihuaDO;

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
public interface ShengchanjihuaDao {

	ShengchanjihuaDO get(Integer id);
	
	List<ShengchanjihuaDO> list(Map<String,Object> map);
	
	int count(Map<String,Object> map);
	
	int save(ShengchanjihuaDO shengchanjihua);
	
	int update(ShengchanjihuaDO shengchanjihua);
	
	int remove(Integer ID);
	
	int batchRemove(Integer[] ids);
	List<ShengchanjihuaDO> queryList();
	List<ShengchanjihuaDO> queryList1();
}
