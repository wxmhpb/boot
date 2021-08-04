package com.bootdo.testDemo;

import com.bootdo.wuliao.dao.LiaocangyuliangbiaoDao;
import com.bootdo.wuliao.domain.GongyidanDO;
import com.bootdo.wuliao.domain.TbZuidizhiDo;
import com.bootdo.wuliao.domain.WuliaoshangliaoshunxubiaoDO;
import com.bootdo.wuliao.domain.dto.GongYiDanDTO;
import com.bootdo.wuliao.service.GongyidanService;
import com.bootdo.wuliao.service.TbZuidizhiService;
import com.bootdo.wuliao.service.WuliaoshangliaoshunxubiaoService;
import com.bootdo.wuliao.service.impl.WuliaoshangliaoshunxubiaoServiceImpl;
import com.bootdo.wuliao.vo.ProductTotal;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.stream.Collectors;

@RestController()
@RunWith(SpringRunner.class)
@SpringBootTest
public class TestDemo {
    @Autowired
    RedisTemplate redisTemplate;





    @Test
    public void test() {
        redisTemplate.opsForValue().set("a", "b");
        System.out.println(redisTemplate.opsForValue().get("a"));
    }

 /*   @Autowired
    LiaocangyuliangbiaoDao tbLiaocangyuliangbiaoDao;

    @Autowired
    GongyidanService tbGongyidanService;

    @Autowired
    TbZuidizhiService tbZuidizhiService;

    @Test
    public void test2() {
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

        //对list进行遍历
        for (ProductTotal p:list) {
            System.out.println(p.getLiaocangmingcheng()+"  "+p.getDangqianpinzhong()+"  "+p.getDangqianzongshuliang());
        }
        // System.out.println(list);

    }*/
    }



