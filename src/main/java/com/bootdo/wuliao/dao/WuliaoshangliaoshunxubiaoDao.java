package com.bootdo.wuliao.dao;

import com.bootdo.wuliao.domain.ChengfenduizhaoDO;
import com.bootdo.wuliao.domain.WuliaoshangliaoshunxubiaoDO;
import com.bootdo.wuliao.domain.dto.ChengFenDuiZhaoDTO;
import com.bootdo.wuliao.domain.dto.GongYiDanDTO;
import com.bootdo.wuliao.domain.dto.WuLiaoDetailDTO;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
import java.util.Map;

@Mapper
public interface WuliaoshangliaoshunxubiaoDao {

    List<WuliaoshangliaoshunxubiaoDO> list(Map<String, Object> map);

    int count(Map<String, Object> map);

    WuliaoshangliaoshunxubiaoDO get(Integer id);

    String query(String name);

    /**
     * 查出 每个炉次的MingCheng1~MingCheng20
     * @return
     * @author liangqi
     */
    List<GongYiDanDTO> LuCiAndGongYiDanList();

    /**
     * 查出材料对应的 料仓号、当前数量
     * @param name
     * @return
     * @author liangqi
     */
    WuLiaoDetailDTO queryDetail(String name);

    /**
     * 查询总的记录数
     * @author liangqi
     */
    int count2();


    int updateLiaoCang(WuLiaoDetailDTO wuLiaoDetailDTO);
}
