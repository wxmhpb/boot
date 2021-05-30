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
public class LiaocangyuliangbiaoDO implements Serializable {
	private static final long serialVersionUID = 1L;
	
	//ID
	private Integer id;
	//料仓号
	private Integer liaocanghao;
	//料仓名称
	private String liaocangmingcheng;
	//当前品种
	private String dangqianpinzhong;
	//数量
	private Integer dangqianshuliang;
	//车间
	private String gongxu;
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
	 * 设置：料仓名称
	 */
	public void setLiaocangmingcheng(String liaocangmingcheng) {
		this.liaocangmingcheng = liaocangmingcheng;
	}
	/**
	 * 获取：料仓名称
	 */
	public String getLiaocangmingcheng() {
		return liaocangmingcheng;
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
		this.dangqianshuliang = dangqianshuliang;
	}
	/**
	 * 获取：数量
	 */
	public Integer getDangqianshuliang() {
		return dangqianshuliang;
	}
	/**
	 * 设置：车间
	 */
	public void setGongxu(String gongxu) {
		this.gongxu = gongxu;
	}
	/**
	 * 获取：车间
	 */
	public String getGongxu() {
		return gongxu;
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
