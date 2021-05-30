package com.bootdo.wuliao.domain.dto;

/**
 * 对应第一个sql查询结果
 * ## 1、查出 每个炉次的CL1MingCheng~CL2MingCheng
 *      select a.LuCi,
 *      b.*
 *      from tb_shengchanjihua a,tb_gongyidan b
 *      where a.JiHao = b.JiHao;
 *
 * @author liangqi
 */
public class GongYiDanDTO {
    //炉次
    private String luci;

    private Integer shuliang;

    // 工艺单表中的材料1名称
    // 材料1名称
    private String cl1mingcheng;
    // 工艺单表中的数量
    //材料1数量
    private Float cl1shuliang;
    //材料2名称
    private String cl2mingcheng;
    //材料2数量
    private Float cl2shuliang;
    //材料3名称
    private String cl3mingcheng;
    //材料3数量
    private Float cl3shuliang;
    //材料4名称
    private String cl4mingcheng;
    //材料4数量
    private Float cl4shuliang;
    //材料5名称
    private String cl5mingcheng;
    //材料5数量
    private Float cl5shuliang;
    //材料6名称
    private String cl6mingcheng;
    //材料6数量
    private Float cl6shuliang;
    //材料7名称
    private String cl7mingcheng;
    //材料7数量
    private Float cl7shuliang;
    //材料8名称
    private String cl8mingcheng;
    //材料8数量
    private Float cl8shuliang;
    //材料9名称
    private String cl9mingcheng;
    //材料9数量
    private Float cl9shuliang;
    //材料10名称
    private String cl10mingcheng;
    //材料10数量
    private Float cl10shuliang;
    //材料11名称
    private String cl11mingcheng;
    //材料11数量
    private Float cl11shuliang;
    //材料12名称
    private String cl12mingcheng;
    //材料12数量
    private Float cl12shuliang;
    //材料13名称
    private String cl13mingcheng;
    //材料13数量
    private Float cl13shuliang;
    //材料14名称
    private String cl14mingcheng;
    //材料14数量
    private Float cl14shuliang;
    //材料15名称
    private String cl15mingcheng;
    //材料15数量
    private Float cl15shuliang;
    //材料16名称
    private String cl16mingcheng;
    //材料16数量
    private Float cl16shuliang;
    //材料17名称
    private String cl17mingcheng;
    //材料17数量
    private Float cl17shuliang;
    //材料18名称
    private String cl18mingcheng;
    //材料18数量
    private Float cl18shuliang;
    //材料19名称
    private String cl19mingcheng;
    //材料19数量
    private Float cl19shuliang;
    //材料20名称
    private String cl20mingcheng;
    //材料20数量
    private Float cl20shuliang;

    public Integer getShuliang() {
        return shuliang;
    }

    public void setShuliang(Integer shuliang) {
        this.shuliang = shuliang;
    }

    public String getLuci() {
        return luci;
    }

    public void setLuci(String luci) {
        this.luci = luci;
    }

    public String getCl1mingcheng() {
        return cl1mingcheng;
    }

    public void setCl1mingcheng(String cl1mingcheng) {
        this.cl1mingcheng = cl1mingcheng;
    }

    public Float getCl1shuliang() {
        return cl1shuliang;
    }

    public void setCl1shuliang(Float cl1shuliang) {
        this.cl1shuliang = cl1shuliang;
    }

    public String getCl2mingcheng() {
        return cl2mingcheng;
    }

    public void setCl2mingcheng(String cl2mingcheng) {
        this.cl2mingcheng = cl2mingcheng;
    }

    public Float getCl2shuliang() {
        return cl2shuliang;
    }

    public void setCl2shuliang(Float cl2shuliang) {
        this.cl2shuliang = cl2shuliang;
    }

    public String getCl3mingcheng() {
        return cl3mingcheng;
    }

    public void setCl3mingcheng(String cl3mingcheng) {
        this.cl3mingcheng = cl3mingcheng;
    }

    public Float getCl3shuliang() {
        return cl3shuliang;
    }

    public void setCl3shuliang(Float cl3shuliang) {
        this.cl3shuliang = cl3shuliang;
    }

    public String getCl4mingcheng() {
        return cl4mingcheng;
    }

    public void setCl4mingcheng(String cl4mingcheng) {
        this.cl4mingcheng = cl4mingcheng;
    }

    public Float getCl4shuliang() {
        return cl4shuliang;
    }

    public void setCl4shuliang(Float cl4shuliang) {
        this.cl4shuliang = cl4shuliang;
    }

    public String getCl5mingcheng() {
        return cl5mingcheng;
    }

    public void setCl5mingcheng(String cl5mingcheng) {
        this.cl5mingcheng = cl5mingcheng;
    }

    public Float getCl5shuliang() {
        return cl5shuliang;
    }

    public void setCl5shuliang(Float cl5shuliang) {
        this.cl5shuliang = cl5shuliang;
    }

    public String getCl6mingcheng() {
        return cl6mingcheng;
    }

    public void setCl6mingcheng(String cl6mingcheng) {
        this.cl6mingcheng = cl6mingcheng;
    }

    public Float getCl6shuliang() {
        return cl6shuliang;
    }

    public void setCl6shuliang(Float cl6shuliang) {
        this.cl6shuliang = cl6shuliang;
    }

    public String getCl7mingcheng() {
        return cl7mingcheng;
    }

