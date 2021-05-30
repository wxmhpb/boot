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
public class ChelianglahuoDO implements Serializable {
	private static final long serialVersionUID = 1L;
	
	//ID
	private Integer id;
	//车号
	private String chehao;
	//品种
	private String pinzhong;
	//数量
	private Float shuliang;
	//日期时间
	private Date riqishijian;
	//当天车数
	private Integer dangtiancheshu;
	//送入料仓号
	private Integer liaocanghao;
	//状态
	private String zhuangtai;
	//备注
	private String beizhu;

	private Integer picihao;

	private String chengfen;

	private Integer shifuruku;

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
	 * 设置：品种
	 */
	public void setPinzhong(String pinzhong) {
		this.pinzhong = pinzhong;
	}
	/**
	 * 获取：品种
	 */
	public String getPinzhong() {
		return pinzhong;
	}
	/**
	 * 设置：数量
	 */
	public void setShuliang(Float shuliang) {
		this.shuliang = shuliang;
	}
	/**
	 * 获取：数量
	 */
	public Float getShuliang() {
		return shuliang;
	}
	/**
	 * 设置：日期时间
	 */
	public void setRiqishijian(Date riqishijian) {
		this.riqishijian = riqishijian;
	}
	/**
	 * 获取：日期时间
	 */
	public Date getRiqishijian() {
		return riqishijian;
	}
	/**
	 * 设置：当天车数
	 */
	public void setDangtiancheshu(Integer dangtiancheshu) {
		this.dangtiancheshu = dangtiancheshu;
	}
	/**
	 * 获取：当天车数
	 */
	public Integer getDangtiancheshu() {
		return dangtiancheshu;
	}
	/**
	 * 设置：送入料仓号
	 */
	public void setLiaocanghao(Integer liaocanghao) {
		this.liaocanghao = liaocanghao;
	}
	/**
	 * 获取：送入料仓号
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


	public static long getSerialVersionUID() {
		return serialVersionUID;
	}

	public Integer getPicihao() {
		return picihao;
	}

	public void setPicihao(Integer picihao) {
		this.picihao = picihao;
	}

	public String getChengfen() {
		return chengfen;
	}

	public void setChengfen(String chengfen) {
		this.chengfen = chengfen;
	}

	public Integer getShifuruku() {
		return shifuruku;
	}

	public void setShifuruku(Integer shifuruku) {
		this.shifuruku = shifuruku;
	}
}
