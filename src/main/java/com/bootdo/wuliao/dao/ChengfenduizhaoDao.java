package com.bootdo.wuliao.dao;

import com.bootdo.wuliao.domain.ChengfenduizhaoDO;
import com.bootdo.wuliao.domain.dto.ChengFenDuiZhaoDTO;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
import java.util.Map;

@Mapper
public interface ChengfenduizhaoDao {
    ChengfenduizhaoDO get(Integer id);

    /**
     * 关联查询
     *
     * @param map
     * @return
     * @author liangqi
     */
    List<ChengFenDuiZhaoDTO> list(Map<String,Object> map);

    int count(Map<String,Object> map);
}
