package com.bootdo.wuliao.domain;

import java.util.List;

public class WuliaoshangliaoshunxubiaoDO2 {
    //炉次
    private String luci;

    //材料List
    private List<CaiLiaoDetail> list;

    public String getLuci() {
        return luci;
    }

    public void setLuci(String luci) {
        this.luci = luci;
    }


    public List<CaiLiaoDetail> getList() {
        return list;
    }

    public void setList(List<CaiLiaoDetail> list) {
        this.list = list;
    }
}
