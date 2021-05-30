package com.bootdo.wuliao.service.impl;

import com.bootdo.wuliao.dao.ChengfenduizhaoDao;
import com.bootdo.wuliao.domain.ChengfenduizhaoDO;
import com.bootdo.wuliao.domain.dto.ChengFenDuiZhaoDTO;
import com.bootdo.wuliao.service.ChengfenduizhaoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@Service
public class ChengfenduizhaoServiceImpl implements ChengfenduizhaoService {

    @Autowired
    private ChengfenduizhaoDao chengfenduizhaoDao;

    @Override
    public ChengfenduizhaoDO get(Integer id) {
        return chengfenduizhaoDao.get(id);
    }

    @Override
    public List<ChengfenduizhaoDO> list(Map<String, Object> map) {
        List<ChengFenDuiZhaoDTO> chengFenDuiZhaoDTOList = chengfenduizhaoDao.list(map);
        List<ChengfenduizhaoDO> list = new ArrayList<>();
        for (ChengFenDuiZhaoDTO dto : chengFenDuiZhaoDTOList) {
            ChengfenduizhaoDO chengfenduizhaoDO = new ChengfenduizhaoDO();
            chengfenduizhaoDO.setName(dto.getZhiName());
            chengfenduizhaoDO.setPicihao(dto.getZhiPiCiHao());
            chengfenduizhaoDO.setRiqi(dto.getZhiRiQi());
            chengfenduizhaoDO.setChangjia(dto.getZhiChangJia());
            chengfenduizhaoDO.setZhibaoshu(dto.getZhiBaiFenBi());
            chengfenduizhaoDO.setHuayanshi(dto.getHuaBaiFenBi());
            if (dto.getHuaBaiFenBi().equals(dto.getZhiBaiFenBi())) {
                chengfenduizhaoDO.setZhuangtai(" ");
            } else {
                chengfenduizhaoDO.setZhuangtai("不一致");
            }
            list.add(chengfenduizhaoDO);
        }
        return list;
    }

    @Override
    public int count(Map<String, Object> map) {
        return chengfenduizhaoDao.count(map);
    }

    @Override
    public int save(ChengfenduizhaoDO cheliangxinxi) {
        return 0;
    }

    @Override
    public int update(ChengfenduizhaoDO cheliangxinxi) {
        return 0;
    }

    @Override
    public int remove(Integer id) {
        return 0;
    }

    @Override
    public int batchRemove(Integer[] ids) {
        return 0;
    }
}
