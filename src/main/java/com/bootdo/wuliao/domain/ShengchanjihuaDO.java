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
public class ShengchanjihuaDO implements Serializable {
	private static final long serialVersionUID = 1L;
	
	//ID
	private Integer id;
	//炉次
	private String luci;

	private  String jihao;
	//年月日
	private Date nianyueri;
	//日期时间
	private Date riqishijian;
	//班次
	private String banci;
	//种类
	private String zhonglei;
	//数量
	private Float shuliang;
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
	 * 设置：炉次
	 */
	public void setLuci(String luci) {
		this.luci = luci;
	}
	/**
	 * 获取：炉次
	 */
	public String getLuci() {
		return luci;
	}
	/**
	 * 设置：年月日
	 */
	public void setNianyueri(Date nianyueri) {
		this.nianyueri = nianyueri;
	}
	/**
	 * 获取：年月日
	 */
	public Date getNianyueri() {
		return nianyueri;
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
	 * 设置：班次
	 */
	public void setBanci(String banci) {
		this.banci = banci;
	}
	/**
	 * 获取：班次
	 */
	public String getBanci() {
		return banci;
	}
	/**
	 * 设置：种类
	 */
	public void setZhonglei(String zhonglei) {
		this.zhonglei = zhonglei;
	}
	/**
	 * 获取：种类
	 */
	public String getZhonglei() {
		return zhonglei;
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

	public String getJihao() {
		return jihao;
	}

	public void setJihao(String jihao) {
		this.jihao = jihao;
	}
}
