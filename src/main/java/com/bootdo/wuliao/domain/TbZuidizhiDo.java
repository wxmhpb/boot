package com.bootdo.wuliao.domain;


import java.io.Serializable;

import lombok.Data;

/**
 * 
 * 
 * @author chaiwenqiang
 * @email chaiwenqiang6569@gmail.com
 * @date 2021-06-24 13:57:50
 */
@Data
public class TbZuidizhiDo implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 * ID
	 */
	private Integer id;
	/**
	 * 料仓名称
	 */
	private String liaocangmingcheng;
	/**
	 * 当前品种
	 */
	private String dangqianpinzhong;
	/**
	 * 最少数量
	 */
	private Integer zuishaoshuliang;
	/**
	 * 备注
	 */
	private String beizhu;
	/**
	 * 设置：ID
	 */

	public void setId(Integer id) {
		this.id = id;
	}
	/**
	 * 获取：ID
	 */
	public Integer getId() {
		return id;
	}


	public String getLiaocangmingcheng() {
		return liaocangmingcheng;
	}

	public void setLiaocangmingcheng(String liaocangmingcheng) {
		this.liaocangmingcheng = liaocangmingcheng;
	}

	public Integer getZuishaoshuliang() {
		return zuishaoshuliang;
	}

	public void setZuishaoshuliang(Integer zuishaoshuliang) {
		this.zuishaoshuliang = zuishaoshuliang;
	}

	/**
	 * 设置：当前品种
	 */
	public void setDangqianpinzhong(String dangqianpinzhong) {
		this.dangqianpinzhong = dangqianpinzhong;
	}
	/**
	 * 获取：当前品种
	 */
	public String getDangqianpinzhong() {
		return dangqianpinzhong;
	}
	/**
	 * 设置：数量
	 */
	public void setDangqianshuliang(Integer dangqianshuliang) {
		this.zuishaoshuliang = dangqianshuliang;
	}
	/**
	 * 获取：数量
	 */
	public Integer getDangqianshuliang() {
		return zuishaoshuliang;
	}
	/**
	 * 设置：备注
	 */
	public void setBeizhu(String beizhu) {
		this.beizhu = beizhu;
	}
	/**
	 * 获取：备注
	 */
	public String getBeizhu() {
		return beizhu;
	}
}

