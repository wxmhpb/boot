package com.bootdo.wuliao.service;



import com.bootdo.wuliao.domain.TbZuidizhiDo;

import java.util.List;
import java.util.Map;


public interface TbZuidizhiService  {

    TbZuidizhiDo get(Integer id);

    List<TbZuidizhiDo> list(Map<String, Object> map);

    int count(Map<String, Object> map);

    int save(TbZuidizhiDo tbZuidizhi);

    int update(TbZuidizhiDo tbZuidizhi);

    int remove(Integer id);

    int batchRemove(Integer[] ids);

    List<TbZuidizhiDo> queryBy();
}

