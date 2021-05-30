package com.bootdo.wuliao.domain.dto;

/**
 * 物料详情DTO
 *
 * @author liangqi
 * @date 2021/1/25 20:01
 */
public class WuLiaoDetailDTO {

    private Integer liaocanghao;

    private Integer dangqianshuliang;

    public Integer getLiaocanghao() {
        return liaocanghao;
    }

    public void setLiaocanghao(Integer liaocanghao) {
        this.liaocanghao = liaocanghao;
    }

    public Integer getDangqianshuliang() {
        return dangqianshuliang;
    }

    public void setDangqianshuliang(Integer dangqianshuliang) {
        this.dangqianshuliang = dangqianshuliang;
    }
}
