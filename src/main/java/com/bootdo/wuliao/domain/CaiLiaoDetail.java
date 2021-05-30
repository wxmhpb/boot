package com.bootdo.wuliao.domain;

/**
 * 材料详情
 *
 * @author liangqi
 * @date 2021/1/25 23:33
 */
public class CaiLiaoDetail {

    //材料名称
    private String mingcheng;
    //材料数量
    private Float shengyuliang;
    //料仓号
    private Integer liaocanghao;

    public String getMingcheng() {
        return mingcheng;
    }

    public void setMingcheng(String mingcheng) {
        this.mingcheng = mingcheng;
    }

    public Float getShengyuliang() {
        return shengyuliang;
    }

    public void setShengyuliang(Float shengyuliang) {
        this.shengyuliang = shengyuliang;
    }

    public Integer getLiaocanghao() {
        return liaocanghao;
    }

    public void setLiaocanghao(Integer liaocanghao) {
        this.liaocanghao = liaocanghao;
    }
}