    public void setCl7mingcheng(String cl7mingcheng) {
        this.cl7mingcheng = cl7mingcheng;
    }

    public Float getCl7shuliang() {
        return cl7shuliang;
    }

    public void setCl7shuliang(Float cl7shuliang) {
        this.cl7shuliang = cl7shuliang;
    }

    public String getCl8mingcheng() {
        return cl8mingcheng;
    }

    public void setCl8mingcheng(String cl8mingcheng) {
        this.cl8mingcheng = cl8mingcheng;
    }

    public Float getCl8shuliang() {
        return cl8shuliang;
    }

    public void setCl8shuliang(Float cl8shuliang) {
        this.cl8shuliang = cl8shuliang;
    }

    public String getCl9mingcheng() {
        return cl9mingcheng;
    }

    public void setCl9mingcheng(String cl9mingcheng) {
        this.cl9mingcheng = cl9mingcheng;
    }

    public Float getCl9shuliang() {
        return cl9shuliang;
    }

    public void setCl9shuliang(Float cl9shuliang) {
        this.cl9shuliang = cl9shuliang;
    }

    public String getCl10mingcheng() {
        return cl10mingcheng;
    }

    public void setCl10mingcheng(String cl10mingcheng) {
        this.cl10mingcheng = cl10mingcheng;
    }

    public Float getCl10shuliang() {
        return cl10shuliang;
    }

    public void setCl10shuliang(Float cl10shuliang) {
        this.cl10shuliang = cl10shuliang;
    }

    public String getCl11mingcheng() {
        return cl11mingcheng;
    }

    public void setCl11mingcheng(String cl11mingcheng) {
        this.cl11mingcheng = cl11mingcheng;
    }

    public Float getCl11shuliang() {
        return cl11shuliang;
    }

    public void setCl11shuliang(Float cl11shuliang) {
        this.cl11shuliang = cl11shuliang;
    }

    public String getCl12mingcheng() {
        return cl12mingcheng;
    }

    public void setCl12mingcheng(String cl12mingcheng) {
        this.cl12mingcheng = cl12mingcheng;
    }

    public Float getCl12shuliang() {
        return cl12shuliang;
    }

    public void setCl12shuliang(Float cl12shuliang) {
        this.cl12shuliang = cl12shuliang;
    }

    public String getCl13mingcheng() {
        return cl13mingcheng;
    }

    public void setCl13mingcheng(String cl13mingcheng) {
        this.cl13mingcheng = cl13mingcheng;
    }

    public Float getCl13shuliang() {
        return cl13shuliang;
    }

    public void setCl13shuliang(Float cl13shuliang) {
        this.cl13shuliang = cl13shuliang;
    }

    public String getCl14mingcheng() {
        return cl14mingcheng;
    }

    public void setCl14mingcheng(String cl14mingcheng) {
        this.cl14mingcheng = cl14mingcheng;
    }

    public Float getCl14shuliang() {
        return cl14shuliang;
    }

    public void setCl14shuliang(Float cl14shuliang) {
        this.cl14shuliang = cl14shuliang;
    }

    public String getCl15mingcheng() {
        return cl15mingcheng;
    }

    public void setCl15mingcheng(String cl15mingcheng) {
        this.cl15mingcheng = cl15mingcheng;
    }

    public Float getCl15shuliang() {
        return cl15shuliang;
    }

    public void setCl15shuliang(Float cl15shuliang) {
        this.cl15shuliang = cl15shuliang;
    }

    public String getCl16mingcheng() {
        return cl16mingcheng;
    }

    public void setCl16mingcheng(String cl16mingcheng) {
        this.cl16mingcheng = cl16mingcheng;
    }

    public Float getCl16shuliang() {
        return cl16shuliang;
    }

    public void setCl16shuliang(Float cl16shuliang) {
        this.cl16shuliang = cl16shuliang;
    }

    public String getCl17mingcheng() {
        return cl17mingcheng;
    }

    public void setCl17mingcheng(String cl17mingcheng) {
        this.cl17mingcheng = cl17mingcheng;
    }

    public Float getCl17shuliang() {
        return cl17shuliang;
    }

    public void setCl17shuliang(Float cl17shuliang) {
        this.cl17shuliang = cl17shuliang;
    }

    public String getCl18mingcheng() {
        return cl18mingcheng;
    }

    public void setCl18mingcheng(String cl18mingcheng) {
        this.cl18mingcheng = cl18mingcheng;
    }

    public Float getCl18shuliang() {
        return cl18shuliang;
    }

    public void setCl18shuliang(Float cl18shuliang) {
        this.cl18shuliang = cl18shuliang;
    }

    public String getCl19mingcheng() {
        return cl19mingcheng;
    }

    public void setCl19mingcheng(String cl19mingcheng) {
        this.cl19mingcheng = cl19mingcheng;
    }

    public Float getCl19shuliang() {
        return cl19shuliang;
    }

    public void setCl19shuliang(Float cl19shuliang) {
        this.cl19shuliang = cl19shuliang;
    }

    public String getCl20mingcheng() {
        return cl20mingcheng;
    }

    public void setCl20mingcheng(String cl20mingcheng) {
        this.cl20mingcheng = cl20mingcheng;
    }

    public Float getCl20shuliang() {
        return cl20shuliang;
    }

    public void setCl20shuliang(Float cl20shuliang) {
        this.cl20shuliang = cl20shuliang;
    }
}