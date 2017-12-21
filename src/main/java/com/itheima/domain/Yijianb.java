package com.itheima.domain;

import java.io.Serializable;

public class Yijianb implements Serializable{
	private long yiId;
	private String yijian;
	
	public long getYiId() {
		return yiId;
	}
	public void setYiId(long yiId) {
		this.yiId = yiId;
	}
	public String getYijian() {
		return yijian;
	}
	public void setYijian(String yijian) {
		this.yijian = yijian;
	}
}
