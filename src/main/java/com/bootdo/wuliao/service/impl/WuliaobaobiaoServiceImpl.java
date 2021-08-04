package com.bootdo.wuliao.service.impl;

import com.bootdo.wuliao.dao.LiaocangyuliangbiaoDao;
import com.bootdo.wuliao.dao.WuliaobaobiaoDao;
import com.bootdo.wuliao.domain.GongyidanDO;
import com.bootdo.wuliao.domain.TbZuidizhiDo;
import com.bootdo.wuliao.domain.WuliaoVO;
import com.bootdo.wuliao.domain.WuliaobaobiaoDO;
import com.bootdo.wuliao.service.GongyidanService;
import com.bootdo.wuliao.service.TbZuidizhiService;
import com.bootdo.wuliao.service.WuliaobaobiaoService;
import com.bootdo.wuliao.vo.ProductTotal;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

@Service
public class WuliaobaobiaoServiceImpl implements WuliaobaobiaoService {
    @Autowired
    private WuliaobaobiaoDao wuliaobaobiaoDao;
    @Autowired
    LiaocangyuliangbiaoDao tbLiaocangyuliangbiaoDao;

    @Autowired
    GongyidanService tbGongyidanService;

    @Autowired
    TbZuidizhiService tbZuidizhiService;

