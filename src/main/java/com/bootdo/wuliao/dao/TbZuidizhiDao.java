package com.bootdo.wuliao.dao;

/*import com.baomidou.mybatisplus.core.mapper.BaseMapper;*/
import com.bootdo.wuliao.domain.LiaocangyuliangbiaoDO;
import com.bootdo.wuliao.domain.TbZuidizhiDo;
import org.apache.ibatis.annotations.Mapper;
import java.util.List;
import java.util.Map;

/**
 * 
 * 
 * @author chaiwenqiang
 * @email chaiwenqiang6569@gmail.com
 * @date 2021-06-24 13:57:50
 */
@Mapper
public interface TbZuidizhiDao  {

    TbZuidizhiDo get(Integer id);

    List<TbZuidizhiDo> list(Map<String, Object> map);

    int count(Map<String,Object> map);

    int save(TbZuidizhiDo tbZuidizhi);

    int update(TbZuidizhiDo tbZuidizhi);

    int remove(Integer ID);

    int batchRemove(Integer[] ids);
	
}
