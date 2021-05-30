package com.bootdo.wuliao.domain;

import java.io.Serializable;
import java.util.Date;



/**
 * 
 * 
 * @author ktt
 * @email 1035964900@qq.com
 * @date 2020-12-21 17:09:17
 */
public class CheliangxinxiDO implements Serializable {
	private static final long serialVersionUID = 1L;
	
	//ID
	private Integer id;
	//车号
	private String chehao;
	//状态
	private String zhuangtai;
	//备注
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
	/**
	 * 设置：车号
	 */
	public void setChehao(String chehao) {
		this.chehao = chehao;
	}
	/**
	 * 获取：车号
	 */
	public String getChehao() {
		return chehao;
	}
	/**
	 * 设置：状态
	 */
	public void setZhuangtai(String zhuangtai) {
		this.zhuangtai = zhuangtai;
	}
	/**
	 * 获取：状态
	 */
	public String getZhuangtai() {
		return zhuangtai;
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
