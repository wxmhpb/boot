package com.bootdo.system.domain;

import io.swagger.models.auth.In;

import java.io.Serializable;
import java.util.Date;



/**
 * 
 * 
 * @author ktt
 * @email 1035964900@qq.com
 * @date 2020-12-29 17:50:50
 */
public class WuliaoxinxiDO implements Serializable {
	private static final long serialVersionUID = 1L;
	
	//
	private int id;
	//
	private String name;

	private  String chengfen;
	private int shangjiid;

	public int getShangjiid() {
		return shangjiid;
	}

	public void setShangjiid(int shangjiid) {
		this.shangjiid = shangjiid;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
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

	public static long getSerialVersionUID() {
		return serialVersionUID;
	}


	public String getChengfen() {
		return chengfen;
	}

	public void setChengfen(String chengfen) {
		this.chengfen = chengfen;
	}
}
