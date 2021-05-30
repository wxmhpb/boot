package com.bootdo.wuliao.domain.dto;

import java.util.Date;

/**
 * 对应 sql 查询的结果
 *
 * @author liangqi
 * @date 2021/1/12 21:41
 */
public class ChengFenDuiZhaoDTO {
    /**
     * 质保书
     */
    private Integer zhiId;
    private String zhiName;
    private Integer zhiPiCiHao;
    private  String zhiLaiYuan;
    private Date zhiRiQi;

    private  String zhiChangJia;
    private String zhiBaiFenBi;

    /**
     * 化验室
     */
    private Integer huaId;
    private String huaName;
    private Integer huaPiCiHao;
    private  String huaLaiYuan;
    private Date huaRiQi;

    private  String huaChangJia;
    private String huaBaiFenBi;

    public Integer getZhiId() {
        return zhiId;
    }

    public void setZhiId(Integer zhiId) {
        this.zhiId = zhiId;
    }

    public String getZhiName() {
        return zhiName;
    }

    public void setZhiName(String zhiName) {
        this.zhiName = zhiName;
    }

    public String getZhiBaiFenBi() {
        return zhiBaiFenBi;
    }

    public void setZhiBaiFenBi(String zhiBaiFenBi) {
        this.zhiBaiFenBi = zhiBaiFenBi;
    }

    public Integer getHuaId() {
        return huaId;
    }

    public void setHuaId(Integer huaId) {
        this.huaId = huaId;
    }

    public String getHuaName() {
        return huaName;
    }

    public void setHuaName(String huaName) {
        this.huaName = huaName;
    }

    public String getHuaBaiFenBi() {
        return huaBaiFenBi;
    }

    public void setHuaBaiFenBi(String huaBaiFenBi) {
        this.huaBaiFenBi = huaBaiFenBi;
    }

    public Integer getZhiPiCiHao() {
        return zhiPiCiHao;
    }

    public void setZhiPiCiHao(Integer zhiPiCiHao) {
        this.zhiPiCiHao = zhiPiCiHao;
    }

    public String getZhiLaiYuan() {
        return zhiLaiYuan;
    }

    public void setZhiLaiYuan(String zhiLaiYuan) {
        this.zhiLaiYuan = zhiLaiYuan;
    }

    public Date getZhiRiQi() {
        return zhiRiQi;
    }

    public void setZhiRiQi(Date zhiRiQi) {
        this.zhiRiQi = zhiRiQi;
    }

    public String getZhiChangJia() {
        return zhiChangJia;
    }

    public void setZhiChangJia(String zhiChangJia) {
        this.zhiChangJia = zhiChangJia;
    }

    public Integer getHuaPiCiHao() {
        return huaPiCiHao;
    }

    public void setHuaPiCiHao(Integer huaPiCiHao) {
        this.huaPiCiHao = huaPiCiHao;
    }

    public String getHuaLaiYuan() {
        return huaLaiYuan;
    }

    public void setHuaLaiYuan(String huaLaiYuan) {
        this.huaLaiYuan = huaLaiYuan;
    }

    public Date getHuaRiQi() {
        return huaRiQi;
    }

    public void setHuaRiQi(Date huaRiQi) {
        this.huaRiQi = huaRiQi;
    }

    public String getHuaChangJia() {
        return huaChangJia;
    }

    public void setHuaChangJia(String huaChangJia) {
        this.huaChangJia = huaChangJia;
    }
}
