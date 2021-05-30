package com.bootdo.wuliao.dao;

import com.bootdo.wuliao.domain.IpduiyingbiaoDO;

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
public interface IpduiyingbiaoDao {

	IpduiyingbiaoDO get(Integer id);
	
	List<IpduiyingbiaoDO> list(Map<String,Object> map);
	
	int count(Map<String,Object> map);
	
	int save(IpduiyingbiaoDO ipduiyingbiao);
	
	int update(IpduiyingbiaoDO ipduiyingbiao);
	
	int remove(Integer ID);
	
	int batchRemove(Integer[] ids);
}
