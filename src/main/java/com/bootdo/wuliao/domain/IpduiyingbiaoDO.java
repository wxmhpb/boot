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
public class IpduiyingbiaoDO implements Serializable {
	private static final long serialVersionUID = 1L;
	
	//ID
	private Integer id;
	//IP
	private String ip;

	private String duankouhao;
	//名称
	private String mingcheng;
	//类型
	private String leixing;
	//料仓号
	private Integer liaocanghao;
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
	 * 设置：IP
	 */
	public void setIp(String ip) {
		this.ip = ip;
	}
	/**
	 * 获取：IP
	 */
	public String getIp() {
		return ip;
	}
	/**
	 * 设置：名称
	 */
	public void setMingcheng(String mingcheng) {
		this.mingcheng = mingcheng;
	}
	/**
	 * 获取：名称
	 */
	public String getMingcheng() {
		return mingcheng;
	}
	/**
	 * 设置：类型
	 */
	public void setLeixing(String leixing) {
		this.leixing = leixing;
	}
	/**
	 * 获取：类型
	 */
	public String getLeixing() {
		return leixing;
	}
	/**
	 * 设置：料仓号
	 */
	public void setLiaocanghao(Integer liaocanghao) {
		this.liaocanghao = liaocanghao;
	}
	/**
	 * 获取：料仓号
	 */
	public Integer getLiaocanghao() {
		return liaocanghao;
	}
	/**
	 * 设置：状态
	 */
	public void setZhuangtai(String zhuangtai) {
		this.zhuangtai = zhuangtai;
	}

	public String getDuankouhao() {
		return duankouhao;
	}

	public void setDuankouhao(String duankouhao) {
		this.duankouhao = duankouhao;
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
