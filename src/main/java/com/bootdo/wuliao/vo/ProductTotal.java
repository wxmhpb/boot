package com.bootdo.wuliao.vo;
import lombok.Data;
import lombok.ToString;

import com.bootdo.wuliao.domain.LiaocangyuliangbiaoDO;

@Data
@ToString
public  class ProductTotal implements Comparable<ProductTotal>{
    private String liaocangmingcheng;
    /**
     * 当前品种
     */
    private String dangqianpinzhong;
    private Float dangqianzongshuliang;






    @Override
    public int compareTo(ProductTotal o) {

        //  return (int)(o.getDangqianzongshuliang() - this.getDangqianzongshuliang());
        return (int)( this.getDangqianzongshuliang()-o.getDangqianzongshuliang());
    }


}
