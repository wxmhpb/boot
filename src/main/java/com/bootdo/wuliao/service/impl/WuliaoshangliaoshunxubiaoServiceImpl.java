package com.bootdo.wuliao.service.impl;


import com.bootdo.wuliao.dao.WuliaoshangliaoshunxubiaoDao;
import com.bootdo.wuliao.domain.WuliaoshangliaoshunxubiaoDO;
import com.bootdo.wuliao.domain.dto.GongYiDanDTO;
import com.bootdo.wuliao.domain.dto.WuLiaoDetailDTO;
import com.bootdo.wuliao.service.GongyidanService;
import com.bootdo.wuliao.service.WuliaoshangliaoshunxubiaoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;


@Service
public class WuliaoshangliaoshunxubiaoServiceImpl implements WuliaoshangliaoshunxubiaoService {
    @Autowired
    private WuliaoshangliaoshunxubiaoDao wuliaoshangliaoshunxubiaoDao;

    @Override
    public List<WuliaoshangliaoshunxubiaoDO> list(Map<String, Object> map) {
        return wuliaoshangliaoshunxubiaoDao.list(map);
    }

    @Override
    public List<WuliaoshangliaoshunxubiaoDO> list2() {
        List<WuliaoshangliaoshunxubiaoDO> result = new ArrayList<>();

        //1、查出炉次and工艺单List： 每个炉次对应的工艺单中的MingCheng1~MingCheng20，和 数量
        List<GongYiDanDTO> gongYiDanDTOList = wuliaoshangliaoshunxubiaoDao.LuCiAndGongYiDanList();

        //2、遍历每个炉次and工艺单 ，查询工艺单中 每种材料对应的 料仓号、剩余量,并进行设置
        for (int i = 0; i < gongYiDanDTOList.size(); i++) {
            GongYiDanDTO dto = gongYiDanDTOList.get(i);
            WuliaoshangliaoshunxubiaoDO aDo = new WuliaoshangliaoshunxubiaoDO();
            //设置炉次
            aDo.setLuci(dto.getLuci());
            String name = null;
            //材料1
            if (!StringUtils.isEmpty(dto.getCl1mingcheng())) {
                name = dto.getCl1mingcheng();

                //查询 每种材料对应的 料仓号、剩余量
                WuLiaoDetailDTO detailDTO = wuliaoshangliaoshunxubiaoDao.queryDetail(name);
                //设置值
                //setValue(dto, aDo, detailDTO);
                if (null != detailDTO) {
                    //设置料仓号
                    aDo.setLiaocanghao1(detailDTO.getLiaocanghao());
                    //设置材料名
                    aDo.setCl1mingcheng(name);
                    //设置剩余量
                    aDo.setCl1shengyuliang(detailDTO.getDangqianshuliang() - dto.getCl1shuliang() * dto.getShuliang());
                    detailDTO.setDangqianshuliang(aDo.getCl1shengyuliang().intValue());
                    wuliaoshangliaoshunxubiaoDao.updateLiaoCang(detailDTO);
                }
            }

            //材料2
            if (!StringUtils.isEmpty(dto.getCl2mingcheng())) {
                name = dto.getCl2mingcheng();

                //查询 每种材料对应的 料仓号、剩余量
                WuLiaoDetailDTO detailDTO = wuliaoshangliaoshunxubiaoDao.queryDetail(name);
                if (null != detailDTO) {
                    //设置料仓号
                    aDo.setLiaocanghao2(detailDTO.getLiaocanghao());
                    //设置材料名
                    aDo.setCl2mingcheng(name);
                    //设置剩余量
                    aDo.setCl2shengyuliang(detailDTO.getDangqianshuliang() - dto.getCl2shuliang() * dto.getShuliang());
                    detailDTO.setDangqianshuliang(aDo.getCl2shengyuliang().intValue());
                    wuliaoshangliaoshunxubiaoDao.updateLiaoCang(detailDTO);
                }
            }

            //材料3
            if (!StringUtils.isEmpty(dto.getCl3mingcheng())) {
                name = dto.getCl3mingcheng();

                //查询 每种材料对应的 料仓号、剩余量
                WuLiaoDetailDTO detailDTO = wuliaoshangliaoshunxubiaoDao.queryDetail(name);
                if (null != detailDTO) {
                    //设置料仓号
                    aDo.setLiaocanghao3(detailDTO.getLiaocanghao());
                    //设置材料名
                    aDo.setCl3mingcheng(name);
                    //设置剩余量
                    aDo.setCl3shengyuliang(detailDTO.getDangqianshuliang() - dto.getCl3shuliang() * dto.getShuliang());
                    detailDTO.setDangqianshuliang(aDo.getCl3shengyuliang().intValue());
                    wuliaoshangliaoshunxubiaoDao.updateLiaoCang(detailDTO);
                }
            }

            //材料4
            if (!StringUtils.isEmpty(dto.getCl4mingcheng())) {
                name = dto.getCl4mingcheng();

                //查询 每种材料对应的 料仓号、剩余量
                WuLiaoDetailDTO detailDTO = wuliaoshangliaoshunxubiaoDao.queryDetail(name);
                if (null != detailDTO) {
                    //设置料仓号
                    aDo.setLiaocanghao4(detailDTO.getLiaocanghao());
                    //设置材料名
                    aDo.setCl4mingcheng(name);
                    //设置剩余量
                    aDo.setCl4shengyuliang(detailDTO.getDangqianshuliang() - dto.getCl4shuliang() * dto.getShuliang());
                    detailDTO.setDangqianshuliang(aDo.getCl4shengyuliang().intValue());
                    wuliaoshangliaoshunxubiaoDao.updateLiaoCang(detailDTO);
                }
            }

            //材料5
            if (!StringUtils.isEmpty(dto.getCl5mingcheng())) {
                name = dto.getCl5mingcheng();

                //查询 每种材料对应的 料仓号、剩余量
                WuLiaoDetailDTO detailDTO = wuliaoshangliaoshunxubiaoDao.queryDetail(name);
                if (null != detailDTO) {
                    //设置料仓号
                    aDo.setLiaocanghao5(detailDTO.getLiaocanghao());
                    //设置材料名
                    aDo.setCl5mingcheng(name);
                    //设置剩余量
                    aDo.setCl5shengyuliang(detailDTO.getDangqianshuliang() - dto.getCl5shuliang() * dto.getShuliang());
                    detailDTO.setDangqianshuliang(aDo.getCl5shengyuliang().intValue());
                    wuliaoshangliaoshunxubiaoDao.updateLiaoCang(detailDTO);
                }
            }

            //材料6
            if (!StringUtils.isEmpty(dto.getCl6mingcheng())) {
                name = dto.getCl6mingcheng();

                //查询 每种材料对应的 料仓号、剩余量
                WuLiaoDetailDTO detailDTO = wuliaoshangliaoshunxubiaoDao.queryDetail(name);
                if (null != detailDTO) {
                    //设置料仓号
                    aDo.setLiaocanghao6(detailDTO.getLiaocanghao());
                    //设置材料名
                    aDo.setCl6mingcheng(name);
                    //设置剩余量
                    aDo.setCl6shengyuliang(detailDTO.getDangqianshuliang() - dto.getCl6shuliang() * dto.getShuliang());
                    detailDTO.setDangqianshuliang(aDo.getCl6shengyuliang().intValue());
                    wuliaoshangliaoshunxubiaoDao.updateLiaoCang(detailDTO);
                }
            }

            //材料7
            if (!StringUtils.isEmpty(dto.getCl7mingcheng())) {
                name = dto.getCl7mingcheng();

                //查询 每种材料对应的 料仓号、剩余量
                WuLiaoDetailDTO detailDTO = wuliaoshangliaoshunxubiaoDao.queryDetail(name);
                if (null != detailDTO) {
                    //设置料仓号
                    aDo.setLiaocanghao7(detailDTO.getLiaocanghao());
                    //设置材料名
                    aDo.setCl7mingcheng(name);
                    //设置剩余量
                    aDo.setCl7shengyuliang(detailDTO.getDangqianshuliang() - dto.getCl7shuliang() * dto.getShuliang());
                    detailDTO.setDangqianshuliang(aDo.getCl7shengyuliang().intValue());
                    wuliaoshangliaoshunxubiaoDao.updateLiaoCang(detailDTO);
                }
            }

            //材料8
            if (!StringUtils.isEmpty(dto.getCl8mingcheng())) {
                name = dto.getCl8mingcheng();

                //查询 每种材料对应的 料仓号、剩余量
                WuLiaoDetailDTO detailDTO = wuliaoshangliaoshunxubiaoDao.queryDetail(name);
                if (null != detailDTO) {
                    //设置料仓号
                    aDo.setLiaocanghao8(detailDTO.getLiaocanghao());
                    //设置材料名
                    aDo.setCl8mingcheng(name);
                    //设置剩余量
                    aDo.setCl8shengyuliang(detailDTO.getDangqianshuliang() - dto.getCl8shuliang() * dto.getShuliang());
                    detailDTO.setDangqianshuliang(aDo.getCl8shengyuliang().intValue());
                    wuliaoshangliaoshunxubiaoDao.updateLiaoCang(detailDTO);
                }

            }

            //材料9
            if (!StringUtils.isEmpty(dto.getCl9mingcheng())) {
                name = dto.getCl9mingcheng();

                //查询 每种材料对应的 料仓号、剩余量
                WuLiaoDetailDTO detailDTO = wuliaoshangliaoshunxubiaoDao.queryDetail(name);
                if (null != detailDTO) {
                    //设置料仓号
                    aDo.setLiaocanghao9(detailDTO.getLiaocanghao());
                    //设置材料名
                    aDo.setCl9mingcheng(name);
                    //设置剩余量
                    aDo.setCl9shengyuliang(detailDTO.getDangqianshuliang() - dto.getCl9shuliang() * dto.getShuliang());
                    detailDTO.setDangqianshuliang(aDo.getCl9shengyuliang().intValue());
                    wuliaoshangliaoshunxubiaoDao.updateLiaoCang(detailDTO);
                }

            }

            //材料10
            if (!StringUtils.isEmpty(dto.getCl10mingcheng())) {
                name = dto.getCl10mingcheng();

                //查询 每种材料对应的 料仓号、剩余量
                WuLiaoDetailDTO detailDTO = wuliaoshangliaoshunxubiaoDao.queryDetail(name);
                if (null != detailDTO) {
                    //设置料仓号
                    aDo.setLiaocanghao10(detailDTO.getLiaocanghao());
                    //设置材料名
                    aDo.setCl10mingcheng(name);
                    //设置剩余量
                    aDo.setCl10shengyuliang(detailDTO.getDangqianshuliang() - dto.getCl10shuliang() * dto.getShuliang());
                    detailDTO.setDangqianshuliang(aDo.getCl10shengyuliang().intValue());
                    wuliaoshangliaoshunxubiaoDao.updateLiaoCang(detailDTO);
                }

            }

            //材料11
            if (!StringUtils.isEmpty(dto.getCl11mingcheng())) {
                name = dto.getCl11mingcheng();

                //查询 每种材料对应的 料仓号、剩余量
                WuLiaoDetailDTO detailDTO = wuliaoshangliaoshunxubiaoDao.queryDetail(name);
                if (null != detailDTO) {
                    //设置料仓号
                    aDo.setLiaocanghao11(detailDTO.getLiaocanghao());
                    //设置材料名
                    aDo.setCl11mingcheng(name);
                    //设置剩余量
                    aDo.setCl11shengyuliang(detailDTO.getDangqianshuliang() - dto.getCl11shuliang() * dto.getShuliang());
                    detailDTO.setDangqianshuliang(aDo.getCl11shengyuliang().intValue());
                    wuliaoshangliaoshunxubiaoDao.updateLiaoCang(detailDTO);
                }

            }

            //材料12
            if (!StringUtils.isEmpty(dto.getCl12mingcheng())) {
                name = dto.getCl12mingcheng();

                //查询 每种材料对应的 料仓号、剩余量
                WuLiaoDetailDTO detailDTO = wuliaoshangliaoshunxubiaoDao.queryDetail(name);
                if (null != detailDTO) {
                    //设置料仓号
                    aDo.setLiaocanghao12(detailDTO.getLiaocanghao());
                    //设置材料名
                    aDo.setCl12mingcheng(name);
                    //设置剩余量
                    aDo.setCl12shengyuliang(detailDTO.getDangqianshuliang() - dto.getCl12shuliang() * dto.getShuliang());
                    detailDTO.setDangqianshuliang(aDo.getCl12shengyuliang().intValue());
                    wuliaoshangliaoshunxubiaoDao.updateLiaoCang(detailDTO);
                }

            }

            //材料13
            if (!StringUtils.isEmpty(dto.getCl13mingcheng())) {
                name = dto.getCl13mingcheng();

                //查询 每种材料对应的 料仓号、剩余量
                WuLiaoDetailDTO detailDTO = wuliaoshangliaoshunxubiaoDao.queryDetail(name);
                if (null != detailDTO) {
                    //设置料仓号
                    aDo.setLiaocanghao13(detailDTO.getLiaocanghao());
                    //设置材料名
                    aDo.setCl13mingcheng(name);
                    //设置剩余量
                    aDo.setCl13shengyuliang(detailDTO.getDangqianshuliang() - dto.getCl13shuliang() * dto.getShuliang());
                    detailDTO.setDangqianshuliang(aDo.getCl13shengyuliang().intValue());
                    wuliaoshangliaoshunxubiaoDao.updateLiaoCang(detailDTO);
                }

            }

            //材料14
            if (!StringUtils.isEmpty(dto.getCl14mingcheng())) {
                name = dto.getCl14mingcheng();

                //查询 每种材料对应的 料仓号、剩余量
                WuLiaoDetailDTO detailDTO = wuliaoshangliaoshunxubiaoDao.queryDetail(name);
                if (null != detailDTO) {
                    //设置料仓号
                    aDo.setLiaocanghao14(detailDTO.getLiaocanghao());
                    //设置材料名
                    aDo.setCl14mingcheng(name);
                    //设置剩余量
                    aDo.setCl14shengyuliang(detailDTO.getDangqianshuliang() - dto.getCl14shuliang() * dto.getShuliang());
                    detailDTO.setDangqianshuliang(aDo.getCl14shengyuliang().intValue());
                    wuliaoshangliaoshunxubiaoDao.updateLiaoCang(detailDTO);
                }

            }

            //材料15
            if (!StringUtils.isEmpty(dto.getCl15mingcheng())) {
                name = dto.getCl15mingcheng();

                //查询 每种材料对应的 料仓号、剩余量
                WuLiaoDetailDTO detailDTO = wuliaoshangliaoshunxubiaoDao.queryDetail(name);
                if (null != detailDTO) {
                    //设置料仓号
                    aDo.setLiaocanghao15(detailDTO.getLiaocanghao());
                    //设置材料名
                    aDo.setCl15mingcheng(name);
                    //设置剩余量
                    aDo.setCl15shengyuliang(detailDTO.getDangqianshuliang() - dto.getCl15shuliang() * dto.getShuliang());
                    detailDTO.setDangqianshuliang(aDo.getCl15shengyuliang().intValue());
                    wuliaoshangliaoshunxubiaoDao.updateLiaoCang(detailDTO);
                }

            }

            //材料16
            if (!StringUtils.isEmpty(dto.getCl16mingcheng())) {
                name = dto.getCl16mingcheng();

                //查询 每种材料对应的 料仓号、剩余量
                WuLiaoDetailDTO detailDTO = wuliaoshangliaoshunxubiaoDao.queryDetail(name);
                if (null != detailDTO) {
                    //设置料仓号
                    aDo.setLiaocanghao16(detailDTO.getLiaocanghao());
                    //设置材料名
                    aDo.setCl16mingcheng(name);
                    //设置剩余量
                    aDo.setCl16shengyuliang(detailDTO.getDangqianshuliang() - dto.getCl16shuliang() * dto.getShuliang());
                    detailDTO.setDangqianshuliang(aDo.getCl16shengyuliang().intValue());
                    wuliaoshangliaoshunxubiaoDao.updateLiaoCang(detailDTO);
                }

            }

            //材料17
            if (!StringUtils.isEmpty(dto.getCl17mingcheng())) {
                name = dto.getCl17mingcheng();

                //查询 每种材料对应的 料仓号、剩余量
                WuLiaoDetailDTO detailDTO = wuliaoshangliaoshunxubiaoDao.queryDetail(name);
                if (null != detailDTO) {
                    //设置料仓号
                    aDo.setLiaocanghao17(detailDTO.getLiaocanghao());
                    //设置材料名
                    aDo.setCl17mingcheng(name);
                    //设置剩余量
                    aDo.setCl17shengyuliang(detailDTO.getDangqianshuliang() - dto.getCl17shuliang() * dto.getShuliang());
                    detailDTO.setDangqianshuliang(aDo.getCl17shengyuliang().intValue());
                    wuliaoshangliaoshunxubiaoDao.updateLiaoCang(detailDTO);
                }

            }


            //材料18
            if (!StringUtils.isEmpty(dto.getCl18mingcheng())) {
                name = dto.getCl18mingcheng();
                //查询 每种材料对应的 料仓号、剩余量
                WuLiaoDetailDTO detailDTO = wuliaoshangliaoshunxubiaoDao.queryDetail(name);
                if (null != detailDTO) {
                    //设置料仓号
                    aDo.setLiaocanghao18(detailDTO.getLiaocanghao());
                    //设置材料名
                    aDo.setCl18mingcheng(name);
                    //设置剩余量
                    aDo.setCl18shengyuliang(detailDTO.getDangqianshuliang() - dto.getCl18shuliang() * dto.getShuliang());
                    detailDTO.setDangqianshuliang(aDo.getCl18shengyuliang().intValue());
                    wuliaoshangliaoshunxubiaoDao.updateLiaoCang(detailDTO);
                }

            }

            //材料19
            if (!StringUtils.isEmpty(dto.getCl19mingcheng())) {
                name = dto.getCl19mingcheng();
                //查询 每种材料对应的 料仓号、剩余量
                WuLiaoDetailDTO detailDTO = wuliaoshangliaoshunxubiaoDao.queryDetail(name);
                if (null != detailDTO) {
                    //设置料仓号
                    aDo.setLiaocanghao19(detailDTO.getLiaocanghao());
                    //设置材料名
                    aDo.setCl19mingcheng(name);
                    //设置剩余量
                    aDo.setCl19shengyuliang(detailDTO.getDangqianshuliang() - dto.getCl19shuliang() * dto.getShuliang());
                    detailDTO.setDangqianshuliang(aDo.getCl19shengyuliang().intValue());
                    wuliaoshangliaoshunxubiaoDao.updateLiaoCang(detailDTO);
                }

            }

            //材料20
            if (!StringUtils.isEmpty(dto.getCl20mingcheng())) {
                name = dto.getCl20mingcheng();
                //查询 每种材料对应的 料仓号、剩余量
                WuLiaoDetailDTO detailDTO = wuliaoshangliaoshunxubiaoDao.queryDetail(name);
                if (null != detailDTO) {
                    //设置料仓号
                    aDo.setLiaocanghao20(detailDTO.getLiaocanghao());
                    //设置材料名
                    aDo.setCl20mingcheng(name);
                    //设置剩余量
                    aDo.setCl20shengyuliang(detailDTO.getDangqianshuliang() - dto.getCl20shuliang() * dto.getShuliang());
                    detailDTO.setDangqianshuliang(aDo.getCl20shengyuliang().intValue());
                    wuliaoshangliaoshunxubiaoDao.updateLiaoCang(detailDTO);
                }
            }

            //放进List

            result.add(aDo);

        }

        return result;
    }

    @Override
    public int count2() {
        return wuliaoshangliaoshunxubiaoDao.count2();
    }


    @Override
    public int count(Map<String, Object> map) {
        return wuliaoshangliaoshunxubiaoDao.count(map);
    }

    @Override
    public WuliaoshangliaoshunxubiaoDO get(Integer id) {
        return wuliaoshangliaoshunxubiaoDao.get(id);
    }

    @Override
    public String query(String name) {
        return wuliaoshangliaoshunxubiaoDao.query(name);
    }


}
