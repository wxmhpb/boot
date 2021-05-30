package com.bootdo.wuliao.domain;

import java.io.Serializable;
import java.util.Date;



/**
 * 
 * 
 * @author ktt
 * @email 1035964900@qq.com
 * @date 2021-01-12 13:10:03
 */
public class HuayanshiDO implements Serializable {
	private static final long serialVersionUID = 1L;
	
	//
	private Integer id;
	//
	private String name;
	private Integer picihao;

	private  String laiyuan;

	private  Date riqi;
	private  String changjia;
	//
	private String baifenbi;

	/**
	 * 设置：
	 */
	public void setId(Integer id) {
		this.id = id;
	}
	/**
	 * 获取：
	 */
	public Integer getId() {
		return id;
	}
	/**
	 * 设置：
	 */
	public void setName(String name) {
		this.name = name;
	}
	/**
	 * 获取：
	 */
	public String getName() {
		return name;
	}
	/**
	 * 设置：
	 */
	public void setBaifenbi(String baifenbi) {
		this.baifenbi = baifenbi;
	}
	/**
	 * 获取：
	 */
	public String getBaifenbi() {
		return baifenbi;
	}

	public static long getSerialVersionUID() {
		return serialVersionUID;
	}

	public Integer getPicihao() {
		return picihao;
	}

	public void setPicihao(Integer picihao) {
		this.picihao = picihao;
	}

	public String getLaiyuan() {
		return laiyuan;
	}

	public void setLaiyuan(String laiyuan) {
		this.laiyuan = laiyuan;
	}

	public Date getRiqi() {
		return riqi;
	}

	public void setRiqi(Date riqi) {
		this.riqi = riqi;
	}

	public String getChangjia() {
		return changjia;
	}

	public void setChangjia(String changjia) {
		this.changjia = changjia;
	}
}
