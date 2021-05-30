package com.bootdo.system.domain;

import java.io.Serializable;
import java.util.Date;



/**
 * 
 * 
 * @author ktt
 * @email 1035964900@qq.com
 * @date 2021-01-04 16:43:23
 */
public class ChanpinxinxiDO implements Serializable {
	private static final long serialVersionUID = 1L;
	
	//
	private int id;
	//
	private String name;
	//
    private int shangjiid;

	public void setName(String name) {
		this.name = name;
	}
	/**
	 * 获取：
	 */
	public String getName() {
		return name;
	}


	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getShangjiid() {
		return shangjiid;
	}

	public void setShangjiid(int shangjiid) {
		this.shangjiid = shangjiid;
	}
}
