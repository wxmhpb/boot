package com.bootdo.wuliao.service;

import com.bootdo.wuliao.domain.ChengfenduizhaoDO;
import java.util.List;
import java.util.Map;

public interface ChengfenduizhaoService {
    ChengfenduizhaoDO get(Integer id);

    List<ChengfenduizhaoDO> list(Map<String, Object> map);

    int count(Map<String, Object> map);

    int save(ChengfenduizhaoDO cheliangxinxi);

    int update(ChengfenduizhaoDO cheliangxinxi);

    int remove(Integer id);

    int batchRemove(Integer[] ids);
}