    @Override
    public List<ProductTotal> preQuery() {

        List<ProductTotal> productTotals =  tbLiaocangyuliangbiaoDao.selectGroup();
        List<GongyidanDO> tbGongyidanEntities =  tbGongyidanService.queryBy();

        List<TbZuidizhiDo> tbZuidizhiEntities = tbZuidizhiService.queryBy();

        List<ProductTotal> list = productTotals.stream().map(productTotal -> {
            //总数量
            Float number = productTotal.getDangqianzongshuliang();

            for (GongyidanDO tbGongyidanEntity : tbGongyidanEntities) {

                if (productTotal.getLiaocangmingcheng().equals(tbGongyidanEntity.getLuci())) {

                    if (!StringUtils.isEmpty(tbGongyidanEntity.getCl1mingcheng()) && tbGongyidanEntity.getCl1mingcheng().equals(productTotal.getDangqianpinzhong())) {
                        number -= tbGongyidanEntity.getCl1shuliang();

                    }
                    if (!StringUtils.isEmpty(tbGongyidanEntity.getCl2mingcheng()) && tbGongyidanEntity.getCl2mingcheng().equals(productTotal.getDangqianpinzhong())) {
                        number -= tbGongyidanEntity.getCl2shuliang();
                    }
                    if (!StringUtils.isEmpty(tbGongyidanEntity.getCl3mingcheng()) && tbGongyidanEntity.getCl3mingcheng().equals(productTotal.getDangqianpinzhong())) {
                        number -= tbGongyidanEntity.getCl3shuliang();
                    }
                    if (!StringUtils.isEmpty(tbGongyidanEntity.getCl4mingcheng()) && tbGongyidanEntity.getCl4mingcheng().equals(productTotal.getDangqianpinzhong())) {
                        number -= tbGongyidanEntity.getCl4shuliang();
                    }
                    if (!StringUtils.isEmpty(tbGongyidanEntity.getCl5mingcheng()) && tbGongyidanEntity.getCl5mingcheng().equals(productTotal.getDangqianpinzhong())) {
                        number -= tbGongyidanEntity.getCl5shuliang();
                    }
                    if (!StringUtils.isEmpty(tbGongyidanEntity.getCl6mingcheng()) && tbGongyidanEntity.getCl6mingcheng().equals(productTotal.getDangqianpinzhong())) {
                        number -= tbGongyidanEntity.getCl6shuliang();
                    }
                    if (!StringUtils.isEmpty(tbGongyidanEntity.getCl7mingcheng()) && tbGongyidanEntity.getCl7mingcheng().equals(productTotal.getDangqianpinzhong())) {
                        number -= tbGongyidanEntity.getCl7shuliang();
                    }if (!StringUtils.isEmpty(tbGongyidanEntity.getCl8mingcheng()) && tbGongyidanEntity.getCl8mingcheng().equals(productTotal.getDangqianpinzhong())) {
                        number -= tbGongyidanEntity.getCl8shuliang();
                    }if (!StringUtils.isEmpty(tbGongyidanEntity.getCl9mingcheng()) && tbGongyidanEntity.getCl9mingcheng().equals(productTotal.getDangqianpinzhong())) {
                        number -= tbGongyidanEntity.getCl9shuliang();
                    }if (!StringUtils.isEmpty(tbGongyidanEntity.getCl10mingcheng()) && tbGongyidanEntity.getCl10mingcheng().equals(productTotal.getDangqianpinzhong())) {
                        number -= tbGongyidanEntity.getCl10shuliang();
                    }if (!StringUtils.isEmpty(tbGongyidanEntity.getCl11mingcheng()) && tbGongyidanEntity.getCl11mingcheng().equals(productTotal.getDangqianpinzhong())) {
                        number -= tbGongyidanEntity.getCl11shuliang();
                    }
                    if (!StringUtils.isEmpty(tbGongyidanEntity.getCl12mingcheng()) && tbGongyidanEntity.getCl12mingcheng().equals(productTotal.getDangqianpinzhong())) {
                        number -= tbGongyidanEntity.getCl12shuliang();
                    }
                    if (!StringUtils.isEmpty(tbGongyidanEntity.getCl13mingcheng()) && tbGongyidanEntity.getCl13mingcheng().equals(productTotal.getDangqianpinzhong())) {
                        number -= tbGongyidanEntity.getCl13shuliang();
                    }
                    if (!StringUtils.isEmpty(tbGongyidanEntity.getCl14mingcheng()) && tbGongyidanEntity.getCl14mingcheng().equals(productTotal.getDangqianpinzhong())) {
                        number -= tbGongyidanEntity.getCl14shuliang();
                    }
                    if (!StringUtils.isEmpty(tbGongyidanEntity.getCl15mingcheng()) && tbGongyidanEntity.getCl15mingcheng().equals(productTotal.getDangqianpinzhong())) {
                        number -= tbGongyidanEntity.getCl15shuliang();
                    }if (!StringUtils.isEmpty(tbGongyidanEntity.getCl16mingcheng()) && tbGongyidanEntity.getCl16mingcheng().equals(productTotal.getDangqianpinzhong())) {
                        number -= tbGongyidanEntity.getCl16shuliang();
                    }
                    if (!StringUtils.isEmpty(tbGongyidanEntity.getCl17mingcheng()) && tbGongyidanEntity.getCl17mingcheng().equals(productTotal.getDangqianpinzhong())) {
                        number -= tbGongyidanEntity.getCl17shuliang();
                    }
                    if (!StringUtils.isEmpty(tbGongyidanEntity.getCl18mingcheng()) && tbGongyidanEntity.getCl18mingcheng().equals(productTotal.getDangqianpinzhong())) {
                        number -= tbGongyidanEntity.getCl18shuliang();
                    }
                    if (!StringUtils.isEmpty(tbGongyidanEntity.getCl19mingcheng()) && tbGongyidanEntity.getCl19mingcheng().equals(productTotal.getDangqianpinzhong())) {
                        number -= tbGongyidanEntity.getCl19shuliang();
                    }
                    if (!StringUtils.isEmpty(tbGongyidanEntity.getCl20mingcheng()) && tbGongyidanEntity.getCl20mingcheng().equals(productTotal.getDangqianpinzhong())) {
                        number -= tbGongyidanEntity.getCl20shuliang();
                    }


                }

            }
            productTotal.setDangqianzongshuliang(number);

            //再一次减
            for (TbZuidizhiDo tbZuidizhiEntity : tbZuidizhiEntities) {

                if (productTotal.getLiaocangmingcheng().equals(tbZuidizhiEntity.getLiaocangmingcheng())) {

                    if (tbZuidizhiEntity.getDangqianpinzhong().equals(productTotal.getDangqianpinzhong())) {
                        number -= tbZuidizhiEntity.getZuishaoshuliang();
                    }
                }

            }
            productTotal.setDangqianzongshuliang(number);
            return productTotal;
        }).collect(Collectors.toList());
        Collections.sort(list);
        return list;
    }

    @Override
    public WuliaobaobiaoDO get(Integer id) {
        return wuliaobaobiaoDao.get(id);
    }

    @Override
    public List<WuliaoVO> list(Map<String, Object> map) {
        return wuliaobaobiaoDao.list();
    }

    @Override
    public int count(Map<String, Object> map) {
        return wuliaobaobiaoDao.count(map);
    }

    @Override
    public int save(WuliaobaobiaoDO wuliaobaobiao) {
        return wuliaobaobiaoDao.save(wuliaobaobiao);
    }

    @Override
    public int update(WuliaobaobiaoDO wuliaobaobiao) {
        return wuliaobaobiaoDao.update(wuliaobaobiao);
    }

    @Override
    public int remove(Integer id) {
        return wuliaobaobiaoDao.remove(id);
    }

    @Override
    public int batchRemove(Integer[] ids) {
        return wuliaobaobiaoDao.batchRemove(ids);
    }
}
