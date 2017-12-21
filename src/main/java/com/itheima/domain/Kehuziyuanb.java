package com.itheima.domain;

import java.io.Serializable;

public class Kehuziyuanb implements Serializable{
	private long khbId;
	private String tbr;
	private String qy;
	private String khmc;
	private String dz;
	private String khxxly;
	private String ybf;
	private String tbrq;   //Ìî±¨ÈÕÆÚ
	public String getTbrq() {
		return tbrq;
	}

	public void setTbrq(String tbrq) {
		this.tbrq = tbrq;
	}

	@Override
	public String toString() {
		return "Kehuziyuanb [khbId=" + khbId + ", qy=" + qy + ", khmc=" + khmc + ", dz=" + dz + ", khxxly=" + khxxly
				+ ", ybf=" + ybf + "]";
	}
	
	public String getTbr() {
		return tbr;
	}
	public void setTbr(String tbr) {
		this.tbr = tbr;
	}
	public long getKhbId() {
		return khbId;
	}
	public void setKhbId(long khbId) {
		this.khbId = khbId;
	}
	public String getQy() {
		return qy;
	}
	public void setQy(String qy) {
		this.qy = qy;
	}
	public String getKhmc() {
		return khmc;
	}
	public void setKhmc(String khmc) {
		this.khmc = khmc;
	}
	public String getDz() {
		return dz;
	}
	public void setDz(String dz) {
		this.dz = dz;
	}
	public String getKhxxly() {
		return khxxly;
	}
	public void setKhxxly(String khxxly) {
		this.khxxly = khxxly;
	}
	public String getYbf() {
		return ybf;
	}
	public void setYbf(String ybf) {
		this.ybf = ybf;
	}
}
