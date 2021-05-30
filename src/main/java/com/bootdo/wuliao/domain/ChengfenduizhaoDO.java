package com.bootdo.wuliao.domain;

import java.util.Date;

/**
 * 跟前端展示对应
 */
public class ChengfenduizhaoDO {
    private String name;
    private Integer picihao;
    private Date riqi;
    private  String changjia;
    private String zhibaoshu;
    private String huayanshi;
    private String zhuangtai; //状态（由zhiBaiFenBi 和 huaBaiFenBi 的值 对比得出）

    public String getZhuangtai() {
        return zhuangtai;
    }

    public void setZhuangtai(String zhuangtai) {
        this.zhuangtai = zhuangtai;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getZhibaoshu() {
        return zhibaoshu;
    }

    public void setZhibaoshu(String zhibaoshu) {
        this.zhibaoshu = zhibaoshu;
    }

    public String getHuayanshi() {
        return huayanshi;
    }

    public void setHuayanshi(String huayanshi) {
        this.huayanshi = huayanshi;
    }

    public Integer getPicihao() {
        return picihao;
    }

    public void setPicihao(Integer picihao) {
        this.picihao = picihao;
    }

    public Date getRiqi() {
        return riqi;
    }

    public void setRiqi(Date riqi) {
        this.riqi = riqi;
    }

    public String getChangjia() {
        return changjia;
    }

    public void setChangjia(String changjia) {
        this.changjia = changjia;
    }
}
