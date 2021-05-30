package com.bootdo.wuliao.service;

import com.bootdo.wuliao.domain.WuliaoshangliaoshunxubiaoDO;

import java.util.List;
import java.util.Map;

public interface WuliaoshangliaoshunxubiaoService {

    WuliaoshangliaoshunxubiaoDO get(Integer id);


    List<WuliaoshangliaoshunxubiaoDO> list(Map<String, Object> map);

    /**
     * 查询
     *
     * @param map 为分页参数
     * @return
     * @author liangqi
     */
    List<WuliaoshangliaoshunxubiaoDO> list2();

    /**
     * 查询总记录数
     * @return
     * @author liangqi
     */
    int count2();

    int count(Map<String, Object> map);
    String query(String name);


}
