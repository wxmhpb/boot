package com.bootdo.wuliao.dao;

import com.bootdo.wuliao.domain.LiaocangyuliangbiaoDO;

import java.util.List;
import java.util.Map;

import com.bootdo.wuliao.domain.WuliaoVO;
import org.apache.ibatis.annotations.Mapper;

/**
 * 
 * @author ktt
 * @email 1035964900@qq.com
 * @date 2020-12-21 17:09:17
 */
@Mapper
public interface LiaocangyuliangbiaoDao {

	LiaocangyuliangbiaoDO get(Integer id);

	List<LiaocangyuliangbiaoDO> list(Map<String, Object> map);

	int count(Map<String,Object> map);

	int save(LiaocangyuliangbiaoDO liaocangyuliangbiao);

	int update(LiaocangyuliangbiaoDO liaocangyuliangbiao);

	int remove(Integer ID);

	int batchRemove(Integer[] ids);
}
