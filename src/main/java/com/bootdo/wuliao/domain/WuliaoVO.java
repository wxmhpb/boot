package com.bootdo.wuliao.domain;

import java.io.Serializable;

public class WuliaoVO implements Serializable {

    //物料编号
    private Integer id;
    //品种
    private String pinzhong;
    //剩余量
    private Integer dangqianshuliang;

    //数量
    private Float shuliang;

    //差额
    private Float chae;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getPinzhong() {
        return pinzhong;
    }

    public void setPinzhong(String pinzhong) {
        this.pinzhong = pinzhong;
    }

    public Integer getDangqianshuliang() {
        return dangqianshuliang;
    }

    public void setDangqianshuliang(Integer dangqianshuliang) {
        this.dangqianshuliang = dangqianshuliang;
    }

    public Float getShuliang() {
        return shuliang;
    }

    public void setShuliang(Float shuliang) {
        this.shuliang = shuliang;
    }

    public Float getChae() {
        return chae;
    }

    public void setChae(Float chae) {
        this.chae = chae;
    }
}
